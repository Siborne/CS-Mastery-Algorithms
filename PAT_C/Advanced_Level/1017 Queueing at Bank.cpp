#include <iostream>
#include <vector>
#include <string>
#include <algorithm>
#include <iomanip>

using namespace std;

struct Customer
{
    int arrive_time;
    int processing_time;
};

bool compare_customers(const Customer &a, const Customer &b)
{
    return a.arrive_time < b.arrive_time;
}

signed main()
{
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int n, k;
    if (!(cin >> n >> k))
    {
        return 0;
    }

    vector<Customer> valid_customers;
    int start_bank = 8 * 3600;
    int end_bank = 17 * 3600;

    for (int i = 0; i < n; i++)
    {
        string time_str;
        int p;
        cin >> time_str >> p;

        int h = stoi(time_str.substr(0, 2));
        int m = stoi(time_str.substr(3, 2));
        int s = stoi(time_str.substr(6, 2));
        int arrive = h * 3600 + m * 60 + s;

        if (arrive > end_bank)
        {
            continue;
        }

        if (p > 60)
        {
            p = 60;
        }

        valid_customers.push_back({arrive, p * 60});
    }

    if (valid_customers.empty())
    {
        cout << "0.0\n";
        return 0;
    }
    sort(valid_customers.begin(), valid_customers.end(), compare_customers);

    vector<int> windows(k, start_bank);
    long long total_wait_time = 0;

    for (const auto &customer : valid_customers)
    {
        auto min_window_iter = min_element(windows.begin(), windows.end());

        if (customer.arrive_time < *min_window_iter)
        {
            total_wait_time += (*min_window_iter - customer.arrive_time);
            *min_window_iter += customer.processing_time;
        }
        else
        {
            *min_window_iter = customer.arrive_time + customer.processing_time;
        }
    }

    double avg_wait_minutes = (double)total_wait_time / 60.0 / valid_customers.size();
    cout << fixed << setprecision(1) << avg_wait_minutes << "\n";

    return 0;
}
