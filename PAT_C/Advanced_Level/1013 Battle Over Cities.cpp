#include <iostream>
#include <vector>
#include <numeric>

using namespace std;

struct Edge
{
    int u, v;
};

struct DSU
{
    vector<int> parent;
    vector<int> size;

    DSU(int n)
    {
        parent.resize(n + 1);
        size.assign(n + 1, 1);
        iota(parent.begin(), parent.end(), 0);
    }

    int find_set(int v)
    {
        if (v != parent[v])
        {
            parent[v] = find_set(parent[v]);
        }
        return parent[v];
    }

    void union_sets(int a, int b)
    {
        a = find_set(a);
        b = find_set(b);
        if (a == b)
        {
            return;
        }
        if (size[a] < size[b])
        {
            swap(a, b);
        }
        parent[b] = a;
        size[a] += size[b];
    }
};

signed main()
{
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int n, m, k;
    if (!(cin >> n >> m >> k))
    {
        return 0;
    }

    vector<Edge> edges(m);
    for (int i = 0; i < m; i++)
    {
        cin >> edges[i].u >> edges[i].v;
    }

    for (int q = 0; q < k; q++)
    {
        int lost_city;
        cin >> lost_city;

        DSU dsu(n);

        for (const auto &edge : edges)
        {
            if (edge.u == lost_city || edge.v == lost_city)
            {
                continue;
            }
            dsu.union_sets(edge.u, edge.v);
        }

        int components = 0;
        for (int i = 1; i <= n; i++)
        {
            if (i == lost_city)
            {
                continue;
            }

            if (dsu.parent[i] == i)
            {
                components++;
            }
        }

        cout << components - 1 << "\n";
    }

    return 0;
}