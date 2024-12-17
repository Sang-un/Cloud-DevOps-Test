# 베이스 이미지 설정
FROM python:3.9-slim

# 작업 디렉터리 설정
WORKDIR /app

# 필요한 파일 복사
COPY . /app

# requirements.txt 파일 복사 및 패키지 설치
COPY requirements.txt requirements.txt
RUN pip install --no-cache-dir -r requirements.txt

# Flask 애플리케이션 실행
CMD ["gunicorn", "--bind", "0.0.0.0:5000", "app:app"]
