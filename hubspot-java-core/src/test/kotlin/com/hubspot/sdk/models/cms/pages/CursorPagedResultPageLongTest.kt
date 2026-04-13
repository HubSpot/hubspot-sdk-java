// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.cms.pages

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CursorPagedResultPageLongTest {

    @Test
    fun create() {
        val cursorPagedResultPageLong = CursorPagedResultPageLong.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val cursorPagedResultPageLong = CursorPagedResultPageLong.builder().build()

        val roundtrippedCursorPagedResultPageLong =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(cursorPagedResultPageLong),
                jacksonTypeRef<CursorPagedResultPageLong>(),
            )

        assertThat(roundtrippedCursorPagedResultPageLong).isEqualTo(cursorPagedResultPageLong)
    }
}
