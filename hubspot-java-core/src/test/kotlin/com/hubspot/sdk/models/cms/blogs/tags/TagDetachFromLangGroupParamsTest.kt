// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.cms.blogs.tags

import com.hubspot.sdk.models.cms.DetachFromLangGroupRequestVNext
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TagDetachFromLangGroupParamsTest {

    @Test
    fun create() {
        TagDetachFromLangGroupParams.builder()
            .detachFromLangGroupRequestVNext(
                DetachFromLangGroupRequestVNext.builder().id("id").build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            TagDetachFromLangGroupParams.builder()
                .detachFromLangGroupRequestVNext(
                    DetachFromLangGroupRequestVNext.builder().id("id").build()
                )
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(DetachFromLangGroupRequestVNext.builder().id("id").build())
    }
}
