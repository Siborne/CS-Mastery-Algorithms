#include <iostream>
#include <string>

using namespace std;

signed main()
{
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int a, b;
    cin >> a >> b;
    int sum = a + b;
    string s = to_string(sum);
    int len = s.length();

    for (int i = 0; i < len; i++)
    {
        cout << s[i];
        if (s[i] != '-' && i != len - 1 && (len - 1 - i) % 3 == 0)
        {
            cout << ",";
        }
    }

    cout << "\n";
    return 0;
}