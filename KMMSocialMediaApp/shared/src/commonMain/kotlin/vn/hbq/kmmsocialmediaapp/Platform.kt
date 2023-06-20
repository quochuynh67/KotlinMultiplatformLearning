package vn.hbq.kmmsocialmediaapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform