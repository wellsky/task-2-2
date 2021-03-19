object WallService {
    private var posts: Array<Post> = emptyArray<Post>()
    private var nextId = 1

    fun reset() {
        posts = emptyArray<Post>()
        nextId = 1
    }

    fun add(post: Post): Post {
        post.id = nextId++
        this.posts += post
        return posts.last()
    }

    fun update(editedPost: Post): Boolean {
        for ((index, post) in posts.withIndex()) {
            if (post.id == editedPost.id) {
                // Редактируем
                posts[index] = post.copy(
                    owner_id = editedPost.owner_id,
                    created_by = editedPost.created_by,
                    text = editedPost.text,
                    reply_owner_id = editedPost.reply_owner_id,
                    reply_post_id = editedPost.reply_post_id,
                    friends_only = editedPost.friends_only,
                    comments = editedPost.comments,
                    copyright = editedPost.copyright,
                    likes = editedPost.likes,
                    reposts = editedPost.reposts,
                    views = editedPost.views,
                    post_type = editedPost.post_type,
                    signer_id = editedPost.signer_id,
                    can_pin = editedPost.can_pin,
                    can_delete = editedPost.can_delete,
                    can_edit = editedPost.can_edit,
                    is_pinned = editedPost.is_pinned,
                    marked_as_ads = editedPost.marked_as_ads,
                    is_favorite = editedPost.is_favorite,
                    donut = editedPost.donut,
                    postponed_id = editedPost.postponed_id
                )
                return true;
            }
        }
        return false;
    }
}