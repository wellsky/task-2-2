fun main() {
    val post = WallService.add(Post(
        ownerId = 11,
        fromId = 15,
        createdBy = 44,
        date = 154354656,
        text = "Hello",
        replyOwnerId = 58,
        replyPostId = 12,
        friendsOnly = false,
        postType = "post",
        signerId = 77,
        canPin = true,
        canDelete = true,
        canEdit = true,
        postponedId = 11,
        markedAsAds = false,
        isFavorite = false,
        isPinned = false,
        views = Views (count = 1),
        comments = Comments(count = 1,canClose = true,canOpen = true,canPost = true,groupsCanPost = true),
        copyright = Copyright(id = 1,name = "Netology", link = "http", type = "type"),
        likes = Likes(count = 2,userLikes = true,canLike = false,canPublish = true),
        donut = Donut(paidDuration = 123465, isDonut = true,canPublishFreeCopy = true,editMode = "Mode 1"),
        reposts = Reposts(count = 1, userReposted = false)
    ))

    println(post.id);

    val post2 = WallService.add(Post(
        ownerId = 11,
        fromId = 15,
        createdBy = 44,
        date = 154354656,
        text = "Hello",
        replyOwnerId = 58,
        replyPostId = 12,
        friendsOnly = false,
        postType = "post",
        signerId = 77,
        canPin = true,
        canDelete = true,
        canEdit = true,
        postponedId = 11,
        markedAsAds = false,
        isFavorite = false,
        isPinned = false,
        views = Views (count = 1),
        comments = Comments(count = 1,canClose = true,canOpen = true,canPost = true,groupsCanPost = true),
        copyright = Copyright(id = 1,name = "Netology", link = "http", type = "type"),
        likes = Likes(count = 2,userLikes = true,canLike = false,canPublish = true),
        donut = Donut(paidDuration = 123465, isDonut = true,canPublishFreeCopy = true,editMode = "Mode 1"),
        reposts = Reposts(count = 1, userReposted = false)
    ))

    println(post2.id);
}