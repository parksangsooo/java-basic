package algorithm;

import java.util.Stack;

public class DFSExample {
    /*
    변수(dx 및 dy): 이 배열은 행(dx)과 열(dy) 측면에서 가능한 이동을 정의하여 위, 아래, 왼쪽, 오른쪽으로의 이동을 용이하게 합니다.
dfsStack 방법: 이 방법은 스택을 사용하여 깊이 우선 검색을 구현합니다. 시작점부터 반복적으로 탐색하여 방문한 것으로 표시하고 이동에 유효한 이웃하고 방문하지 않은 노드를 스택으로 푸시합니다.
stack: 다음에 방문할 노드를 추적하는 데 사용됩니다. 깊이 우선 탐색 전략의 기본인 LIFO(Last In First Out) 원칙을 기반으로 노드를 추가하고 제거합니다.
visited: 방문한 노드를 추적하여 각 노드를 한 번만 방문하고 무한 루프를 방지하는 부울 배열입니다.
grid: 탐색 중인 그래프 또는 영역을 나타냅니다. 여기서 '1'은 통과 가능한 노드를 나타내고 '0'은 장벽을 나타냅니다.
     */

    // 방향 벡터: 위, 아래, 왼쪽, 오른쪽 탐색에 사용
    private static final int[] dx = {-1, 1, 0, 0}; // dx 배열은 행의 이동을 나타냄
    private static final int[] dy = {0, 0, -1, 1}; // dy 배열은 열의 이동을 나타냄

    // DFS 알고리즘을 스택을 사용해 구현하는 메소드
    public static void dfsStack(int x, int y, boolean[][] visited, int[][] grid) {
        Stack<int[]> stack = new Stack<>(); // 스택 초기화, 탐색할 위치를 저장
        stack.push(new int[]{x, y}); // 시작 위치를 스택에 추가
        visited[x][y] = true; // 시작 위치 방문 처리

        while (!stack.isEmpty()) { // 스택이 비어있지 않은 동안 반복
            int[] current = stack.pop(); // 스택에서 하나의 위치를 꺼냄
            x = current[0]; // 현재 x 좌표
            y = current[1]; // 현재 y 좌표
            System.out.println("방문 위치: (" + x + ", " + y + ")"); // 방문한 위치 출력

            // 현재 위치에서 4방향 탐색
            for (int d = 0; d < 4; d++) {
                int nx = x + dx[d]; // 다음 x 좌표 계산
                int ny = y + dy[d]; // 다음 y 좌표 계산

                // 배열 범위를 벗어나지 않고, 방문하지 않았으며, 탐색 가능한 위치(1)인 경우
                if (0 <= nx && nx < grid.length && 0 <= ny && ny < grid[0].length && !visited[nx][ny] && grid[nx][ny] == 1) {
                    stack.push(new int[]{nx, ny}); // 스택에 다음 위치 추가
                    visited[nx][ny] = true; // 다음 위치를 방문 처리
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] grid = { // 2차원 배열 그리드: 1은 탐색 가능, 0은 탐색 불가
                {1, 1, 1, 1},
                {1, 0, 1, 1},
                {0, 1, 1, 0},
                {0, 1, 1, 1},
        };

        boolean[][] visited = new boolean[grid.length][grid[0].length]; // 방문한 위치를 기록하는 배열

        // 예제로, (0, 0)에서 탐색 시작
        dfsStack(0, 0, visited, grid);
    }
}
