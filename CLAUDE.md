# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Project Overview

This is a Java competitive programming and algorithm study repository. Every `.java` file is a standalone program with its own `main` method — there are no shared libraries, no inter-file dependencies, and no third-party dependencies (Java standard library only, JDK 8).

## Build & Run

There is no build tool (no Maven, Gradle, Ant). The project uses Eclipse IDE's built-in compiler. To compile and run manually:

```bash
# Compile a single file (from the project root)
javac -d <project>/bin <project>/src/<package>/<File>.java

# Run
java -cp <project>/bin <package>.<File>
```

Example:
```bash
javac -d practiceSpace/bin practiceSpace/src/Day1/Demo1.java
java -cp practiceSpace/bin Day1.Demo1
```

There are no tests, linters, or CI pipelines.

## Project Structure

15 Eclipse sub-projects, organized by source:

| Category | Projects |
|----------|----------|
| OJ & Contests | `codeforces_contest/`, `hdu/`, `lanqiao_contest/`, `luogu_contest/`, `newCoder/`, `pta/`, `chuanzhi/`, `jitiaosai/`, `Robocom/` |
| Courses & Templates | `AlgoTemplate/`, `JavaStudy_ZuoChengYun/` |
| Daily Practice | `practiceSpace/` (Day1–Day149), `matiji/` |

Each project follows Eclipse's `src/` + `bin/` layout, except `chuanzhi/` which has `.java` and `.class` co-located.

## Code Conventions

- **Package names**: flat, match directory names (e.g., `package Day1;`, `package week1.day1;`). No `com.*` or reverse-domain packages.
- **Class naming**: `T1`, `T2`, ... for templates/courses; `Demo`, `Demo1`, ... for practice; platform-specific names for contests.
- **I/O pattern**: `java.util.Scanner` for stdin, `System.out.println` for stdout. Some solutions use `BufferedReader`/`StreamTokenizer` for faster I/O.
- **No shared code**: each file is self-contained. Do not introduce cross-file dependencies.

## Working with This Repo

- Solutions are typically added as new files in existing day/platform directories.
- When adding a solution, follow the existing naming convention for that sub-project.
- Commit messages should follow the rules in `.claude/rules/commit-message.md`.
- Branch/PR workflow is defined in `.claude/rules/branch-pr-workflow.md`.

## .claude/rules

The `.claude/rules/` directory contains project conventions. Key rules:
- `commit-message.md` — commit format (WHY, not WHAT)
- `branch-pr-workflow.md` — branch naming (`feat/`, `fix/`, etc.), rebase-first strategy
- `code-review.md` — review principles (review code not person, actionable suggestions)
- `code-style-declaration.md` — style declaration requirements
- `readme-structure.md` — README funnel order (what → why → how to use → install)
