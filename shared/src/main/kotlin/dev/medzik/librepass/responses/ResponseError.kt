package dev.medzik.librepass.responses

enum class ResponseError(val statusCode: HttpStatus) {
    INVALID_BODY(HttpStatus.BAD_REQUEST),
    INVALID_CREDENTIALS(HttpStatus.UNAUTHORIZED),
    RE_LOGIN_REQUIRED(HttpStatus.UNAUTHORIZED),
    EMAIL_NOT_VERIFIED(HttpStatus.UNAUTHORIZED),
    UNAUTHORIZED(HttpStatus.UNAUTHORIZED),
    NOT_FOUND(HttpStatus.NOT_FOUND),
    TOO_MANY_REQUESTS(HttpStatus.TOO_MANY_REQUESTS),

    // Database errors
    DATABASE_DUPLICATED_KEY(HttpStatus.CONFLICT),
    DATABASE_ERROR(HttpStatus.INTERNAL_SERVER_ERROR),

    UNEXPECTED_SERVER_ERROR(HttpStatus.INTERNAL_SERVER_ERROR)
}

enum class HttpStatus(val code: Int) {
    BAD_REQUEST(400),
    UNAUTHORIZED(401),
    NOT_FOUND(404),
    CONFLICT(409),
    TOO_MANY_REQUESTS(429),
    INTERNAL_SERVER_ERROR(500)
}