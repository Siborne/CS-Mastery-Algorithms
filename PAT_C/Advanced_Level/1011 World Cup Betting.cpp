#include <iostream>
#include <iomanip>
#include <algorithm>

using namespace std;

signed main()
{
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    double total_product = 1.0;
    char results[3];

    for (int i = 0; i < 3; i++)
    {
        double w, t, l;
        cin >> w >> t >> l;

        double max_odd = max({w, t, l});
        total_product *= max_odd;

        if (max_odd == w)
        {
            results[i] = 'W';
        }
        else if (max_odd == t)
        {
            results[i] = 'T';
        }
        else
        {
            results[i] = 'L';
        }
    }

    double max_profit = (total_product * 0.65 - 1) * 2;

    cout << results[0] << " " << results[1] << " " << results[2] << " ";
    cout << fixed << setprecision(2) << max_profit << "\n";

    return 0;
}