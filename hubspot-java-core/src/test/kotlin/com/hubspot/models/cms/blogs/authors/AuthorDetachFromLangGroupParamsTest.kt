// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.cms.blogs.authors

import com.hubspot.models.cms.DetachFromLangGroupRequestVNext
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AuthorDetachFromLangGroupParamsTest {

    @Test
    fun create() {
        AuthorDetachFromLangGroupParams.builder()
            .detachFromLangGroupRequestVNext(
                DetachFromLangGroupRequestVNext.builder().id("id").build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            AuthorDetachFromLangGroupParams.builder()
                .detachFromLangGroupRequestVNext(
                    DetachFromLangGroupRequestVNext.builder().id("id").build()
                )
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(DetachFromLangGroupRequestVNext.builder().id("id").build())
    }
}
