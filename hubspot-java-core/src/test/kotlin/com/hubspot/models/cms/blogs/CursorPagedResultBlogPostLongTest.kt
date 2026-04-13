// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.cms.blogs

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CursorPagedResultBlogPostLongTest {

    @Test
    fun create() {
        val cursorPagedResultBlogPostLong = CursorPagedResultBlogPostLong.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val cursorPagedResultBlogPostLong = CursorPagedResultBlogPostLong.builder().build()

        val roundtrippedCursorPagedResultBlogPostLong =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(cursorPagedResultBlogPostLong),
                jacksonTypeRef<CursorPagedResultBlogPostLong>(),
            )

        assertThat(roundtrippedCursorPagedResultBlogPostLong)
            .isEqualTo(cursorPagedResultBlogPostLong)
    }
}
