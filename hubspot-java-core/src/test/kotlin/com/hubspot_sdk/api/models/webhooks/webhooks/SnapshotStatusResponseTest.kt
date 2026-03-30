// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.webhooks.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SnapshotStatusResponseTest {

    @Test
    fun create() {
        val snapshotStatusResponse =
            SnapshotStatusResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .initiatedAt(0L)
                .status(SnapshotStatusResponse.Status.COMPLETED)
                .completedAt(0L)
                .errorCode(SnapshotStatusResponse.ErrorCode.INTERNAL_ERROR)
                .message("message")
                .build()

        assertThat(snapshotStatusResponse.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(snapshotStatusResponse.initiatedAt()).isEqualTo(0L)
        assertThat(snapshotStatusResponse.status())
            .isEqualTo(SnapshotStatusResponse.Status.COMPLETED)
        assertThat(snapshotStatusResponse.completedAt()).contains(0L)
        assertThat(snapshotStatusResponse.errorCode())
            .contains(SnapshotStatusResponse.ErrorCode.INTERNAL_ERROR)
        assertThat(snapshotStatusResponse.message()).contains("message")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val snapshotStatusResponse =
            SnapshotStatusResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .initiatedAt(0L)
                .status(SnapshotStatusResponse.Status.COMPLETED)
                .completedAt(0L)
                .errorCode(SnapshotStatusResponse.ErrorCode.INTERNAL_ERROR)
                .message("message")
                .build()

        val roundtrippedSnapshotStatusResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(snapshotStatusResponse),
                jacksonTypeRef<SnapshotStatusResponse>(),
            )

        assertThat(roundtrippedSnapshotStatusResponse).isEqualTo(snapshotStatusResponse)
    }
}
