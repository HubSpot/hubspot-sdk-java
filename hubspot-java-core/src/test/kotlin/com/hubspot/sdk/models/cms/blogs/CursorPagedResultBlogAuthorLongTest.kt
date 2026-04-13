// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.cms.blogs

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CursorPagedResultBlogAuthorLongTest {

    @Test
    fun create() {
        val cursorPagedResultBlogAuthorLong = CursorPagedResultBlogAuthorLong.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val cursorPagedResultBlogAuthorLong = CursorPagedResultBlogAuthorLong.builder().build()

        val roundtrippedCursorPagedResultBlogAuthorLong =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(cursorPagedResultBlogAuthorLong),
                jacksonTypeRef<CursorPagedResultBlogAuthorLong>(),
            )

        assertThat(roundtrippedCursorPagedResultBlogAuthorLong)
            .isEqualTo(cursorPagedResultBlogAuthorLong)
    }
}
