#include <iostream>
#include <vector>
#include <queue>
#include <iomanip>

using namespace std;

const int MAXN = 1e3 + 5;

int processing_time[MAXN];
int end_time[MAXN];

struct Windows
{
    queue<int> q;
    int next_free_time = 0;
};

signed main()
{
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int n, m, k, q;
    if (!(cin >> n >> m >> k >> q))
    {
        return 0;
    }

    for (int i = 1; i <= k; i++)
    {
        cin >> processing_time[i];
    }

    vector<Windows> windows(n);
    int customer_idx = 1;

    for (int i = 0; i < m; i++)
    {
        for (int j = 0; j < n; j++)
        {
            if (customer_idx <= k)
            {
                end_time[customer_idx] = windows[j].next_free_time + processing_time[customer_idx];
                windows[j].next_free_time = end_time[customer_idx];

                windows[j].q.push(customer_idx);
                customer_idx++;
            }
        }
    }

    while (customer_idx <= k)
    {
        int min_pop_time = 1e9;
        int target_window = -1;

        for (int j = 0; j < n; j++)
        {
            if (!windows[j].q.empty())
            {
                int front_customer = windows[j].q.front();
                if (end_time[front_customer] < min_pop_time)
                {
                    min_pop_time = end_time[front_customer];
                    target_window = j;
                }
            }
        }

        windows[target_window].q.pop();

        end_time[customer_idx] = windows[target_window].next_free_time + processing_time[customer_idx];
        windows[target_window].next_free_time = end_time[customer_idx];

        windows[target_window].q.push(customer_idx);
        customer_idx++;
    }

    for (int i = 0; i < q; i++)
    {
        int query_id;
        cin >> query_id;

        int start_time = end_time[query_id] - processing_time[query_id];

        if (start_time >= 540)
        {
            cout << "Sorry\n";
        }
        else
        {
            int hour = 8 + end_time[query_id] / 60;
            int minute = end_time[query_id] % 60;
            cout << setfill('0') << setw(2) << hour << ":" << setfill('0') << setw(2) << minute << "\n";
        }
    }

    return 0;
}