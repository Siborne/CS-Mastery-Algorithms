#include <iostream>
#include <string>
#include <algorithm>

using namespace std;

long long char_to_num(char c)
{
    if (c >= '0' && c <= '9')
    {
        return c - '0';
    }
    return c - 'a' + 10;
}

long long to_decimal(string s, long long radix)
{
    long long sum = 0;
    for (char c : s)
    {
        if (sum > 0 && ((9223372036854775807LL) - char_to_num(c)) / radix < sum)
        {
            return -1;
        }
        sum = sum * radix + char_to_num(c);
    }
    return sum;
}

signed main()
{
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    string n1, n2;
    long long tag, radix;
    cin >> n1 >> n2 >> tag >> radix;

    if (tag == 2)
    {
        swap(n1, n2);
    }

    long long target = to_decimal(n1, radix);
    char max_char = *max_element(n2.begin(), n2.end());
    long long low = char_to_num(max_char) + 1;

    long long high = max(low, target) + 1;

    long long ans = -1;

    while (low <= high)
    {
        long long mid = low + ((high - low) >> 1);
        long long current = to_decimal(n2, mid);
        if (current == -1 || current > target)
        {
            high = mid - 1;
        }
        else if (current == target)
        {
            ans = mid;
            high = mid - 1;
        }
        else
        {
            low = mid + 1;
        }
    }

    if (ans != -1)
    {
        cout << ans << "\n";
    }
    else
    {
        cout << "Impossible\n";
    }

    return 0;
}