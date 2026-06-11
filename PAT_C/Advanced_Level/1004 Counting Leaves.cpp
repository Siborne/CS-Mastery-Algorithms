#include <iostream>
#include <vector>
#include <queue>
#include <algorithm>

using namespace std;

vector<int> tree[105];
int level[105];
int ans[105];

signed main()
{
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int n, m;
    cin >> n >> m;
    if (n == 0)
    {
        return 0;
    }

    for (int i = 0; i < m; i++)
    {
        int parent, k;
        cin >> parent >> k;
        for (int j = 0; j < k; j++)
        {
            int child;
            cin >> child;
            tree[parent].push_back(child);
        }
    }

    queue<int> q;
    q.push(1);
    level[1] = 1;
    int max_level = 1;

    while (!q.empty())
    {
        int curr = q.front();
        q.pop();

        int curr_level = level[curr];
        max_level = max(max_level, curr_level);

        if (tree[curr].empty())
        {
            ans[curr_level]++;
        }
        else
        {
            for (int child : tree[curr])
            {
                level[child] = curr_level + 1;
                q.push(child);
            }
        }
    }

    for (int i = 1; i <= max_level; i++)
    {
        cout << ans[i];
        if (i != max_level)
        {
            cout << " ";
        }
    }
    cout << "\n";

    return 0;
}