 API 명세
 =
---
## 일정(Schedule)API
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
   "id": 1
  }
  ```
  | 이름      | 데이터타입    | 설명        |
  |:----------|:--------------|:------------|
  | id        | Long          | 일정 식별자 | 
  

- XXX 에러응답
  ```json
  {
   "status": 400,
   "error": "Bad Request",
   "message": "잘못된 요청입니다.",
   "path": "/schedules"
  }
  ```
  | 이름     | 데이터타입 | 설명             |
  |:---------|:-----------|:-----------------|
  | status   | Integer    | HTTP 상태코드    | 
  | error    | String     | 에러 종류        | 
  | message  | String     | 에러 상세 메세지 |
  | path     | String     | 요청 경로        |

### 2. 일정 목록 조회
 
| 항목 | 내용                  |
|:-----|:----------------------|
| URL  | example.com/schedules |
| Method | GET                   |

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

#### Response (응답)
- Response header
  ```
  none
  ```
  Response body
  ```json
  [
    {
     "id": 1,
     "name": "이름",
     "title": "제목",
     "content": "내용",
     "createdAt": "생성일시",
     "modifiedAt": "수정일시"
    },
    {
     "id": 2,
     "name": "이름",
     "title": "제목",
     "content": "내용",
     "createdAt": "생성일시",
     "modifiedAt": "수정일시"
    }
   ]
   ```
  | 이름       | 데이터타입     | 설명        |
  |:-----------|:---------------|:------------|
  | id         | Long           | 일정 식별자 |
  | name       | String         | 작성자 이름 |
  | title      | String         | 일정 제목   |
  | content    | String         | 일정 내용   |
  | createdAt  | LocalDateTime  | 일정 생성일 |
  | modifiedAt | LocalDateTime  | 일정 수정일 |

- XXX 에러응답
  ```json
  {
   "status": 400,
   "error": "Bad Request",
   "message": "잘못된 요청입니다.",
   "path": "/schedules"
  }
  ```
  | 이름     | 데이터타입 | 설명             |
  |:---------|:-----------|:-----------------|
  | status   | Integer    | HTTP 상태코드    | 
  | error    | String     | 에러 종류        | 
  | message  | String     | 에러 상세 메세지 |
  | path     | String     | 요청 경로        |

### 3. 일정 단건 조회

| 항목 | 내용                               |
|:-----|:-----------------------------------|
| URL  | example.com/schedules/{scheduleId} |
| Method | GET                                |

 #### Request (요청)

- Parameter & Querystring
  ```
  /schedules/{scheduleId}
  ```
  | 이름       | 데이터타입 | 설명         |
  |:-----------|:-----------|:-------------|
  | scheduleId | Long       | 일정 식별자  | 

- Request headers
  ```
  Content-Type: application/json
  ```
  | 이름 | 데이터타입 | 설명        |
  | :--- |:-----------|:------------|
  | Content-Type | String | 데이터 형식 | 

#### Response (응답)
- Response header
  ```
  none
  ```
  Response body
  ```json
 
   {
    "id": 1,
    "name": "이름",
    "title": "제목",
    "content": "내용",
    "createdAt": "생성일시",
    "modifiedAt": "수정일시"
    }

   ```
  | 이름       | 데이터타입     | 설명        |
  |:-----------|:---------------|:------------|
  | id         | Long           | 일정 식별자 |
  | name       | String         | 작성자 이름 |
  | title      | String         | 일정 제목   |
  | content    | String         | 일정 내용   |
  | createdAt  | LocalDateTime  | 일정 생성일 |
  | modifiedAt | LocalDateTime  | 일정 수정일 |

- XXX 에러응답
  ```json
  {
   "status": 400,
   "error": "Bad Request",
   "message": "잘못된 요청입니다.",
   "path": "/schedules/{scheduleId}"
  }
  ```
  | 이름     | 데이터타입 | 설명             |
  |:---------|:-----------|:-----------------|
  | status   | Integer    | HTTP 상태코드    | 
  | error    | String     | 에러 종류        | 
  | message  | String     | 에러 상세 메세지 |
  | path     | String     | 요청 경로        |

### 4. 일정 수정
| 항목 | 내용                               |
|:-----|:-----------------------------------|
| URL  | example.com/schedules/{scheduleId} |
| Method | PUT                                |
#### Request (요청)
- Parameter & Querystring
  ```
   /schedules/{scheduleId}
  ```
  | 이름       | 데이터타입 | 설명         |
  |:-----------|:-----------|:-------------|
  | scheduleId | Long       | 일정 식별자  | 

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
    "createdAt": "생성일시",
    "modifiedAt": "수정일시"
    }

   ```
  | 이름       | 데이터타입     | 설명               |
  |:-----------|:---------------|:-------------------|
  | id         | Long           | 일정 식별자        |
  | name       | String         | 수정한 작성자 이름 |
  | title      | String         | 수정된 일정 제목   |
  | content    | String         | 수정된 일정 내용   |
  | createdAt  | LocalDateTime  | 일정 생성일        |
  | modifiedAt | LocalDateTime  | 일정 수정일        |

