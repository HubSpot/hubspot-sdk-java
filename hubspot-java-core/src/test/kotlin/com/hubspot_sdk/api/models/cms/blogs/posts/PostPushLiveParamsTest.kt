// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.blogs.posts

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PostPushLiveParamsTest {

    @Test
    fun create() {
        PostPushLiveParams.builder().objectId("objectId").build()
    }

    @Test
    fun pathParams() {
        val params = PostPushLiveParams.builder().objectId("objectId").build()

        assertThat(params._pathParam(0)).isEqualTo("objectId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
