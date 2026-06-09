#include <iostream>
#include <iomanip>
#include <cmath>

using namespace std;

double poly[1005] = {0.0};

signed main()
{
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int k;
    if (cin >> k)
    {
        for (int i = 0; i < k; i++)
        {
            int exp;
            double coef;
            cin >> exp >> coef;
            poly[exp] += coef;
        }
    }

    if (cin >> k)
    {
        for (int i = 0; i < k; i++)
        {
            int exp;
            double coef;
            cin >> exp >> coef;
            poly[exp] += coef;
        }
    }

    int cnt = 0;
    for (int i = 0; i <= 1000; i++)
    {
        if (abs(poly[i]) > 1e-6)
        {
            cnt++;
        }
    }

    cout << cnt;

    for (int i = 1000; i >= 0; i--)
    {
        /* code */
        if (abs(poly[i]) > 1e-6)
        {
            cout << " " << i << " " << fixed << setprecision(1) << poly[i];
        }
    }

    cout << "\n";

    return 0;
}