- XXX 에러응답
  ```json
  {
   "status": 400,
   "error": "Bad Request",
   "message": "잘못된 요청입니다.",
   "path": "/schedules/{scheduleId}"
  }
  ```
  | 이름     | 데이터타입 | 설명             |
  |:---------|:-----------|:-----------------|
  | status   | Integer    | HTTP 상태코드    | 
  | error    | String     | 에러 종류        | 
  | message  | String     | 에러 상세 메세지 |
  | path     | String     | 요청 경로        |

### 5. 일정 석제
| 항목 | 내용                               |
|:-----|:-----------------------------------|
| URL  | example.com/schedules/{scheduleId} |
| Method | DELETE                             |
#### Request (요청)
- Parameter & Querystring
  ```
   /schedules/{scheduleId}
  ```
  | 이름       | 데이터타입 | 설명         |
  |:-----------|:-----------|:-------------|
  | scheduleId | Long       | 일정 식별자  | 

- Request headers
  ```
  Content-Type: application/json
  ```
  | 이름 | 데이터타입 | 설명        |
  | :--- |:-----------|:------------|
  | Content-Type | String | 데이터 형식 | 

- Request body
  ```
  none
   ```
  
#### Response (응답)
- Response header
  ```
  none
  ```
- Response body
   ```
   none
   ```
  
- XXX 에러응답
  ```json
  {
   "status": 400,
   "error": "Bad Request",
   "message": "잘못된 요청입니다.",
   "path": "/schedules/{scheduleId}"
  }
  ```
  | 이름     | 데이터타입 | 설명             |
  |:---------|:-----------|:-----------------|
  | status   | Integer    | HTTP 상태코드    | 
  | error    | String     | 에러 종류        | 
  | message  | String     | 에러 상세 메세지 |
  | path     | String     | 요청 경로        |


