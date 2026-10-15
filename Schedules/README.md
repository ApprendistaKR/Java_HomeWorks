## API 명세서
1. 일정 생성
- Request
  - Method: POST
  - URL: /schedules
  - Content-Type: application/json
  - Body: json
  ```
  "title": "일정 제목"
  "content": "일정 내용"
  "username": "작성자명"
  "password": "비밀번호"

- Response
 - Status : Created
 - Body: json
  ```
  "id": "일정의 고유 id값"
  "title": "일정 제목"
  "content": "일정 내용"
  "username": "작성자명"
  "date": "생성 날짜"
```
2. 일정 조회
- Request
  - Method: Get
  - URL: /schedules
  - Content-Type: application/json
  - Body: json
  ```
  "title": "일정 제목"
  "content": "일정 내용"
  "username": "작성자명"
  "password": "비밀번호"

- Response
  - Status : OK
  - Body: json
  ```
  "Id": "일정의 고유 id값"
  "title": "일정 제목"
  "content": "일정 내용"
  "username": "작성자명"
  "date": "생성/수정 날짜"
  ```
3. 일정 수정
- Request
  - Method: Patch
  - URL: /schedules/{id}
  - Path Parameters:
    - id: 수정할 일정의 고유 ID
  - Content-Type: application/json
  - Body: json
  ```
  "title": "일정 제목"
  "username": "작성자명"

- Response
  - Status : OK
  - Body: json
  ```
  "Id": "ID값"
  "title": "일정 제목"
  "username": "작성자명"
  "password": "비밀번호"
  "date": "수정 날짜"
  ```
4. 일정 삭제
- Request
  - Method: Delete
  - URL: /schedules/{id}
  - Path Parameters: 
    - id: 삭제할 일정의 고유 ID 
  - Content-Type: application/json
  - Body: json
  ```
  "title": "일정 제목"
  "username": "작성자명"
  "password": "비밀번호"

- Response
  - Status : Delete
---
## ERD
- 일정

| NAME     | TYPE         |
|:---------|:-------------|
| id 🔑    | BIGINT       |
| title    | VARCHAR(50)  |
| content  | VARCHAR(100) |
| username | VARCHAR(20)  |
| password | VARCHAR(15)  |
| date     | DATETIME     |