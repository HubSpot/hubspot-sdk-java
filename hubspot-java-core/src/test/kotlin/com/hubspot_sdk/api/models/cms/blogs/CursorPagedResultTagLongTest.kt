// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.blogs

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CursorPagedResultTagLongTest {

    @Test
    fun create() {
        val cursorPagedResultTagLong = CursorPagedResultTagLong.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val cursorPagedResultTagLong = CursorPagedResultTagLong.builder().build()

        val roundtrippedCursorPagedResultTagLong =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(cursorPagedResultTagLong),
                jacksonTypeRef<CursorPagedResultTagLong>(),
            )

        assertThat(roundtrippedCursorPagedResultTagLong).isEqualTo(cursorPagedResultTagLong)
    }
}