## 유저(User)API
### 1. 유저 생성
| 항목 | 내용              |
|:-----|:------------------|
| URL  | example.com/users |
| Method | POST              |
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
   "email": "e메일 주소"
  }
   ```
  | 이름 | 데이터타입 | 설명       |
  |:-----|:-----------|:-----------|
  | name | String | 유저 이름  | 
  | email   | String | e메일 주소 |
  
#### Response (응답)
- Response header
  ```
  none
  ```
- Response body
  ```json
  {
   "id": 1
  }
  ```
  | 이름      | 데이터타입    | 설명        |
  |:----------|:--------------|:------------|
  | id        | Long          | 유저 식별자 | 


- XXX 에러응답
  ```json
  {
   "status": 400,
   "error": "Bad Request",
   "message": "잘못된 요청입니다.",
   "path": "/users"
  }
  ```
  | 이름     | 데이터타입 | 설명             |
  |:---------|:-----------|:-----------------|
  | status   | Integer    | HTTP 상태코드    | 
  | error    | String     | 에러 종류        | 
  | message  | String     | 에러 상세 메세지 |
  | path     | String     | 요청 경로        |

### 2. 유저 목록 조회

| 항목 | 내용              |
|:-----|:------------------|
| URL  | example.com/users |
| Method | GET               |

#### Request (요청)
- Parameter & Querystring
  ```
  none
  ```
- Request headers
  ```
  Content-Type: application/json
  ```
  | 이름 | 데이터타입 | 설명         |
  | :--- |:-----------|:-------------|
  | Content-Type | String | 데이터 형식  | 

#### Response (응답)
- Response header
  ```
  none
  ```
  Response body
  ```json
  [
    {
     "id": 1,
     "name": "이름",
     "email": "e메일 주소",
     "createdAt": "생성일시",
     "modifiedAt": "수정일시"
    },
    {
     "id": 2,
     "name": "이름",
     "email": "e메일 주소",
     "createdAt": "생성일시",
     "modifiedAt": "수정일시"
    }
   ]
   ```
  | 이름       | 데이터타입     | 설명        |
  |:-----------|:---------------|:------------|
  | id         | Long           | 유저 식별자 |
  | name       | String         | 유저 이름   |
  | email      | String         | e메일 주소  |
  | createdAt  | LocalDateTime  | 유저 생성일 |
  | modifiedAt | LocalDateTime  | 유저 수정일 |

-  에러응답
  ```json
  {
   "status": 400,
   "error": "Bad Request",
   "message": "잘못된 요청입니다.",
   "path": "/user"
  }
  ```
  | 이름     | 데이터타입 | 설명             |
  |:---------|:-----------|:-----------------|
  | status   | Integer    | HTTP 상태코드    | 
  | error    | String     | 에러 종류        | 
  | message  | String     | 에러 상세 메세지 |
  | path     | String     | 요청 경로        |

### 3. 유저 단건 조회

| 항목 | 내용                       |
|:-----|:---------------------------|
| URL  | example.com/users/{userId} |
| Method | GET                        |

#### Request (요청)

- Parameter & Querystring
  ```
  /users/{userId}
  ```
  | 이름   | 데이터타입 | 설명        |
  |:-------|:-----------|:------------|
  | userId | Long       | 유저 식별자 | 

- Request headers
  ```
  Content-Type: application/json
  ```
  | 이름 | 데이터타입 | 설명        |
  | :--- |:-----------|:------------|
  | Content-Type | String | 데이터 형식 | 

#### Response (응답)
- Response header
  ```
  none
  ```
  Response body
  ```json
 
   {
    "id": 1,
    "name": "이름",
    "email": "e메일 주소",
    "createdAt": "생성일시",
    "modifiedAt": "수정일시"
    }

   ```
  | 이름       | 데이터타입     | 설명        |
  |:-----------|:---------------|:------------|
  | id         | Long           | 유저 식별자 |
  | name       | String         | 유저 이름   |
  | email      | String         | e메일  주소 |
  | createdAt  | LocalDateTime  | 유저 생성일 |
  | modifiedAt | LocalDateTime  | 유저 수정일 |

- 에러응답
  ```json
  {
   "status": 400,
   "error": "Bad Request",
   "message": "잘못된 요청입니다.",
   "path": "/users/{userId}"
  }
  ```
  | 이름     | 데이터타입 | 설명             |
  |:---------|:-----------|:-----------------|
  | status   | Integer    | HTTP 상태코드    | 
  | error    | String     | 에러 종류        | 
  | message  | String     | 에러 상세 메세지 |
  | path     | String     | 요청 경로        |

### 4. 유저 수정
| 항목 | 내용                       |
|:-----|:---------------------------|
| URL  | example.com/users/{userId} |
| Method | PUT                        |
#### Request (요청)
- Parameter & Querystring
  ```
   /users/{userId}
  ```
  | 이름   | 데이터타입 | 설명        |
  |:-------|:-----------|:------------|
  | userId | Long       | 유저 식별자 | 

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
   "email": "e메일"
  }
   ```
  | 이름  | 데이터타입 | 설명       |
  |:------|:-----------|:-----------|
  | name  | String | 유저 이름  | 
  | email | String | e메일 주소 |

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
    "email": "e메일 주소",
    "createdAt": "생성일시",
    "modifiedAt": "수정일시"
    }

   ```
  | 이름       | 데이터타입     | 설명              |
  |:-----------|:---------------|:------------------|
  | id         | Long           | 유저 식별자       |
  | name       | String         | 수정된 유저 이름  |
  | email      | String         | 수정된 e메일 주소 |
  | createdAt  | LocalDateTime  | 유저 생성일       |
  | modifiedAt | LocalDateTime  | 유저 수정일       |

- 에러응답
  ```json
  {
   "status": 400,
   "error": "Bad Request",
   "message": "잘못된 요청입니다.",
   "path": "/user/{userId}"
  }
  ```
  | 이름     | 데이터타입 | 설명             |
  |:---------|:-----------|:-----------------|
  | status   | Integer    | HTTP 상태코드    | 
  | error    | String     | 에러 종류        | 
  | message  | String     | 에러 상세 메세지 |
  | path     | String     | 요청 경로        |

### 5. 일정 석제
| 항목 | 내용                       |
|:-----|:---------------------------|
| URL  | example.com/users/{userId} |
| Method | DELETE                     |
#### Request (요청)
- Parameter & Querystring
  ```
   /users/{userId}
  ```
  | 이름   | 데이터타입 | 설명        |
  |:-------|:-----------|:------------|
  | userId | Long       | 유저 식별자 | 

- Request headers
  ```
  Content-Type: application/json
  ```
  | 이름 | 데이터타입 | 설명        |
  | :--- |:-----------|:------------|
  | Content-Type | String | 데이터 형식 | 

- Request body
  ```
  none
   ```

#### Response (응답)
- Response header
  ```
  none
  ```
- Response body
   ```
   none
   ```

- 에러응답
  ```json
  {
   "status": 400,
   "error": "Bad Request",
   "message": "잘못된 요청입니다.",
   "path": "/users/{userId}"
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
1. Schedules

| 칼럼 이름         | 데이터타입 | null허용 | key 종류 | 기본 값                     | 설명                    |
|:------------------| :--- |:---------| :--- |:----------------------------|:------------------------|
| **id**            | BIGINT(20) | NOT NULL | PK | AUTO_INCREMENT              | 일정 식별자             |
| **name**          | VARCHAR(20) | NOT NULL | |                             | 작성자 이름             |
| **title**         | VARCHAR(30) | NOT NULL | |                             | 일정 제목               |
| **content**       | VARCHAR(100) | NULL     | |                             | 일정 내용               |
| **create_date**   | DATETIME | NOT NULL | | CURRENT_TIMESTAMP           | 일정 생성일             |
| **modified_date** | DATETIME | NOT NULL | | ON UPDATE CURRENT_TIMESTAMP | 일정 수정일             |
| **is_delete**     | TINYINT(1) | NOT NULL | | 0                           | 0: 삭제 안됨, 1: 삭제됨 |

2. Users

| 칼럼 이름         | 데이터타입 | null허용 | key 종류 | 기본 값                     | 설명                    |
|:------------------| :--- |:---------| :--- |:----------------------------|:------------------------|
| **id**            | BIGINT(20) | NOT NULL | PK | AUTO_INCREMENT              | 유저 식별자             |
| **name**          | VARCHAR(20) | NOT NULL | |                             | 유저 이름               |
| **email**         | VARCHAR(30) | NOT NULL | |                             | email  주소             |
| **create_date**   | DATETIME | NOT NULL | | CURRENT_TIMESTAMP           | 유저 생성일             |
| **modified_date** | DATETIME | NOT NULL | | ON UPDATE CURRENT_TIMESTAMP | 유저 수정일             |
| **is_delete**     | TINYINT(1) | NOT NULL | | 0                           | 0: 삭제 안됨, 1: 삭제됨 |