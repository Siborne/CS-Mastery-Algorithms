#include <iostream>
#include <vector>

using namespace std;

signed main()
{
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int k;
    cin >> k;

    vector<int> v(k);
    bool all_negative = true;
    for (int i = 0; i < k; i++)
    {
        cin >> v[i];
        if (v[i] >= 0)
        {
            all_negative = false;
        }
    }

    if (all_negative)
    {
        cout << 0 << " " << v[0] << " " << v[k - 1] << "\n";
        return 0;
    }

    int max_sum = -1;
    int current_sum = 0;

    int temp_start = 0;
    int best_start = 0;
    int best_end = 0;

    for (int i = 0; i < k; i++)
    {
        current_sum += v[i];

        if (current_sum > max_sum)
        {
            max_sum = current_sum;
            best_start = v[temp_start];
            best_end = v[i];
        }

        if (current_sum < 0)
        {
            current_sum = 0;
            temp_start = i + 1;
        }
    }

    cout << max_sum << " " << best_start << " " << best_end << "\n";

    return 0;
}
