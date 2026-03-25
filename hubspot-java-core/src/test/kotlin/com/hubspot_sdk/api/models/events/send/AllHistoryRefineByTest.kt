// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.events.send

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AllHistoryRefineByTest {

    @Test
    fun create() {
        val allHistoryRefineBy =
            AllHistoryRefineBy.builder().type(AllHistoryRefineBy.Type.ALL_HISTORY_REFINE_BY).build()

        assertThat(allHistoryRefineBy.type())
            .isEqualTo(AllHistoryRefineBy.Type.ALL_HISTORY_REFINE_BY)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val allHistoryRefineBy =
            AllHistoryRefineBy.builder().type(AllHistoryRefineBy.Type.ALL_HISTORY_REFINE_BY).build()

        val roundtrippedAllHistoryRefineBy =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(allHistoryRefineBy),
                jacksonTypeRef<AllHistoryRefineBy>(),
            )

        assertThat(roundtrippedAllHistoryRefineBy).isEqualTo(allHistoryRefineBy)
    }
}
