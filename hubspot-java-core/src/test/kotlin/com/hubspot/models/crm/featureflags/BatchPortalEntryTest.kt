// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.crm.featureflags

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatchPortalEntryTest {

    @Test
    fun create() {
        val batchPortalEntry =
            BatchPortalEntry.builder()
                .flagState(BatchPortalEntry.FlagState.ABSENT)
                .portalId(0)
                .build()

        assertThat(batchPortalEntry.flagState()).isEqualTo(BatchPortalEntry.FlagState.ABSENT)
        assertThat(batchPortalEntry.portalId()).isEqualTo(0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val batchPortalEntry =
            BatchPortalEntry.builder()
                .flagState(BatchPortalEntry.FlagState.ABSENT)
                .portalId(0)
                .build()

        val roundtrippedBatchPortalEntry =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(batchPortalEntry),
                jacksonTypeRef<BatchPortalEntry>(),
            )

        assertThat(roundtrippedBatchPortalEntry).isEqualTo(batchPortalEntry)
    }
}
