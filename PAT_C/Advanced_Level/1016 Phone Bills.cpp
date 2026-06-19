#include <iostream>
#include <vector>
#include <string>
#include <algorithm>
#include <iomanip>

using namespace std;

int rate[24];
int day_rate = 0;

struct Record
{
    string name;
    int month, day, hour, minute;
    int total_minutes;
    string status;
};

bool compare_records(const Record &a, const Record &b)
{
    if (a.name != b.name)
    {
        return a.name < b.name;
    }
    return a.total_minutes < b.total_minutes;
}

double calculate_cost_from_zero(int d, int h, int m)
{
    double total = 0;
    total = d * day_rate * 60;
    for (int i = 0; i < h; i++)
    {
        total += rate[i] * 60;
    }
    total += rate[h] * m;
    return total / 100.0;
}

signed main()
{
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    for (int i = 0; i < 24; i++)
    {
        cin >> rate[i];
        day_rate += rate[i];
    }

    int n;
    if (!(cin >> n))
    {
        return 0;
    }

    vector<Record> recs(n);
    for (int i = 0; i < n; i++)
    {
        string time_str;
        cin >> recs[i].name >> time_str >> recs[i].status;
        recs[i].month = stoi(time_str.substr(0, 2));
        recs[i].day = stoi(time_str.substr(3, 2));
        recs[i].hour = stoi(time_str.substr(6, 2));
        recs[i].minute = stoi(time_str.substr(9, 2));

        recs[i].total_minutes = recs[i].day * 24 * 60 + recs[i].hour * 60 + recs[i].minute;
    }

    sort(recs.begin(), recs.end(), compare_records);

    int i = 0;
    while (i < n)
    {
        int next_user_index = i;
        while (next_user_index < n && recs[next_user_index].name == recs[i].name)
        {
            next_user_index++;
        }

        bool has_printed_header = false;
        double total_amount = 0;

        for (int j = i; j < next_user_index - 1; j++)
        {
            if (recs[j].status == "on-line" && recs[j + 1].status == "off-line")
            {
                if (!has_printed_header)
                {
                    cout << recs[i].name << " " << setfill('0') << setw(2) << recs[i].month << "\n";
                    has_printed_header = true;
                }

                int lasting_time = recs[j + 1].total_minutes - recs[j].total_minutes;

                double cost = calculate_cost_from_zero(recs[j + 1].day, recs[j + 1].hour, recs[j + 1].minute) -
                              calculate_cost_from_zero(recs[j].day, recs[j].hour, recs[j].minute);

                total_amount += cost;

                cout << setfill('0') << setw(2) << recs[j].day << ":"
                     << setw(2) << recs[j].hour << ":" << setw(2) << recs[j].minute << " "
                     << setw(2) << recs[j + 1].day << ":"
                     << setw(2) << recs[j + 1].hour << ":" << setw(2) << recs[j + 1].minute << " "
                     << lasting_time << " $" << fixed << setprecision(2) << cost << "\n";
            }
        }

        if (has_printed_header)
        {
            cout << "Total amount: $" << fixed << setprecision(2) << total_amount << "\n";
        }

        i = next_user_index;
    }

    return 0;
}