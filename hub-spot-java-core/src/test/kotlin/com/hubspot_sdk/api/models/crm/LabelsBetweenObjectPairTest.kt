// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LabelsBetweenObjectPairTest {

    @Test
    fun create() {
        val labelsBetweenObjectPair =
            LabelsBetweenObjectPair.builder()
                .fromObjectId("fromObjectId")
                .fromObjectTypeId("fromObjectTypeId")
                .addLabel("string")
                .toObjectId("toObjectId")
                .toObjectTypeId("toObjectTypeId")
                .build()

        assertThat(labelsBetweenObjectPair.fromObjectId()).isEqualTo("fromObjectId")
        assertThat(labelsBetweenObjectPair.fromObjectTypeId()).isEqualTo("fromObjectTypeId")
        assertThat(labelsBetweenObjectPair.labels()).containsExactly("string")
        assertThat(labelsBetweenObjectPair.toObjectId()).isEqualTo("toObjectId")
        assertThat(labelsBetweenObjectPair.toObjectTypeId()).isEqualTo("toObjectTypeId")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val labelsBetweenObjectPair =
            LabelsBetweenObjectPair.builder()
                .fromObjectId("fromObjectId")
                .fromObjectTypeId("fromObjectTypeId")
                .addLabel("string")
                .toObjectId("toObjectId")
                .toObjectTypeId("toObjectTypeId")
                .build()

        val roundtrippedLabelsBetweenObjectPair =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(labelsBetweenObjectPair),
                jacksonTypeRef<LabelsBetweenObjectPair>(),
            )

        assertThat(roundtrippedLabelsBetweenObjectPair).isEqualTo(labelsBetweenObjectPair)
    }
}
