// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.blogs.posts

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PostCloneParamsTest {

    @Test
    fun create() {
        PostCloneParams.builder()
            .contentCloneRequestVNext(
                ContentCloneRequestVNext.builder().id("id").cloneName("cloneName").build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            PostCloneParams.builder()
                .contentCloneRequestVNext(
                    ContentCloneRequestVNext.builder().id("id").cloneName("cloneName").build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(ContentCloneRequestVNext.builder().id("id").cloneName("cloneName").build())
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            PostCloneParams.builder()
                .contentCloneRequestVNext(ContentCloneRequestVNext.builder().id("id").build())
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(ContentCloneRequestVNext.builder().id("id").build())
    }
}
