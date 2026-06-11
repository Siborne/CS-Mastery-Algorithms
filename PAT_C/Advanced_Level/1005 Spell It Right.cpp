#include <iostream>
#include <string>

using namespace std;

const string english_words[] = {
    "zero", "one", "two", "three", "four",
    "five", "six", "seven", "eight", "nine"};

int get_digit_sum(string s)
{
    int sum = 0;
    for (char c : s)
    {
        sum += (c - '0');
    }
    return sum;
}

signed main()
{
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    string s;
    cin >> s;
    int digit_sum = get_digit_sum(s);

    string digit_sum_str = to_string(digit_sum);

    for (int i = 0; i < digit_sum_str.length(); i++)
    {
        int digit = digit_sum_str[i] - '0';
        cout << english_words[digit];

        if (i != digit_sum_str.length() - 1)
        {
            cout << " ";
        }
    }
    cout << "\n";

    return 0;
}