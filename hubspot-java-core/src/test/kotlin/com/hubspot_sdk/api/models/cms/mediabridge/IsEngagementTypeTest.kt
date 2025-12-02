// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IsEngagementTypeTest {

    @Test
    fun create() {
        val isEngagementType =
            IsEngagementType.builder()
                .operator(IsEngagementType.Operator.IS_ENGAGEMENT_TYPE)
                .addInput(
                    ConstantBoolean.builder()
                        .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                        .inputs(listOf())
                        .propertyName("propertyName")
                        .value(true)
                        .build()
                )
                .propertyName("propertyName")
                .value(true)
                .build()

        assertThat(isEngagementType.operator())
            .isEqualTo(IsEngagementType.Operator.IS_ENGAGEMENT_TYPE)
        assertThat(isEngagementType.inputs().getOrNull())
            .containsExactly(
                Expression.ofConstantBoolean(
                    ConstantBoolean.builder()
                        .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                        .inputs(listOf())
                        .propertyName("propertyName")
                        .value(true)
                        .build()
                )
            )
        assertThat(isEngagementType.propertyName()).contains("propertyName")
        assertThat(isEngagementType.value()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val isEngagementType =
            IsEngagementType.builder()
                .operator(IsEngagementType.Operator.IS_ENGAGEMENT_TYPE)
                .addInput(
                    ConstantBoolean.builder()
                        .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                        .inputs(listOf())
                        .propertyName("propertyName")
                        .value(true)
                        .build()
                )
                .propertyName("propertyName")
                .value(true)
                .build()

        val roundtrippedIsEngagementType =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(isEngagementType),
                jacksonTypeRef<IsEngagementType>(),
            )

        assertThat(roundtrippedIsEngagementType).isEqualTo(isEngagementType)
    }
}
