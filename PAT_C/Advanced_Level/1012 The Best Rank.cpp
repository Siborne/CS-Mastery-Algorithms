#include <iostream>
#include <string>
#include <vector>
#include <algorithm>
#include <unordered_map>

using namespace std;

struct Student
{
    string id;
    int grade[4];
    int rank[4];
};

int current_subject = 0;

bool compare_students(const Student &a, const Student &b)
{
    return a.grade[current_subject] > b.grade[current_subject];
}

signed main()
{
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int n, m;
    if (!(cin >> n >> m))
    {
        return 0;
    }

    vector<Student> students(n);
    char subject_symbol[4] = {'A', 'C', 'M', 'E'};

    for (int i = 0; i < n; i++)
    {
        cin >> students[i].id >> students[i].grade[1] >> students[i].grade[2] >> students[i].grade[3];
        students[i].grade[0] = students[i].grade[1] + students[i].grade[2] + students[i].grade[3];
    }

    for (current_subject = 0; current_subject < 4; current_subject++)
    {
        sort(students.begin(), students.end(), compare_students);
        students[0].rank[current_subject] = 1;

        for (int i = 1; i < n; i++)
        {
            if (students[i].grade[current_subject] == students[i - 1].grade[current_subject])
            {
                students[i].rank[current_subject] = students[i - 1].rank[current_subject];
            }
            else
            {
                students[i].rank[current_subject] = i + 1;
            }
        }
    }

    unordered_map<string, int> id_to_index;
    for (int i = 0; i < n; i++)
    {
        id_to_index[students[i].id] = i;
    }

    for (int i = 0; i < m; i++)
    {
        string query_id;
        cin >> query_id;

        if (id_to_index.find(query_id) == id_to_index.end())
        {
            cout << "N/A\n";
        }
        else
        {
            int idx = id_to_index[query_id];
            int best_subject_idx = 0;
            int best_rank = students[idx].rank[0];

            for (int sub = 1; sub < 4; sub++)
            {
                if (students[idx].rank[sub] < best_rank)
                {
                    best_rank = students[idx].rank[sub];
                    best_subject_idx = sub;
                }
            }
            cout << best_rank << " " << subject_symbol[best_subject_idx] << "\n";
        }
    }

    return 0;
}