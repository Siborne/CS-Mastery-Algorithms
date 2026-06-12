#include <iostream>
#include <iomanip>
#include <cmath>
#include <vector>

struct Term
{
    int exp;
    double coef;
};

const int MAXN = 2e3 + 5;

double ans_poly[MAXN] = {0.0};

using namespace std;

signed main()
{
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int k1;
    cin >> k1;
    vector<Term> polyA(k1);
    for (int i = 0; i < k1; i++)
    {
        cin >> polyA[i].exp >> polyA[i].coef;
    }

    int k2;
    cin >> k2;
    for (int i = 0; i < k2; i++)
    {
        int expB;
        double coefB;
        cin >> expB >> coefB;

        for (int j = 0; j < k1; j++)
        {
            int new_exp = expB + polyA[j].exp;
            double new_coef = coefB * polyA[j].coef;
            ans_poly[new_exp] += new_coef;
        }
    }

    int count = 0;
    for (int i = 0; i < MAXN; i++)
    {
        if (abs(ans_poly[i]) > 1e-6)
        {
            count++;
        }
    }

    cout << count;

    for (int i = MAXN - 1; i >= 0; i--)
    {
        if (abs(ans_poly[i]) > 1e-6)
        {
            cout << " " << i << " " << fixed << setprecision(1) << ans_poly[i];
        }
    }

    return 0;
}