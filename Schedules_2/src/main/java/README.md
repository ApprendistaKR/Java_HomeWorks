 API 명세
 =
---
## 1. 일정(Schedule)API
### 1. 일정 생성
| 항목 | 내용                  |
|:-----|:----------------------|
| URL  | example.com/schedules |
| Method | POST                  |
#### Request (요청)
- Parameter & Querystring
  ```
  none
  ```
- Request headers
  ```
  Content-Type: application/json
  ```
  | 이름 | 데이터타입 | 설명        |
  | :--- |:-----------|:------------|
  | Content-Type | String | 데이터 형식 | 

- Request body
  ```json
  {
   "name": "이름",
   "title": "제목",
   "content": "내용"
  }
   ```
  | 이름 | 데이터타입 | 설명        |
  |:-----|:-----------|:------------|
  | name | String | 작성자 이름 | 
  | title | String | 일정 제목   |
  | content | String | 일정 내용   |
  
#### Response (응답)
- Response header
  ```
  none
  ```
- Response body
  ```json
  {
   "id": 1,
   "name": "이름",
   "title": "제목",
   "content": "내용",
   "createAt": "생성일"
  }
  ```
  | 이름      | 데이터타입    | 설명        |
  |:----------|:--------------|:------------|
  | id        | Long          | 일정 식별자 | 
  | name      | String        | 작성자 이름 | 
  | title     | String        | 일정 제목   |
  | content   | String        | 일정 내용   |
  | createAt  | LocalDateTime | 일정 생성일 |

- XXX 에러응답
  ```json
  {
   "status": 400,
   "error": "Bad Request",
   "message": "잘못된 요청입니다.",
   "path": "/schedule"
  }
  ```
  | 이름     | 데이터타입 | 설명             |
  |:---------|:-----------|:-----------------|
  | status   | Integer    | HTTP 상태코드    | 
  | error    | String     | 에러 종류        | 
  | message  | String     | 에러 상세 메세지 |
  | path     | String     | 요청 경로        |

---
ERD (Entity Relationship Diagram)
=
1. Schedule

| 칼럼 이름 | 데이터타입 | null허용 | key 종류 | 기본 값 | 설명        |
| :--- | :--- | :--- | :--- | :--- |:------------|
| **id** | BIGINT(20) | NOT NULL | PK | AUTO_INCREMENT | 일정 식별자 |
| **name** | VARCHAR(20) | NOT NULL | | | 작성자 이름 |
| **title** | VARCHAR(30) | NOT NULL | | | 일정 제목   |
| **content** | VARCHAR(100) | NULL | | | 일정 내용   |
| **createDate** | DATETIME | NOT NULL | | CURRENT_TIMESTAMP | 일정 생성일 |
| **modifiedDate** | DATETIME | NOT NULL | | ON UPDATE CURRENT_TIMESTAMP | 일정 수정일 |