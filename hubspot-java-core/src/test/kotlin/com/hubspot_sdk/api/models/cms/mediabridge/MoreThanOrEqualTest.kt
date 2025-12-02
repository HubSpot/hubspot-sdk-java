// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MoreThanOrEqualTest {

    @Test
    fun create() {
        val moreThanOrEqual =
            MoreThanOrEqual.builder()
                .operator(MoreThanOrEqual.Operator.MORE_THAN_OR_EQUAL)
                .addInput(
                    MoreThanOrEqual.Input.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .propertyName("propertyName")
                .value(true)
                .build()

        assertThat(moreThanOrEqual.operator())
            .isEqualTo(MoreThanOrEqual.Operator.MORE_THAN_OR_EQUAL)
        assertThat(moreThanOrEqual.inputs().getOrNull())
            .containsExactly(
                MoreThanOrEqual.Input.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(moreThanOrEqual.propertyName()).contains("propertyName")
        assertThat(moreThanOrEqual.value()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val moreThanOrEqual =
            MoreThanOrEqual.builder()
                .operator(MoreThanOrEqual.Operator.MORE_THAN_OR_EQUAL)
                .addInput(
                    MoreThanOrEqual.Input.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .propertyName("propertyName")
                .value(true)
                .build()

        val roundtrippedMoreThanOrEqual =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(moreThanOrEqual),
                jacksonTypeRef<MoreThanOrEqual>(),
            )

        assertThat(roundtrippedMoreThanOrEqual).isEqualTo(moreThanOrEqual)
    }
}
