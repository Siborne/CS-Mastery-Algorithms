#include <iostream>
#include <cmath>

using namespace std;

bool is_prime(int n)
{
    if (n <= 1)
    {
        return false;
    }
    for (int i = 2; i <= sqrt(n); i++)
    {
        if (n % i == 0)
        {
            return false;
        }
    }
    return true;
}

signed main()
{
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int n, d;
    while (cin >> n && n >= 0)
    {
        cin >> d;
        if (!is_prime(n))
        {
            cout << "No\n";
            continue;
        }

        int temp = n;
        int reversed_n = 0;
        while (temp > 0)
        {
            reversed_n = reversed_n * d + (temp % d);
            temp /= d;
        }

        if (is_prime(reversed_n))
        {
            cout << "Yes\n";
        }
        else
        {
            cout << "No\n";
        }
    }

    return 0;
}