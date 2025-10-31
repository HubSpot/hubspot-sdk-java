// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.forms

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LifecycleStageTest {

    @Test
    fun create() {
        val lifecycleStage =
            LifecycleStage.builder().objectTypeId("objectTypeId").value("value").build()

        assertThat(lifecycleStage.objectTypeId()).isEqualTo("objectTypeId")
        assertThat(lifecycleStage.value()).isEqualTo("value")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val lifecycleStage =
            LifecycleStage.builder().objectTypeId("objectTypeId").value("value").build()

        val roundtrippedLifecycleStage =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(lifecycleStage),
                jacksonTypeRef<LifecycleStage>(),
            )

        assertThat(roundtrippedLifecycleStage).isEqualTo(lifecycleStage)
    }
}
