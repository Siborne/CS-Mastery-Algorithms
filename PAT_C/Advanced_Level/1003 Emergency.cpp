#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

const int INF = 1e9;

signed main()
{
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int n, m, c1, c2;
    cin >> n >> m >> c1 >> c2;

    vector<int> weight(n);
    for (int i = 0; i < n; i++)
    {
        cin >> weight[i];
    }

    vector<vector<int>> graph(n, vector<int>(n, INF));
    for (int i = 0; i < m; i++)
    {
        int u, v, l;
        cin >> u >> v >> l;
        graph[u][v] = graph[v][u] = min(graph[u][v], l);
    }

    vector<int> dist(n, INF);
    vector<int> teams(n, 0);
    vector<int> num_paths(n, 0);
    vector<bool> visited(n, false);

    dist[c1] = 0;
    teams[c1] = weight[c1];
    num_paths[c1] = 1;

    for (int i = 0; i < n; i++)
    {
        int u = -1;
        int min_d = INF;
        for (int j = 0; j < n; j++)
        {
            if (!visited[j] && dist[j] < min_d)
            {
                min_d = dist[j];
                u = j;
            }
        }

        if (u == -1)
        {
            break;
        }
        visited[u] = true;

        for (int v = 0; v < n; v++)
        {
            if (!visited[v] && graph[u][v] != INF)
            {
                if (dist[u] + graph[u][v] < dist[v])
                {
                    dist[v] = dist[u] + graph[u][v];
                    num_paths[v] = num_paths[u];
                    teams[v] = teams[u] + weight[v];
                }
                else if (dist[u] + graph[u][v] == dist[v])
                {
                    num_paths[v] += num_paths[u];
                    if (teams[u] + weight[v] > teams[v])
                    {
                        teams[v] = teams[u] + weight[v];
                    }
                }
            }
        }
    }

    cout << num_paths[c2] << " " << teams[c2] << "\n";

    return 0;
}