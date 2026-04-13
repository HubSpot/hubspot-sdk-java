// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.cms.pages

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CursorPagedResultContentFolderLongTest {

    @Test
    fun create() {
        val cursorPagedResultContentFolderLong =
            CursorPagedResultContentFolderLong.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val cursorPagedResultContentFolderLong =
            CursorPagedResultContentFolderLong.builder().build()

        val roundtrippedCursorPagedResultContentFolderLong =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(cursorPagedResultContentFolderLong),
                jacksonTypeRef<CursorPagedResultContentFolderLong>(),
            )

        assertThat(roundtrippedCursorPagedResultContentFolderLong)
            .isEqualTo(cursorPagedResultContentFolderLong)
    }
}
