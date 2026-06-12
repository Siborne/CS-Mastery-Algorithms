#include <iostream>

using namespace std;

signed main()
{
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int n;
    cin >> n;

    int current_floor = 0;
    int total_time = 0;

    for (int i = 0; i < n; i++)
    {
        int target_floor;
        cin >> target_floor;
        if (target_floor > current_floor)
        {
            total_time += (target_floor - current_floor) * 6;
        }
        else
        {
            total_time += (current_floor - target_floor) * 4;
        }

        total_time += 5;

        current_floor = target_floor;
    }

    cout << total_time << "\n";

    return 0;
}