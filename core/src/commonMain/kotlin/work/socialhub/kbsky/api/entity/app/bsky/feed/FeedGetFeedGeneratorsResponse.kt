package work.socialhub.kbsky.api.entity.app.bsky.feed

import kotlinx.serialization.Serializable
import work.socialhub.kbsky.model.app.bsky.feed.FeedDefsGeneratorView

@Serializable
class FeedGetFeedGeneratorsResponse {
    lateinit var feeds: List<work.socialhub.kbsky.model.app.bsky.feed.FeedDefsGeneratorView>
}
