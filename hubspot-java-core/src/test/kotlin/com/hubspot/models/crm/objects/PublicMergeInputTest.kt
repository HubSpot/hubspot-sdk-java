// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.crm.objects

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicMergeInputTest {

    @Test
    fun create() {
        val publicMergeInput =
            PublicMergeInput.builder()
                .objectIdToMerge("objectIdToMerge")
                .primaryObjectId("primaryObjectId")
                .build()

        assertThat(publicMergeInput.objectIdToMerge()).isEqualTo("objectIdToMerge")
        assertThat(publicMergeInput.primaryObjectId()).isEqualTo("primaryObjectId")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicMergeInput =
            PublicMergeInput.builder()
                .objectIdToMerge("objectIdToMerge")
                .primaryObjectId("primaryObjectId")
                .build()

        val roundtrippedPublicMergeInput =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicMergeInput),
                jacksonTypeRef<PublicMergeInput>(),
            )

        assertThat(roundtrippedPublicMergeInput).isEqualTo(publicMergeInput)
    }
}
