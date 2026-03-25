// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import com.hubspot_sdk.api.models.AssociationSpec
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RollupExpressionTest {

    @Test
    fun create() {
        val rollupExpression =
            RollupExpression.builder()
                .addAssociationType(
                    AssociationSpec.builder()
                        .associationCategory(AssociationSpec.AssociationCategory.HUBSPOT_DEFINED)
                        .associationTypeId(0)
                        .build()
                )
                .rollupOperator(RollupExpression.RollupOperator.AVERAGE)
                .sourceObjectTypeId("sourceObjectTypeId")
                .sourcePropertyName("sourcePropertyName")
                .conditionalExpression(
                    ConstantBoolean.builder()
                        .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                        .propertyName("propertyName")
                        .value(true)
                        .build()
                )
                .conditionalFormula("conditionalFormula")
                .emptyRollupValue("emptyRollupValue")
                .sourceCompareByPropertyName("sourceCompareByPropertyName")
                .build()

        assertThat(rollupExpression.associationTypes())
            .containsExactly(
                AssociationSpec.builder()
                    .associationCategory(AssociationSpec.AssociationCategory.HUBSPOT_DEFINED)
                    .associationTypeId(0)
                    .build()
            )
        assertThat(rollupExpression.rollupOperator())
            .isEqualTo(RollupExpression.RollupOperator.AVERAGE)
        assertThat(rollupExpression.sourceObjectTypeId()).isEqualTo("sourceObjectTypeId")
        assertThat(rollupExpression.sourcePropertyName()).isEqualTo("sourcePropertyName")
        assertThat(rollupExpression.conditionalExpression())
            .contains(
                RollupExpression.ConditionalExpression.ofConstantBoolean(
                    ConstantBoolean.builder()
                        .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                        .propertyName("propertyName")
                        .value(true)
                        .build()
                )
            )
        assertThat(rollupExpression.conditionalFormula()).contains("conditionalFormula")
        assertThat(rollupExpression.emptyRollupValue()).contains("emptyRollupValue")
        assertThat(rollupExpression.sourceCompareByPropertyName())
            .contains("sourceCompareByPropertyName")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val rollupExpression =
            RollupExpression.builder()
                .addAssociationType(
                    AssociationSpec.builder()
                        .associationCategory(AssociationSpec.AssociationCategory.HUBSPOT_DEFINED)
                        .associationTypeId(0)
                        .build()
                )
                .rollupOperator(RollupExpression.RollupOperator.AVERAGE)
                .sourceObjectTypeId("sourceObjectTypeId")
                .sourcePropertyName("sourcePropertyName")
                .conditionalExpression(
                    ConstantBoolean.builder()
                        .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                        .propertyName("propertyName")
                        .value(true)
                        .build()
                )
                .conditionalFormula("conditionalFormula")
                .emptyRollupValue("emptyRollupValue")
                .sourceCompareByPropertyName("sourceCompareByPropertyName")
                .build()

        val roundtrippedRollupExpression =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(rollupExpression),
                jacksonTypeRef<RollupExpression>(),
            )

        assertThat(roundtrippedRollupExpression).isEqualTo(rollupExpression)
    }
}
