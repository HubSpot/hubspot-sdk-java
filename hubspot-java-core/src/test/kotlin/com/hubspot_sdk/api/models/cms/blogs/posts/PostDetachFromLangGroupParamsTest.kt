// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.blogs.posts

import com.hubspot_sdk.api.models.cms.blogs.DetachFromLangGroupRequestVNext
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PostDetachFromLangGroupParamsTest {

    @Test
    fun create() {
        PostDetachFromLangGroupParams.builder()
            .detachFromLangGroupRequestVNext(
                DetachFromLangGroupRequestVNext.builder().id("id").build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            PostDetachFromLangGroupParams.builder()
                .detachFromLangGroupRequestVNext(
                    DetachFromLangGroupRequestVNext.builder().id("id").build()
                )
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(DetachFromLangGroupRequestVNext.builder().id("id").build())
    }
}
