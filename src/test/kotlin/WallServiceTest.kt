import org.junit.Assert.*
import org.junit.Test

class WallServiceTest {
    @Test
    fun addPostTest() {
        WallService.reset()
        val post = WallService.add(Post(
            owner_id = 11,
            from_id = 15,
            created_by = 44,
            date = 154354656,
            text = "Hello",
            reply_owner_id = 58,
            reply_post_id = 12,
            friends_only = false,
            post_type = "post",
            signer_id = 77,
            can_pin = true,
            can_delete = true,
            can_edit = true,
            postponed_id = 11,
            marked_as_ads = false,
            is_favorite = false,
            is_pinned = false,
            views = Views (count = 1),
            comments = Comments(count = 1,can_close = true,can_open = true,can_post = true,groups_can_post = true),
            copyright = Copyright(id = 1,name = "Netology", link = "http", type = "type"),
            likes = Likes(count = 2,user_likes = true,can_like = false,can_publish = true),
            donut = Donut(paid_duration = 123465, is_donut = true,can_publish_free_copy = true,edit_mode = "Mode 1"),
            reposts = Reposts(count = 1, user_reposted = false)
        ))

        assertEquals(1, post.id);
    }


    @Test
    fun updateExisting() {
        WallService.reset()
        val post1 = WallService.add(Post(
            owner_id = 11,
            from_id = 15,
            created_by = 44,
            date = 154354656,
            text = "Hello",
            reply_owner_id = 58,
            reply_post_id = 12,
            friends_only = false,
            post_type = "post",
            signer_id = 77,
            can_pin = true,
            can_delete = true,
            can_edit = true,
            postponed_id = 11,
            marked_as_ads = false,
            is_favorite = false,
            is_pinned = false,
            views = Views (count = 1),
            comments = Comments(count = 1,can_close = true,can_open = true,can_post = true,groups_can_post = true),
            copyright = Copyright(id = 1,name = "Netology", link = "http", type = "type"),
            likes = Likes(count = 2,user_likes = true,can_like = false,can_publish = true),
            donut = Donut(paid_duration = 123465, is_donut = true,can_publish_free_copy = true,edit_mode = "Mode 1"),
            reposts = Reposts(count = 1, user_reposted = false)
        ))

        val update = Post (
            id = 1,
            owner_id = 11,
            from_id = 15,
            created_by = 44,
            date = 154354656,
            text = "Hello",
            reply_owner_id = 58,
            reply_post_id = 12,
            friends_only = false,
            post_type = "post",
            signer_id = 77,
            can_pin = true,
            can_delete = true,
            can_edit = true,
            postponed_id = 11,
            marked_as_ads = false,
            is_favorite = false,
            is_pinned = false,
            views = Views (count = 1),
            comments = Comments(count = 1,can_close = true,can_open = true,can_post = true,groups_can_post = true),
            copyright = Copyright(id = 1,name = "Netology", link = "http", type = "type"),
            likes = Likes(count = 2,user_likes = true,can_like = false,can_publish = true),
            donut = Donut(paid_duration = 123465, is_donut = true,can_publish_free_copy = true,edit_mode = "Mode 1"),
            reposts = Reposts(count = 1, user_reposted = false)
        )

        val result = WallService.update(update)

        assertTrue(result)
    }

    @Test
    fun updateNotExisting() {
        WallService.reset()
        val post1 = WallService.add(Post(
            owner_id = 11,
            from_id = 15,
            created_by = 44,
            date = 154354656,
            text = "Hello",
            reply_owner_id = 58,
            reply_post_id = 12,
            friends_only = false,
            post_type = "post",
            signer_id = 77,
            can_pin = true,
            can_delete = true,
            can_edit = true,
            postponed_id = 11,
            marked_as_ads = false,
            is_favorite = false,
            is_pinned = false,
            views = Views (count = 1),
            comments = Comments(count = 1,can_close = true,can_open = true,can_post = true,groups_can_post = true),
            copyright = Copyright(id = 1,name = "Netology", link = "http", type = "type"),
            likes = Likes(count = 2,user_likes = true,can_like = false,can_publish = true),
            donut = Donut(paid_duration = 123465, is_donut = true,can_publish_free_copy = true,edit_mode = "Mode 1"),
            reposts = Reposts(count = 1, user_reposted = false)
        ))

        val update = Post (
            id = 2,
            owner_id = 11,
            from_id = 15,
            created_by = 44,
            date = 154354656,
            text = "Hello",
            reply_owner_id = 58,
            reply_post_id = 12,
            friends_only = false,
            post_type = "post",
            signer_id = 77,
            can_pin = true,
            can_delete = true,
            can_edit = true,
            postponed_id = 11,
            marked_as_ads = false,
            is_favorite = false,
            is_pinned = false,
            views = Views (count = 1),
            comments = Comments(count = 1,can_close = true,can_open = true,can_post = true,groups_can_post = true),
            copyright = Copyright(id = 1,name = "Netology", link = "http", type = "type"),
            likes = Likes(count = 2,user_likes = true,can_like = false,can_publish = true),
            donut = Donut(paid_duration = 123465, is_donut = true,can_publish_free_copy = true,edit_mode = "Mode 1"),
            reposts = Reposts(count = 1, user_reposted = false)
        )

        val result = WallService.update(update)

        assertFalse(result)
    }

}