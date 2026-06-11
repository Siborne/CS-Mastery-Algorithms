#include <iostream>
#include <string>

using namespace std;

signed main()
{
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int m;
    cin >> m;

    string min_time = "23:59:59";
    string max_time = "00:00:00";

    string unlock_id = "";
    string lock_id = "";

    for (int i = 0; i < m; i++)
    {
        string id, sign_in, sign_out;
        cin >> id >> sign_in >> sign_out;

        if (sign_in < min_time)
        {
            unlock_id = id;
            min_time = sign_in;
        }

        if (sign_out > max_time)
        {
            lock_id = id;
            max_time = sign_out;
        }
    }

    cout << unlock_id << " " << lock_id << "\n";

    return 0;
}