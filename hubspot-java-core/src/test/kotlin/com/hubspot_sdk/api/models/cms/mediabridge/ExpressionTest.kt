// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import com.hubspot_sdk.api.errors.HubspotInvalidDataException
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

internal class ExpressionTest {

    @Test
    fun ofConstantBoolean() {
        val constantBoolean =
            ConstantBoolean.builder()
                .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                .addInput(
                    ConstantNumber.builder()
                        .operator(ConstantNumber.Operator.CONSTANT_NUMBER)
                        .inputs(listOf())
                        .propertyName("propertyName")
                        .value(0.0)
                        .build()
                )
                .propertyName("propertyName")
                .value(true)
                .build()

        val expression = Expression.ofConstantBoolean(constantBoolean)

        assertThat(expression.constantBoolean()).contains(constantBoolean)
        assertThat(expression.constantNumber()).isEmpty
        assertThat(expression.constantString()).isEmpty
        assertThat(expression.booleanPropertyVariable()).isEmpty
        assertThat(expression.stringPropertyVariable()).isEmpty
        assertThat(expression.numberPropertyVariable()).isEmpty
        assertThat(expression.timestampOfPropertyVariable()).isEmpty
        assertThat(expression.booleanTargetPropertyVariable()).isEmpty
        assertThat(expression.stringTargetPropertyVariable()).isEmpty
        assertThat(expression.numberTargetPropertyVariable()).isEmpty
        assertThat(expression.timestampOfTargetPropertyVariable()).isEmpty
        assertThat(expression.addNumbers()).isEmpty
        assertThat(expression.subtractNumbers()).isEmpty
        assertThat(expression.multiplyNumbers()).isEmpty
        assertThat(expression.divideNumbers()).isEmpty
        assertThat(expression.roundDownNumbers()).isEmpty
        assertThat(expression.roundUpNumbers()).isEmpty
        assertThat(expression.roundNearestNumbers()).isEmpty
        assertThat(expression.upperCase()).isEmpty
        assertThat(expression.lowerCase()).isEmpty
        assertThat(expression.concatStrings()).isEmpty
        assertThat(expression.contains()).isEmpty
        assertThat(expression.beginsWith()).isEmpty
        assertThat(expression.numberToString()).isEmpty
        assertThat(expression.parseNumber()).isEmpty
        assertThat(expression.fetchExchangeRate()).isEmpty
        assertThat(expression.fetchCurrencyDecimalPlaces()).isEmpty
        assertThat(expression.fetchSingleCurrencyPortalCurrency()).isEmpty
        assertThat(expression.datedExchangeRate()).isEmpty
        assertThat(expression.pipelineProbability()).isEmpty
        assertThat(expression.maxNumbers()).isEmpty
        assertThat(expression.minNumbers()).isEmpty
        assertThat(expression.lessThan()).isEmpty
        assertThat(expression.lessThanOrEqual()).isEmpty
        assertThat(expression.moreThan()).isEmpty
        assertThat(expression.moreThanOrEqual()).isEmpty
        assertThat(expression.numberEquals()).isEmpty
        assertThat(expression.stringEquals()).isEmpty
        assertThat(expression.isPipelineStageClosed()).isEmpty
        assertThat(expression.not()).isEmpty
        assertThat(expression.date()).isEmpty
        assertThat(expression.month()).isEmpty
        assertThat(expression.year()).isEmpty
        assertThat(expression.now()).isEmpty
        assertThat(expression.timeBetween()).isEmpty
        assertThat(expression.periodToMonths()).isEmpty
        assertThat(expression.periodToWeeks()).isEmpty
        assertThat(expression.and()).isEmpty
        assertThat(expression.or()).isEmpty
        assertThat(expression.xor()).isEmpty
        assertThat(expression.ifString()).isEmpty
        assertThat(expression.ifNumber()).isEmpty
        assertThat(expression.ifBoolean()).isEmpty
        assertThat(expression.isPresent()).isEmpty
        assertThat(expression.hasEmailReply()).isEmpty
        assertThat(expression.hasPlainTextEmailReply()).isEmpty
        assertThat(expression.extractMostRecentEmailReplyHtml()).isEmpty
        assertThat(expression.extractMostRecentEmailReplyText()).isEmpty
        assertThat(expression.extractMostRecentPlainTextEmailReply()).isEmpty
        assertThat(expression.setContainsString()).isEmpty
        assertThat(expression.isEngagementType()).isEmpty
        assertThat(expression.formatFullName()).isEmpty
        assertThat(expression.absoluteValue()).isEmpty
        assertThat(expression.squareRoot()).isEmpty
        assertThat(expression.power()).isEmpty
        assertThat(expression.substring()).isEmpty
        assertThat(expression.euler()).isEmpty
        assertThat(expression.stringLength()).isEmpty
        assertThat(expression.addTime()).isEmpty
        assertThat(expression.subtractTime()).isEmpty
    }

    @Test
    fun ofConstantBooleanRoundtrip() {
        val jsonMapper = jsonMapper()
        val expression =
            Expression.ofConstantBoolean(
                ConstantBoolean.builder()
                    .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                    .addInput(
                        ConstantNumber.builder()
                            .operator(ConstantNumber.Operator.CONSTANT_NUMBER)
                            .inputs(listOf())
                            .propertyName("propertyName")
                            .value(0.0)
                            .build()
                    )
                    .propertyName("propertyName")
                    .value(true)
                    .build()
            )

        val roundtrippedExpression =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(expression),
                jacksonTypeRef<Expression>(),
            )

        assertThat(roundtrippedExpression).isEqualTo(expression)
    }

    @Test
    fun ofConstantNumber() {
        val constantNumber =
            ConstantNumber.builder()
                .operator(ConstantNumber.Operator.CONSTANT_NUMBER)
                .addInput(
                    ConstantBoolean.builder()
                        .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                        .inputs(listOf())
                        .propertyName("propertyName")
                        .value(true)
                        .build()
                )
                .propertyName("propertyName")
                .value(0.0)
                .build()

        val expression = Expression.ofConstantNumber(constantNumber)

        assertThat(expression.constantBoolean()).isEmpty
        assertThat(expression.constantNumber()).contains(constantNumber)
        assertThat(expression.constantString()).isEmpty
        assertThat(expression.booleanPropertyVariable()).isEmpty
        assertThat(expression.stringPropertyVariable()).isEmpty
        assertThat(expression.numberPropertyVariable()).isEmpty
        assertThat(expression.timestampOfPropertyVariable()).isEmpty
        assertThat(expression.booleanTargetPropertyVariable()).isEmpty
        assertThat(expression.stringTargetPropertyVariable()).isEmpty
        assertThat(expression.numberTargetPropertyVariable()).isEmpty
        assertThat(expression.timestampOfTargetPropertyVariable()).isEmpty
        assertThat(expression.addNumbers()).isEmpty
        assertThat(expression.subtractNumbers()).isEmpty
        assertThat(expression.multiplyNumbers()).isEmpty
        assertThat(expression.divideNumbers()).isEmpty
        assertThat(expression.roundDownNumbers()).isEmpty
        assertThat(expression.roundUpNumbers()).isEmpty
        assertThat(expression.roundNearestNumbers()).isEmpty
        assertThat(expression.upperCase()).isEmpty
        assertThat(expression.lowerCase()).isEmpty
        assertThat(expression.concatStrings()).isEmpty
        assertThat(expression.contains()).isEmpty
        assertThat(expression.beginsWith()).isEmpty
        assertThat(expression.numberToString()).isEmpty
        assertThat(expression.parseNumber()).isEmpty
        assertThat(expression.fetchExchangeRate()).isEmpty
        assertThat(expression.fetchCurrencyDecimalPlaces()).isEmpty
        assertThat(expression.fetchSingleCurrencyPortalCurrency()).isEmpty
        assertThat(expression.datedExchangeRate()).isEmpty
        assertThat(expression.pipelineProbability()).isEmpty
        assertThat(expression.maxNumbers()).isEmpty
        assertThat(expression.minNumbers()).isEmpty
        assertThat(expression.lessThan()).isEmpty
        assertThat(expression.lessThanOrEqual()).isEmpty
        assertThat(expression.moreThan()).isEmpty
        assertThat(expression.moreThanOrEqual()).isEmpty
        assertThat(expression.numberEquals()).isEmpty
        assertThat(expression.stringEquals()).isEmpty
        assertThat(expression.isPipelineStageClosed()).isEmpty
        assertThat(expression.not()).isEmpty
        assertThat(expression.date()).isEmpty
        assertThat(expression.month()).isEmpty
        assertThat(expression.year()).isEmpty
        assertThat(expression.now()).isEmpty
        assertThat(expression.timeBetween()).isEmpty
        assertThat(expression.periodToMonths()).isEmpty
        assertThat(expression.periodToWeeks()).isEmpty
        assertThat(expression.and()).isEmpty
        assertThat(expression.or()).isEmpty
        assertThat(expression.xor()).isEmpty
        assertThat(expression.ifString()).isEmpty
        assertThat(expression.ifNumber()).isEmpty
        assertThat(expression.ifBoolean()).isEmpty
        assertThat(expression.isPresent()).isEmpty
        assertThat(expression.hasEmailReply()).isEmpty
        assertThat(expression.hasPlainTextEmailReply()).isEmpty
        assertThat(expression.extractMostRecentEmailReplyHtml()).isEmpty
        assertThat(expression.extractMostRecentEmailReplyText()).isEmpty
        assertThat(expression.extractMostRecentPlainTextEmailReply()).isEmpty
        assertThat(expression.setContainsString()).isEmpty
        assertThat(expression.isEngagementType()).isEmpty
        assertThat(expression.formatFullName()).isEmpty
        assertThat(expression.absoluteValue()).isEmpty
        assertThat(expression.squareRoot()).isEmpty
        assertThat(expression.power()).isEmpty
        assertThat(expression.substring()).isEmpty
        assertThat(expression.euler()).isEmpty
        assertThat(expression.stringLength()).isEmpty
        assertThat(expression.addTime()).isEmpty
        assertThat(expression.subtractTime()).isEmpty
    }

    @Test
    fun ofConstantNumberRoundtrip() {
        val jsonMapper = jsonMapper()
        val expression =
            Expression.ofConstantNumber(
                ConstantNumber.builder()
                    .operator(ConstantNumber.Operator.CONSTANT_NUMBER)
                    .addInput(
                        ConstantBoolean.builder()
                            .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                            .inputs(listOf())
                            .propertyName("propertyName")
                            .value(true)
                            .build()
                    )
                    .propertyName("propertyName")
                    .value(0.0)
                    .build()
            )

        val roundtrippedExpression =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(expression),
                jacksonTypeRef<Expression>(),
            )

        assertThat(roundtrippedExpression).isEqualTo(expression)
    }

    @Test
    fun ofConstantString() {
        val constantString =
            ConstantString.builder()
                .operator(ConstantString.Operator.CONSTANT_STRING)
                .addInput(
                    ConstantBoolean.builder()
                        .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                        .inputs(listOf())
                        .propertyName("propertyName")
                        .value(true)
                        .build()
                )
                .propertyName("propertyName")
                .value("value")
                .build()

        val expression = Expression.ofConstantString(constantString)

        assertThat(expression.constantBoolean()).isEmpty
        assertThat(expression.constantNumber()).isEmpty
        assertThat(expression.constantString()).contains(constantString)
        assertThat(expression.booleanPropertyVariable()).isEmpty
        assertThat(expression.stringPropertyVariable()).isEmpty
        assertThat(expression.numberPropertyVariable()).isEmpty
        assertThat(expression.timestampOfPropertyVariable()).isEmpty
        assertThat(expression.booleanTargetPropertyVariable()).isEmpty
        assertThat(expression.stringTargetPropertyVariable()).isEmpty
        assertThat(expression.numberTargetPropertyVariable()).isEmpty
        assertThat(expression.timestampOfTargetPropertyVariable()).isEmpty
        assertThat(expression.addNumbers()).isEmpty
        assertThat(expression.subtractNumbers()).isEmpty
        assertThat(expression.multiplyNumbers()).isEmpty
        assertThat(expression.divideNumbers()).isEmpty
        assertThat(expression.roundDownNumbers()).isEmpty
        assertThat(expression.roundUpNumbers()).isEmpty
        assertThat(expression.roundNearestNumbers()).isEmpty
        assertThat(expression.upperCase()).isEmpty
        assertThat(expression.lowerCase()).isEmpty
        assertThat(expression.concatStrings()).isEmpty
        assertThat(expression.contains()).isEmpty
        assertThat(expression.beginsWith()).isEmpty
        assertThat(expression.numberToString()).isEmpty
        assertThat(expression.parseNumber()).isEmpty
        assertThat(expression.fetchExchangeRate()).isEmpty
        assertThat(expression.fetchCurrencyDecimalPlaces()).isEmpty
        assertThat(expression.fetchSingleCurrencyPortalCurrency()).isEmpty
        assertThat(expression.datedExchangeRate()).isEmpty
        assertThat(expression.pipelineProbability()).isEmpty
        assertThat(expression.maxNumbers()).isEmpty
        assertThat(expression.minNumbers()).isEmpty
        assertThat(expression.lessThan()).isEmpty
        assertThat(expression.lessThanOrEqual()).isEmpty
        assertThat(expression.moreThan()).isEmpty
        assertThat(expression.moreThanOrEqual()).isEmpty
        assertThat(expression.numberEquals()).isEmpty
        assertThat(expression.stringEquals()).isEmpty
        assertThat(expression.isPipelineStageClosed()).isEmpty
        assertThat(expression.not()).isEmpty
        assertThat(expression.date()).isEmpty
        assertThat(expression.month()).isEmpty
        assertThat(expression.year()).isEmpty
        assertThat(expression.now()).isEmpty
        assertThat(expression.timeBetween()).isEmpty
        assertThat(expression.periodToMonths()).isEmpty
        assertThat(expression.periodToWeeks()).isEmpty
        assertThat(expression.and()).isEmpty
        assertThat(expression.or()).isEmpty
        assertThat(expression.xor()).isEmpty
        assertThat(expression.ifString()).isEmpty
        assertThat(expression.ifNumber()).isEmpty
        assertThat(expression.ifBoolean()).isEmpty
        assertThat(expression.isPresent()).isEmpty
        assertThat(expression.hasEmailReply()).isEmpty
        assertThat(expression.hasPlainTextEmailReply()).isEmpty
        assertThat(expression.extractMostRecentEmailReplyHtml()).isEmpty
        assertThat(expression.extractMostRecentEmailReplyText()).isEmpty
        assertThat(expression.extractMostRecentPlainTextEmailReply()).isEmpty
        assertThat(expression.setContainsString()).isEmpty
        assertThat(expression.isEngagementType()).isEmpty
        assertThat(expression.formatFullName()).isEmpty
        assertThat(expression.absoluteValue()).isEmpty
        assertThat(expression.squareRoot()).isEmpty
        assertThat(expression.power()).isEmpty
        assertThat(expression.substring()).isEmpty
        assertThat(expression.euler()).isEmpty
        assertThat(expression.stringLength()).isEmpty
        assertThat(expression.addTime()).isEmpty
        assertThat(expression.subtractTime()).isEmpty
    }

    @Test
    fun ofConstantStringRoundtrip() {
        val jsonMapper = jsonMapper()
        val expression =
            Expression.ofConstantString(
                ConstantString.builder()
                    .operator(ConstantString.Operator.CONSTANT_STRING)
                    .addInput(
                        ConstantBoolean.builder()
                            .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                            .inputs(listOf())
                            .propertyName("propertyName")
                            .value(true)
                            .build()
                    )
                    .propertyName("propertyName")
                    .value("value")
                    .build()
            )

        val roundtrippedExpression =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(expression),
                jacksonTypeRef<Expression>(),
            )

        assertThat(roundtrippedExpression).isEqualTo(expression)
    }

    @Test
    fun ofBooleanPropertyVariable() {
        val booleanPropertyVariable =
            BooleanPropertyVariable.builder()
                .operator(BooleanPropertyVariable.Operator.BOOLEAN_PROPERTY_VARIABLE)
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

        val expression = Expression.ofBooleanPropertyVariable(booleanPropertyVariable)

        assertThat(expression.constantBoolean()).isEmpty
        assertThat(expression.constantNumber()).isEmpty
        assertThat(expression.constantString()).isEmpty
        assertThat(expression.booleanPropertyVariable()).contains(booleanPropertyVariable)
        assertThat(expression.stringPropertyVariable()).isEmpty
        assertThat(expression.numberPropertyVariable()).isEmpty
        assertThat(expression.timestampOfPropertyVariable()).isEmpty
        assertThat(expression.booleanTargetPropertyVariable()).isEmpty
        assertThat(expression.stringTargetPropertyVariable()).isEmpty
        assertThat(expression.numberTargetPropertyVariable()).isEmpty
        assertThat(expression.timestampOfTargetPropertyVariable()).isEmpty
        assertThat(expression.addNumbers()).isEmpty
        assertThat(expression.subtractNumbers()).isEmpty
        assertThat(expression.multiplyNumbers()).isEmpty
        assertThat(expression.divideNumbers()).isEmpty
        assertThat(expression.roundDownNumbers()).isEmpty
        assertThat(expression.roundUpNumbers()).isEmpty
        assertThat(expression.roundNearestNumbers()).isEmpty
        assertThat(expression.upperCase()).isEmpty
        assertThat(expression.lowerCase()).isEmpty
        assertThat(expression.concatStrings()).isEmpty
        assertThat(expression.contains()).isEmpty
        assertThat(expression.beginsWith()).isEmpty
        assertThat(expression.numberToString()).isEmpty
        assertThat(expression.parseNumber()).isEmpty
        assertThat(expression.fetchExchangeRate()).isEmpty
        assertThat(expression.fetchCurrencyDecimalPlaces()).isEmpty
        assertThat(expression.fetchSingleCurrencyPortalCurrency()).isEmpty
        assertThat(expression.datedExchangeRate()).isEmpty
        assertThat(expression.pipelineProbability()).isEmpty
        assertThat(expression.maxNumbers()).isEmpty
        assertThat(expression.minNumbers()).isEmpty
        assertThat(expression.lessThan()).isEmpty
        assertThat(expression.lessThanOrEqual()).isEmpty
        assertThat(expression.moreThan()).isEmpty
        assertThat(expression.moreThanOrEqual()).isEmpty
        assertThat(expression.numberEquals()).isEmpty
        assertThat(expression.stringEquals()).isEmpty
        assertThat(expression.isPipelineStageClosed()).isEmpty
        assertThat(expression.not()).isEmpty
        assertThat(expression.date()).isEmpty
        assertThat(expression.month()).isEmpty
        assertThat(expression.year()).isEmpty
        assertThat(expression.now()).isEmpty
        assertThat(expression.timeBetween()).isEmpty
        assertThat(expression.periodToMonths()).isEmpty
        assertThat(expression.periodToWeeks()).isEmpty
        assertThat(expression.and()).isEmpty
        assertThat(expression.or()).isEmpty
        assertThat(expression.xor()).isEmpty
        assertThat(expression.ifString()).isEmpty
        assertThat(expression.ifNumber()).isEmpty
        assertThat(expression.ifBoolean()).isEmpty
        assertThat(expression.isPresent()).isEmpty
        assertThat(expression.hasEmailReply()).isEmpty
        assertThat(expression.hasPlainTextEmailReply()).isEmpty
        assertThat(expression.extractMostRecentEmailReplyHtml()).isEmpty
        assertThat(expression.extractMostRecentEmailReplyText()).isEmpty
        assertThat(expression.extractMostRecentPlainTextEmailReply()).isEmpty
        assertThat(expression.setContainsString()).isEmpty
        assertThat(expression.isEngagementType()).isEmpty
        assertThat(expression.formatFullName()).isEmpty
        assertThat(expression.absoluteValue()).isEmpty
        assertThat(expression.squareRoot()).isEmpty
        assertThat(expression.power()).isEmpty
        assertThat(expression.substring()).isEmpty
        assertThat(expression.euler()).isEmpty
        assertThat(expression.stringLength()).isEmpty
        assertThat(expression.addTime()).isEmpty
        assertThat(expression.subtractTime()).isEmpty
    }

    @Test
    fun ofBooleanPropertyVariableRoundtrip() {
        val jsonMapper = jsonMapper()
        val expression =
            Expression.ofBooleanPropertyVariable(
                BooleanPropertyVariable.builder()
                    .operator(BooleanPropertyVariable.Operator.BOOLEAN_PROPERTY_VARIABLE)
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
            )

        val roundtrippedExpression =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(expression),
                jacksonTypeRef<Expression>(),
            )

        assertThat(roundtrippedExpression).isEqualTo(expression)
    }

    @Test
    fun ofStringPropertyVariable() {
        val stringPropertyVariable =
            StringPropertyVariable.builder()
                .operator(StringPropertyVariable.Operator.STRING_PROPERTY_VARIABLE)
                .addInput(
                    ConstantBoolean.builder()
                        .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                        .inputs(listOf())
                        .propertyName("propertyName")
                        .value(true)
                        .build()
                )
                .propertyName("propertyName")
                .value("value")
                .build()

        val expression = Expression.ofStringPropertyVariable(stringPropertyVariable)

        assertThat(expression.constantBoolean()).isEmpty
        assertThat(expression.constantNumber()).isEmpty
        assertThat(expression.constantString()).isEmpty
        assertThat(expression.booleanPropertyVariable()).isEmpty
        assertThat(expression.stringPropertyVariable()).contains(stringPropertyVariable)
        assertThat(expression.numberPropertyVariable()).isEmpty
        assertThat(expression.timestampOfPropertyVariable()).isEmpty
        assertThat(expression.booleanTargetPropertyVariable()).isEmpty
        assertThat(expression.stringTargetPropertyVariable()).isEmpty
        assertThat(expression.numberTargetPropertyVariable()).isEmpty
        assertThat(expression.timestampOfTargetPropertyVariable()).isEmpty
        assertThat(expression.addNumbers()).isEmpty
        assertThat(expression.subtractNumbers()).isEmpty
        assertThat(expression.multiplyNumbers()).isEmpty
        assertThat(expression.divideNumbers()).isEmpty
        assertThat(expression.roundDownNumbers()).isEmpty
        assertThat(expression.roundUpNumbers()).isEmpty
        assertThat(expression.roundNearestNumbers()).isEmpty
        assertThat(expression.upperCase()).isEmpty
        assertThat(expression.lowerCase()).isEmpty
        assertThat(expression.concatStrings()).isEmpty
        assertThat(expression.contains()).isEmpty
        assertThat(expression.beginsWith()).isEmpty
        assertThat(expression.numberToString()).isEmpty
        assertThat(expression.parseNumber()).isEmpty
        assertThat(expression.fetchExchangeRate()).isEmpty
        assertThat(expression.fetchCurrencyDecimalPlaces()).isEmpty
        assertThat(expression.fetchSingleCurrencyPortalCurrency()).isEmpty
        assertThat(expression.datedExchangeRate()).isEmpty
        assertThat(expression.pipelineProbability()).isEmpty
        assertThat(expression.maxNumbers()).isEmpty
        assertThat(expression.minNumbers()).isEmpty
        assertThat(expression.lessThan()).isEmpty
        assertThat(expression.lessThanOrEqual()).isEmpty
        assertThat(expression.moreThan()).isEmpty
        assertThat(expression.moreThanOrEqual()).isEmpty
        assertThat(expression.numberEquals()).isEmpty
        assertThat(expression.stringEquals()).isEmpty
        assertThat(expression.isPipelineStageClosed()).isEmpty
        assertThat(expression.not()).isEmpty
        assertThat(expression.date()).isEmpty
        assertThat(expression.month()).isEmpty
        assertThat(expression.year()).isEmpty
        assertThat(expression.now()).isEmpty
        assertThat(expression.timeBetween()).isEmpty
        assertThat(expression.periodToMonths()).isEmpty
        assertThat(expression.periodToWeeks()).isEmpty
        assertThat(expression.and()).isEmpty
        assertThat(expression.or()).isEmpty
        assertThat(expression.xor()).isEmpty
        assertThat(expression.ifString()).isEmpty
        assertThat(expression.ifNumber()).isEmpty
        assertThat(expression.ifBoolean()).isEmpty
        assertThat(expression.isPresent()).isEmpty
        assertThat(expression.hasEmailReply()).isEmpty
        assertThat(expression.hasPlainTextEmailReply()).isEmpty
        assertThat(expression.extractMostRecentEmailReplyHtml()).isEmpty
        assertThat(expression.extractMostRecentEmailReplyText()).isEmpty
        assertThat(expression.extractMostRecentPlainTextEmailReply()).isEmpty
        assertThat(expression.setContainsString()).isEmpty
        assertThat(expression.isEngagementType()).isEmpty
        assertThat(expression.formatFullName()).isEmpty
        assertThat(expression.absoluteValue()).isEmpty
        assertThat(expression.squareRoot()).isEmpty
        assertThat(expression.power()).isEmpty
        assertThat(expression.substring()).isEmpty
        assertThat(expression.euler()).isEmpty
        assertThat(expression.stringLength()).isEmpty
        assertThat(expression.addTime()).isEmpty
        assertThat(expression.subtractTime()).isEmpty
    }

    @Test
    fun ofStringPropertyVariableRoundtrip() {
        val jsonMapper = jsonMapper()
        val expression =
            Expression.ofStringPropertyVariable(
                StringPropertyVariable.builder()
                    .operator(StringPropertyVariable.Operator.STRING_PROPERTY_VARIABLE)
                    .addInput(
                        ConstantBoolean.builder()
                            .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                            .inputs(listOf())
                            .propertyName("propertyName")
                            .value(true)
                            .build()
                    )
                    .propertyName("propertyName")
                    .value("value")
                    .build()
            )

        val roundtrippedExpression =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(expression),
                jacksonTypeRef<Expression>(),
            )

        assertThat(roundtrippedExpression).isEqualTo(expression)
    }

    @Test
    fun ofNumberPropertyVariable() {
        val numberPropertyVariable =
            NumberPropertyVariable.builder()
                .operator(NumberPropertyVariable.Operator.NUMBER_PROPERTY_VARIABLE)
                .addInput(
                    ConstantBoolean.builder()
                        .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                        .inputs(listOf())
                        .propertyName("propertyName")
                        .value(true)
                        .build()
                )
                .propertyName("propertyName")
                .value(0.0)
                .build()

        val expression = Expression.ofNumberPropertyVariable(numberPropertyVariable)

        assertThat(expression.constantBoolean()).isEmpty
        assertThat(expression.constantNumber()).isEmpty
        assertThat(expression.constantString()).isEmpty
        assertThat(expression.booleanPropertyVariable()).isEmpty
        assertThat(expression.stringPropertyVariable()).isEmpty
        assertThat(expression.numberPropertyVariable()).contains(numberPropertyVariable)
        assertThat(expression.timestampOfPropertyVariable()).isEmpty
        assertThat(expression.booleanTargetPropertyVariable()).isEmpty
        assertThat(expression.stringTargetPropertyVariable()).isEmpty
        assertThat(expression.numberTargetPropertyVariable()).isEmpty
        assertThat(expression.timestampOfTargetPropertyVariable()).isEmpty
        assertThat(expression.addNumbers()).isEmpty
        assertThat(expression.subtractNumbers()).isEmpty
        assertThat(expression.multiplyNumbers()).isEmpty
        assertThat(expression.divideNumbers()).isEmpty
        assertThat(expression.roundDownNumbers()).isEmpty
        assertThat(expression.roundUpNumbers()).isEmpty
        assertThat(expression.roundNearestNumbers()).isEmpty
        assertThat(expression.upperCase()).isEmpty
        assertThat(expression.lowerCase()).isEmpty
        assertThat(expression.concatStrings()).isEmpty
        assertThat(expression.contains()).isEmpty
        assertThat(expression.beginsWith()).isEmpty
        assertThat(expression.numberToString()).isEmpty
        assertThat(expression.parseNumber()).isEmpty
        assertThat(expression.fetchExchangeRate()).isEmpty
        assertThat(expression.fetchCurrencyDecimalPlaces()).isEmpty
        assertThat(expression.fetchSingleCurrencyPortalCurrency()).isEmpty
        assertThat(expression.datedExchangeRate()).isEmpty
        assertThat(expression.pipelineProbability()).isEmpty
        assertThat(expression.maxNumbers()).isEmpty
        assertThat(expression.minNumbers()).isEmpty
        assertThat(expression.lessThan()).isEmpty
        assertThat(expression.lessThanOrEqual()).isEmpty
        assertThat(expression.moreThan()).isEmpty
        assertThat(expression.moreThanOrEqual()).isEmpty
        assertThat(expression.numberEquals()).isEmpty
        assertThat(expression.stringEquals()).isEmpty
        assertThat(expression.isPipelineStageClosed()).isEmpty
        assertThat(expression.not()).isEmpty
        assertThat(expression.date()).isEmpty
        assertThat(expression.month()).isEmpty
        assertThat(expression.year()).isEmpty
        assertThat(expression.now()).isEmpty
        assertThat(expression.timeBetween()).isEmpty
        assertThat(expression.periodToMonths()).isEmpty
        assertThat(expression.periodToWeeks()).isEmpty
        assertThat(expression.and()).isEmpty
        assertThat(expression.or()).isEmpty
        assertThat(expression.xor()).isEmpty
        assertThat(expression.ifString()).isEmpty
        assertThat(expression.ifNumber()).isEmpty
        assertThat(expression.ifBoolean()).isEmpty
        assertThat(expression.isPresent()).isEmpty
        assertThat(expression.hasEmailReply()).isEmpty
        assertThat(expression.hasPlainTextEmailReply()).isEmpty
        assertThat(expression.extractMostRecentEmailReplyHtml()).isEmpty
        assertThat(expression.extractMostRecentEmailReplyText()).isEmpty
        assertThat(expression.extractMostRecentPlainTextEmailReply()).isEmpty
        assertThat(expression.setContainsString()).isEmpty
        assertThat(expression.isEngagementType()).isEmpty
        assertThat(expression.formatFullName()).isEmpty
        assertThat(expression.absoluteValue()).isEmpty
        assertThat(expression.squareRoot()).isEmpty
        assertThat(expression.power()).isEmpty
        assertThat(expression.substring()).isEmpty
        assertThat(expression.euler()).isEmpty
        assertThat(expression.stringLength()).isEmpty
        assertThat(expression.addTime()).isEmpty
        assertThat(expression.subtractTime()).isEmpty
    }

    @Test
    fun ofNumberPropertyVariableRoundtrip() {
        val jsonMapper = jsonMapper()
        val expression =
            Expression.ofNumberPropertyVariable(
                NumberPropertyVariable.builder()
                    .operator(NumberPropertyVariable.Operator.NUMBER_PROPERTY_VARIABLE)
                    .addInput(
                        ConstantBoolean.builder()
                            .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                            .inputs(listOf())
                            .propertyName("propertyName")
                            .value(true)
                            .build()
                    )
                    .propertyName("propertyName")
                    .value(0.0)
                    .build()
            )

        val roundtrippedExpression =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(expression),
                jacksonTypeRef<Expression>(),
            )

        assertThat(roundtrippedExpression).isEqualTo(expression)
    }

    @Test
    fun ofTimestampOfPropertyVariable() {
        val timestampOfPropertyVariable =
            TimestampOfPropertyVariable.builder()
                .operator(TimestampOfPropertyVariable.Operator.TIMESTAMP_OF_PROPERTY_VARIABLE)
                .addInput(
                    ConstantBoolean.builder()
                        .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                        .inputs(listOf())
                        .propertyName("propertyName")
                        .value(true)
                        .build()
                )
                .propertyName("propertyName")
                .value("value")
                .build()

        val expression = Expression.ofTimestampOfPropertyVariable(timestampOfPropertyVariable)

        assertThat(expression.constantBoolean()).isEmpty
        assertThat(expression.constantNumber()).isEmpty
        assertThat(expression.constantString()).isEmpty
        assertThat(expression.booleanPropertyVariable()).isEmpty
        assertThat(expression.stringPropertyVariable()).isEmpty
        assertThat(expression.numberPropertyVariable()).isEmpty
        assertThat(expression.timestampOfPropertyVariable()).contains(timestampOfPropertyVariable)
        assertThat(expression.booleanTargetPropertyVariable()).isEmpty
        assertThat(expression.stringTargetPropertyVariable()).isEmpty
        assertThat(expression.numberTargetPropertyVariable()).isEmpty
        assertThat(expression.timestampOfTargetPropertyVariable()).isEmpty
        assertThat(expression.addNumbers()).isEmpty
        assertThat(expression.subtractNumbers()).isEmpty
        assertThat(expression.multiplyNumbers()).isEmpty
        assertThat(expression.divideNumbers()).isEmpty
        assertThat(expression.roundDownNumbers()).isEmpty
        assertThat(expression.roundUpNumbers()).isEmpty
        assertThat(expression.roundNearestNumbers()).isEmpty
        assertThat(expression.upperCase()).isEmpty
        assertThat(expression.lowerCase()).isEmpty
        assertThat(expression.concatStrings()).isEmpty
        assertThat(expression.contains()).isEmpty
        assertThat(expression.beginsWith()).isEmpty
        assertThat(expression.numberToString()).isEmpty
        assertThat(expression.parseNumber()).isEmpty
        assertThat(expression.fetchExchangeRate()).isEmpty
        assertThat(expression.fetchCurrencyDecimalPlaces()).isEmpty
        assertThat(expression.fetchSingleCurrencyPortalCurrency()).isEmpty
        assertThat(expression.datedExchangeRate()).isEmpty
        assertThat(expression.pipelineProbability()).isEmpty
        assertThat(expression.maxNumbers()).isEmpty
        assertThat(expression.minNumbers()).isEmpty
        assertThat(expression.lessThan()).isEmpty
        assertThat(expression.lessThanOrEqual()).isEmpty
        assertThat(expression.moreThan()).isEmpty
        assertThat(expression.moreThanOrEqual()).isEmpty
        assertThat(expression.numberEquals()).isEmpty
        assertThat(expression.stringEquals()).isEmpty
        assertThat(expression.isPipelineStageClosed()).isEmpty
        assertThat(expression.not()).isEmpty
        assertThat(expression.date()).isEmpty
        assertThat(expression.month()).isEmpty
        assertThat(expression.year()).isEmpty
        assertThat(expression.now()).isEmpty
        assertThat(expression.timeBetween()).isEmpty
        assertThat(expression.periodToMonths()).isEmpty
        assertThat(expression.periodToWeeks()).isEmpty
        assertThat(expression.and()).isEmpty
        assertThat(expression.or()).isEmpty
        assertThat(expression.xor()).isEmpty
        assertThat(expression.ifString()).isEmpty
        assertThat(expression.ifNumber()).isEmpty
        assertThat(expression.ifBoolean()).isEmpty
        assertThat(expression.isPresent()).isEmpty
        assertThat(expression.hasEmailReply()).isEmpty
        assertThat(expression.hasPlainTextEmailReply()).isEmpty
        assertThat(expression.extractMostRecentEmailReplyHtml()).isEmpty
        assertThat(expression.extractMostRecentEmailReplyText()).isEmpty
        assertThat(expression.extractMostRecentPlainTextEmailReply()).isEmpty
        assertThat(expression.setContainsString()).isEmpty
        assertThat(expression.isEngagementType()).isEmpty
        assertThat(expression.formatFullName()).isEmpty
        assertThat(expression.absoluteValue()).isEmpty
        assertThat(expression.squareRoot()).isEmpty
        assertThat(expression.power()).isEmpty
        assertThat(expression.substring()).isEmpty
        assertThat(expression.euler()).isEmpty
        assertThat(expression.stringLength()).isEmpty
        assertThat(expression.addTime()).isEmpty
        assertThat(expression.subtractTime()).isEmpty
    }

    @Test
    fun ofTimestampOfPropertyVariableRoundtrip() {
        val jsonMapper = jsonMapper()
        val expression =
            Expression.ofTimestampOfPropertyVariable(
                TimestampOfPropertyVariable.builder()
                    .operator(TimestampOfPropertyVariable.Operator.TIMESTAMP_OF_PROPERTY_VARIABLE)
                    .addInput(
                        ConstantBoolean.builder()
                            .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                            .inputs(listOf())
                            .propertyName("propertyName")
                            .value(true)
                            .build()
                    )
                    .propertyName("propertyName")
                    .value("value")
                    .build()
            )

        val roundtrippedExpression =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(expression),
                jacksonTypeRef<Expression>(),
            )

        assertThat(roundtrippedExpression).isEqualTo(expression)
    }

    @Test
    fun ofBooleanTargetPropertyVariable() {
        val booleanTargetPropertyVariable =
            BooleanTargetPropertyVariable.builder()
                .operator(BooleanTargetPropertyVariable.Operator.BOOLEAN_TARGET_PROPERTY_VARIABLE)
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

        val expression = Expression.ofBooleanTargetPropertyVariable(booleanTargetPropertyVariable)

        assertThat(expression.constantBoolean()).isEmpty
        assertThat(expression.constantNumber()).isEmpty
        assertThat(expression.constantString()).isEmpty
        assertThat(expression.booleanPropertyVariable()).isEmpty
        assertThat(expression.stringPropertyVariable()).isEmpty
        assertThat(expression.numberPropertyVariable()).isEmpty
        assertThat(expression.timestampOfPropertyVariable()).isEmpty
        assertThat(expression.booleanTargetPropertyVariable())
            .contains(booleanTargetPropertyVariable)
        assertThat(expression.stringTargetPropertyVariable()).isEmpty
        assertThat(expression.numberTargetPropertyVariable()).isEmpty
        assertThat(expression.timestampOfTargetPropertyVariable()).isEmpty
        assertThat(expression.addNumbers()).isEmpty
        assertThat(expression.subtractNumbers()).isEmpty
        assertThat(expression.multiplyNumbers()).isEmpty
        assertThat(expression.divideNumbers()).isEmpty
        assertThat(expression.roundDownNumbers()).isEmpty
        assertThat(expression.roundUpNumbers()).isEmpty
        assertThat(expression.roundNearestNumbers()).isEmpty
        assertThat(expression.upperCase()).isEmpty
        assertThat(expression.lowerCase()).isEmpty
        assertThat(expression.concatStrings()).isEmpty
        assertThat(expression.contains()).isEmpty
        assertThat(expression.beginsWith()).isEmpty
        assertThat(expression.numberToString()).isEmpty
        assertThat(expression.parseNumber()).isEmpty
        assertThat(expression.fetchExchangeRate()).isEmpty
        assertThat(expression.fetchCurrencyDecimalPlaces()).isEmpty
        assertThat(expression.fetchSingleCurrencyPortalCurrency()).isEmpty
        assertThat(expression.datedExchangeRate()).isEmpty
        assertThat(expression.pipelineProbability()).isEmpty
        assertThat(expression.maxNumbers()).isEmpty
        assertThat(expression.minNumbers()).isEmpty
        assertThat(expression.lessThan()).isEmpty
        assertThat(expression.lessThanOrEqual()).isEmpty
        assertThat(expression.moreThan()).isEmpty
        assertThat(expression.moreThanOrEqual()).isEmpty
        assertThat(expression.numberEquals()).isEmpty
        assertThat(expression.stringEquals()).isEmpty
        assertThat(expression.isPipelineStageClosed()).isEmpty
        assertThat(expression.not()).isEmpty
        assertThat(expression.date()).isEmpty
        assertThat(expression.month()).isEmpty
        assertThat(expression.year()).isEmpty
        assertThat(expression.now()).isEmpty
        assertThat(expression.timeBetween()).isEmpty
        assertThat(expression.periodToMonths()).isEmpty
        assertThat(expression.periodToWeeks()).isEmpty
        assertThat(expression.and()).isEmpty
        assertThat(expression.or()).isEmpty
        assertThat(expression.xor()).isEmpty
        assertThat(expression.ifString()).isEmpty
        assertThat(expression.ifNumber()).isEmpty
        assertThat(expression.ifBoolean()).isEmpty
        assertThat(expression.isPresent()).isEmpty
        assertThat(expression.hasEmailReply()).isEmpty
        assertThat(expression.hasPlainTextEmailReply()).isEmpty
        assertThat(expression.extractMostRecentEmailReplyHtml()).isEmpty
        assertThat(expression.extractMostRecentEmailReplyText()).isEmpty
        assertThat(expression.extractMostRecentPlainTextEmailReply()).isEmpty
        assertThat(expression.setContainsString()).isEmpty
        assertThat(expression.isEngagementType()).isEmpty
        assertThat(expression.formatFullName()).isEmpty
        assertThat(expression.absoluteValue()).isEmpty
        assertThat(expression.squareRoot()).isEmpty
        assertThat(expression.power()).isEmpty
        assertThat(expression.substring()).isEmpty
        assertThat(expression.euler()).isEmpty
        assertThat(expression.stringLength()).isEmpty
        assertThat(expression.addTime()).isEmpty
        assertThat(expression.subtractTime()).isEmpty
    }

    @Test
    fun ofBooleanTargetPropertyVariableRoundtrip() {
        val jsonMapper = jsonMapper()
        val expression =
            Expression.ofBooleanTargetPropertyVariable(
                BooleanTargetPropertyVariable.builder()
                    .operator(
                        BooleanTargetPropertyVariable.Operator.BOOLEAN_TARGET_PROPERTY_VARIABLE
                    )
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
            )

        val roundtrippedExpression =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(expression),
                jacksonTypeRef<Expression>(),
            )

        assertThat(roundtrippedExpression).isEqualTo(expression)
    }

    @Test
    fun ofStringTargetPropertyVariable() {
        val stringTargetPropertyVariable =
            StringTargetPropertyVariable.builder()
                .operator(StringTargetPropertyVariable.Operator.STRING_TARGET_PROPERTY_VARIABLE)
                .addInput(
                    ConstantBoolean.builder()
                        .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                        .inputs(listOf())
                        .propertyName("propertyName")
                        .value(true)
                        .build()
                )
                .propertyName("propertyName")
                .value("value")
                .build()

        val expression = Expression.ofStringTargetPropertyVariable(stringTargetPropertyVariable)

        assertThat(expression.constantBoolean()).isEmpty
        assertThat(expression.constantNumber()).isEmpty
        assertThat(expression.constantString()).isEmpty
        assertThat(expression.booleanPropertyVariable()).isEmpty
        assertThat(expression.stringPropertyVariable()).isEmpty
        assertThat(expression.numberPropertyVariable()).isEmpty
        assertThat(expression.timestampOfPropertyVariable()).isEmpty
        assertThat(expression.booleanTargetPropertyVariable()).isEmpty
        assertThat(expression.stringTargetPropertyVariable()).contains(stringTargetPropertyVariable)
        assertThat(expression.numberTargetPropertyVariable()).isEmpty
        assertThat(expression.timestampOfTargetPropertyVariable()).isEmpty
        assertThat(expression.addNumbers()).isEmpty
        assertThat(expression.subtractNumbers()).isEmpty
        assertThat(expression.multiplyNumbers()).isEmpty
        assertThat(expression.divideNumbers()).isEmpty
        assertThat(expression.roundDownNumbers()).isEmpty
        assertThat(expression.roundUpNumbers()).isEmpty
        assertThat(expression.roundNearestNumbers()).isEmpty
        assertThat(expression.upperCase()).isEmpty
        assertThat(expression.lowerCase()).isEmpty
        assertThat(expression.concatStrings()).isEmpty
        assertThat(expression.contains()).isEmpty
        assertThat(expression.beginsWith()).isEmpty
        assertThat(expression.numberToString()).isEmpty
        assertThat(expression.parseNumber()).isEmpty
        assertThat(expression.fetchExchangeRate()).isEmpty
        assertThat(expression.fetchCurrencyDecimalPlaces()).isEmpty
        assertThat(expression.fetchSingleCurrencyPortalCurrency()).isEmpty
        assertThat(expression.datedExchangeRate()).isEmpty
        assertThat(expression.pipelineProbability()).isEmpty
        assertThat(expression.maxNumbers()).isEmpty
        assertThat(expression.minNumbers()).isEmpty
        assertThat(expression.lessThan()).isEmpty
        assertThat(expression.lessThanOrEqual()).isEmpty
        assertThat(expression.moreThan()).isEmpty
        assertThat(expression.moreThanOrEqual()).isEmpty
        assertThat(expression.numberEquals()).isEmpty
        assertThat(expression.stringEquals()).isEmpty
        assertThat(expression.isPipelineStageClosed()).isEmpty
        assertThat(expression.not()).isEmpty
        assertThat(expression.date()).isEmpty
        assertThat(expression.month()).isEmpty
        assertThat(expression.year()).isEmpty
        assertThat(expression.now()).isEmpty
        assertThat(expression.timeBetween()).isEmpty
        assertThat(expression.periodToMonths()).isEmpty
        assertThat(expression.periodToWeeks()).isEmpty
        assertThat(expression.and()).isEmpty
        assertThat(expression.or()).isEmpty
        assertThat(expression.xor()).isEmpty
        assertThat(expression.ifString()).isEmpty
        assertThat(expression.ifNumber()).isEmpty
        assertThat(expression.ifBoolean()).isEmpty
        assertThat(expression.isPresent()).isEmpty
        assertThat(expression.hasEmailReply()).isEmpty
        assertThat(expression.hasPlainTextEmailReply()).isEmpty
        assertThat(expression.extractMostRecentEmailReplyHtml()).isEmpty
        assertThat(expression.extractMostRecentEmailReplyText()).isEmpty
        assertThat(expression.extractMostRecentPlainTextEmailReply()).isEmpty
        assertThat(expression.setContainsString()).isEmpty
        assertThat(expression.isEngagementType()).isEmpty
        assertThat(expression.formatFullName()).isEmpty
        assertThat(expression.absoluteValue()).isEmpty
        assertThat(expression.squareRoot()).isEmpty
        assertThat(expression.power()).isEmpty
        assertThat(expression.substring()).isEmpty
        assertThat(expression.euler()).isEmpty
        assertThat(expression.stringLength()).isEmpty
        assertThat(expression.addTime()).isEmpty
        assertThat(expression.subtractTime()).isEmpty
    }

    @Test
    fun ofStringTargetPropertyVariableRoundtrip() {
        val jsonMapper = jsonMapper()
        val expression =
            Expression.ofStringTargetPropertyVariable(
                StringTargetPropertyVariable.builder()
                    .operator(StringTargetPropertyVariable.Operator.STRING_TARGET_PROPERTY_VARIABLE)
                    .addInput(
                        ConstantBoolean.builder()
                            .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                            .inputs(listOf())
                            .propertyName("propertyName")
                            .value(true)
                            .build()
                    )
                    .propertyName("propertyName")
                    .value("value")
                    .build()
            )

        val roundtrippedExpression =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(expression),
                jacksonTypeRef<Expression>(),
            )

        assertThat(roundtrippedExpression).isEqualTo(expression)
    }

    @Test
    fun ofNumberTargetPropertyVariable() {
        val numberTargetPropertyVariable =
            NumberTargetPropertyVariable.builder()
                .operator(NumberTargetPropertyVariable.Operator.NUMBER_TARGET_PROPERTY_VARIABLE)
                .addInput(
                    ConstantBoolean.builder()
                        .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                        .inputs(listOf())
                        .propertyName("propertyName")
                        .value(true)
                        .build()
                )
                .propertyName("propertyName")
                .value(0.0)
                .build()

        val expression = Expression.ofNumberTargetPropertyVariable(numberTargetPropertyVariable)

        assertThat(expression.constantBoolean()).isEmpty
        assertThat(expression.constantNumber()).isEmpty
        assertThat(expression.constantString()).isEmpty
        assertThat(expression.booleanPropertyVariable()).isEmpty
        assertThat(expression.stringPropertyVariable()).isEmpty
        assertThat(expression.numberPropertyVariable()).isEmpty
        assertThat(expression.timestampOfPropertyVariable()).isEmpty
        assertThat(expression.booleanTargetPropertyVariable()).isEmpty
        assertThat(expression.stringTargetPropertyVariable()).isEmpty
        assertThat(expression.numberTargetPropertyVariable()).contains(numberTargetPropertyVariable)
        assertThat(expression.timestampOfTargetPropertyVariable()).isEmpty
        assertThat(expression.addNumbers()).isEmpty
        assertThat(expression.subtractNumbers()).isEmpty
        assertThat(expression.multiplyNumbers()).isEmpty
        assertThat(expression.divideNumbers()).isEmpty
        assertThat(expression.roundDownNumbers()).isEmpty
        assertThat(expression.roundUpNumbers()).isEmpty
        assertThat(expression.roundNearestNumbers()).isEmpty
        assertThat(expression.upperCase()).isEmpty
        assertThat(expression.lowerCase()).isEmpty
        assertThat(expression.concatStrings()).isEmpty
        assertThat(expression.contains()).isEmpty
        assertThat(expression.beginsWith()).isEmpty
        assertThat(expression.numberToString()).isEmpty
        assertThat(expression.parseNumber()).isEmpty
        assertThat(expression.fetchExchangeRate()).isEmpty
        assertThat(expression.fetchCurrencyDecimalPlaces()).isEmpty
        assertThat(expression.fetchSingleCurrencyPortalCurrency()).isEmpty
        assertThat(expression.datedExchangeRate()).isEmpty
        assertThat(expression.pipelineProbability()).isEmpty
        assertThat(expression.maxNumbers()).isEmpty
        assertThat(expression.minNumbers()).isEmpty
        assertThat(expression.lessThan()).isEmpty
        assertThat(expression.lessThanOrEqual()).isEmpty
        assertThat(expression.moreThan()).isEmpty
        assertThat(expression.moreThanOrEqual()).isEmpty
        assertThat(expression.numberEquals()).isEmpty
        assertThat(expression.stringEquals()).isEmpty
        assertThat(expression.isPipelineStageClosed()).isEmpty
        assertThat(expression.not()).isEmpty
        assertThat(expression.date()).isEmpty
        assertThat(expression.month()).isEmpty
        assertThat(expression.year()).isEmpty
        assertThat(expression.now()).isEmpty
        assertThat(expression.timeBetween()).isEmpty
        assertThat(expression.periodToMonths()).isEmpty
        assertThat(expression.periodToWeeks()).isEmpty
        assertThat(expression.and()).isEmpty
        assertThat(expression.or()).isEmpty
        assertThat(expression.xor()).isEmpty
        assertThat(expression.ifString()).isEmpty
        assertThat(expression.ifNumber()).isEmpty
        assertThat(expression.ifBoolean()).isEmpty
        assertThat(expression.isPresent()).isEmpty
        assertThat(expression.hasEmailReply()).isEmpty
        assertThat(expression.hasPlainTextEmailReply()).isEmpty
        assertThat(expression.extractMostRecentEmailReplyHtml()).isEmpty
        assertThat(expression.extractMostRecentEmailReplyText()).isEmpty
        assertThat(expression.extractMostRecentPlainTextEmailReply()).isEmpty
        assertThat(expression.setContainsString()).isEmpty
        assertThat(expression.isEngagementType()).isEmpty
        assertThat(expression.formatFullName()).isEmpty
        assertThat(expression.absoluteValue()).isEmpty
        assertThat(expression.squareRoot()).isEmpty
        assertThat(expression.power()).isEmpty
        assertThat(expression.substring()).isEmpty
        assertThat(expression.euler()).isEmpty
        assertThat(expression.stringLength()).isEmpty
        assertThat(expression.addTime()).isEmpty
        assertThat(expression.subtractTime()).isEmpty
    }

    @Test
    fun ofNumberTargetPropertyVariableRoundtrip() {
        val jsonMapper = jsonMapper()
        val expression =
            Expression.ofNumberTargetPropertyVariable(
                NumberTargetPropertyVariable.builder()
                    .operator(NumberTargetPropertyVariable.Operator.NUMBER_TARGET_PROPERTY_VARIABLE)
                    .addInput(
                        ConstantBoolean.builder()
                            .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                            .inputs(listOf())
                            .propertyName("propertyName")
                            .value(true)
                            .build()
                    )
                    .propertyName("propertyName")
                    .value(0.0)
                    .build()
            )

        val roundtrippedExpression =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(expression),
                jacksonTypeRef<Expression>(),
            )

        assertThat(roundtrippedExpression).isEqualTo(expression)
    }

    @Test
    fun ofTimestampOfTargetPropertyVariable() {
        val timestampOfTargetPropertyVariable =
            TimestampOfTargetPropertyVariable.builder()
                .operator(
                    TimestampOfTargetPropertyVariable.Operator.TIMESTAMP_OF_TARGET_PROPERTY_VARIABLE
                )
                .addInput(
                    ConstantBoolean.builder()
                        .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                        .inputs(listOf())
                        .propertyName("propertyName")
                        .value(true)
                        .build()
                )
                .propertyName("propertyName")
                .value("value")
                .build()

        val expression =
            Expression.ofTimestampOfTargetPropertyVariable(timestampOfTargetPropertyVariable)

        assertThat(expression.constantBoolean()).isEmpty
        assertThat(expression.constantNumber()).isEmpty
        assertThat(expression.constantString()).isEmpty
        assertThat(expression.booleanPropertyVariable()).isEmpty
        assertThat(expression.stringPropertyVariable()).isEmpty
        assertThat(expression.numberPropertyVariable()).isEmpty
        assertThat(expression.timestampOfPropertyVariable()).isEmpty
        assertThat(expression.booleanTargetPropertyVariable()).isEmpty
        assertThat(expression.stringTargetPropertyVariable()).isEmpty
        assertThat(expression.numberTargetPropertyVariable()).isEmpty
        assertThat(expression.timestampOfTargetPropertyVariable())
            .contains(timestampOfTargetPropertyVariable)
        assertThat(expression.addNumbers()).isEmpty
        assertThat(expression.subtractNumbers()).isEmpty
        assertThat(expression.multiplyNumbers()).isEmpty
        assertThat(expression.divideNumbers()).isEmpty
        assertThat(expression.roundDownNumbers()).isEmpty
        assertThat(expression.roundUpNumbers()).isEmpty
        assertThat(expression.roundNearestNumbers()).isEmpty
        assertThat(expression.upperCase()).isEmpty
        assertThat(expression.lowerCase()).isEmpty
        assertThat(expression.concatStrings()).isEmpty
        assertThat(expression.contains()).isEmpty
        assertThat(expression.beginsWith()).isEmpty
        assertThat(expression.numberToString()).isEmpty
        assertThat(expression.parseNumber()).isEmpty
        assertThat(expression.fetchExchangeRate()).isEmpty
        assertThat(expression.fetchCurrencyDecimalPlaces()).isEmpty
        assertThat(expression.fetchSingleCurrencyPortalCurrency()).isEmpty
        assertThat(expression.datedExchangeRate()).isEmpty
        assertThat(expression.pipelineProbability()).isEmpty
        assertThat(expression.maxNumbers()).isEmpty
        assertThat(expression.minNumbers()).isEmpty
        assertThat(expression.lessThan()).isEmpty
        assertThat(expression.lessThanOrEqual()).isEmpty
        assertThat(expression.moreThan()).isEmpty
        assertThat(expression.moreThanOrEqual()).isEmpty
        assertThat(expression.numberEquals()).isEmpty
        assertThat(expression.stringEquals()).isEmpty
        assertThat(expression.isPipelineStageClosed()).isEmpty
        assertThat(expression.not()).isEmpty
        assertThat(expression.date()).isEmpty
        assertThat(expression.month()).isEmpty
        assertThat(expression.year()).isEmpty
        assertThat(expression.now()).isEmpty
        assertThat(expression.timeBetween()).isEmpty
        assertThat(expression.periodToMonths()).isEmpty
        assertThat(expression.periodToWeeks()).isEmpty
        assertThat(expression.and()).isEmpty
        assertThat(expression.or()).isEmpty
        assertThat(expression.xor()).isEmpty
        assertThat(expression.ifString()).isEmpty
        assertThat(expression.ifNumber()).isEmpty
        assertThat(expression.ifBoolean()).isEmpty
        assertThat(expression.isPresent()).isEmpty
        assertThat(expression.hasEmailReply()).isEmpty
        assertThat(expression.hasPlainTextEmailReply()).isEmpty
        assertThat(expression.extractMostRecentEmailReplyHtml()).isEmpty
        assertThat(expression.extractMostRecentEmailReplyText()).isEmpty
        assertThat(expression.extractMostRecentPlainTextEmailReply()).isEmpty
        assertThat(expression.setContainsString()).isEmpty
        assertThat(expression.isEngagementType()).isEmpty
        assertThat(expression.formatFullName()).isEmpty
        assertThat(expression.absoluteValue()).isEmpty
        assertThat(expression.squareRoot()).isEmpty
        assertThat(expression.power()).isEmpty
        assertThat(expression.substring()).isEmpty
        assertThat(expression.euler()).isEmpty
        assertThat(expression.stringLength()).isEmpty
        assertThat(expression.addTime()).isEmpty
        assertThat(expression.subtractTime()).isEmpty
    }

    @Test
    fun ofTimestampOfTargetPropertyVariableRoundtrip() {
        val jsonMapper = jsonMapper()
        val expression =
            Expression.ofTimestampOfTargetPropertyVariable(
                TimestampOfTargetPropertyVariable.builder()
                    .operator(
                        TimestampOfTargetPropertyVariable.Operator
                            .TIMESTAMP_OF_TARGET_PROPERTY_VARIABLE
                    )
                    .addInput(
                        ConstantBoolean.builder()
                            .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                            .inputs(listOf())
                            .propertyName("propertyName")
                            .value(true)
                            .build()
                    )
                    .propertyName("propertyName")
                    .value("value")
                    .build()
            )

        val roundtrippedExpression =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(expression),
                jacksonTypeRef<Expression>(),
            )

        assertThat(roundtrippedExpression).isEqualTo(expression)
    }

    @Test
    fun ofAddNumbers() {
        val addNumbers =
            AddNumbers.builder()
                .enclosedInParentheses(true)
                .operator(AddNumbers.Operator.ADD_NUMBERS)
                .addInput(
                    ConstantBoolean.builder()
                        .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                        .inputs(listOf())
                        .propertyName("propertyName")
                        .value(true)
                        .build()
                )
                .propertyName("propertyName")
                .value(0.0)
                .build()

        val expression = Expression.ofAddNumbers(addNumbers)

        assertThat(expression.constantBoolean()).isEmpty
        assertThat(expression.constantNumber()).isEmpty
        assertThat(expression.constantString()).isEmpty
        assertThat(expression.booleanPropertyVariable()).isEmpty
        assertThat(expression.stringPropertyVariable()).isEmpty
        assertThat(expression.numberPropertyVariable()).isEmpty
        assertThat(expression.timestampOfPropertyVariable()).isEmpty
        assertThat(expression.booleanTargetPropertyVariable()).isEmpty
        assertThat(expression.stringTargetPropertyVariable()).isEmpty
        assertThat(expression.numberTargetPropertyVariable()).isEmpty
        assertThat(expression.timestampOfTargetPropertyVariable()).isEmpty
        assertThat(expression.addNumbers()).contains(addNumbers)
        assertThat(expression.subtractNumbers()).isEmpty
        assertThat(expression.multiplyNumbers()).isEmpty
        assertThat(expression.divideNumbers()).isEmpty
        assertThat(expression.roundDownNumbers()).isEmpty
        assertThat(expression.roundUpNumbers()).isEmpty
        assertThat(expression.roundNearestNumbers()).isEmpty
        assertThat(expression.upperCase()).isEmpty
        assertThat(expression.lowerCase()).isEmpty
        assertThat(expression.concatStrings()).isEmpty
        assertThat(expression.contains()).isEmpty
        assertThat(expression.beginsWith()).isEmpty
        assertThat(expression.numberToString()).isEmpty
        assertThat(expression.parseNumber()).isEmpty
        assertThat(expression.fetchExchangeRate()).isEmpty
        assertThat(expression.fetchCurrencyDecimalPlaces()).isEmpty
        assertThat(expression.fetchSingleCurrencyPortalCurrency()).isEmpty
        assertThat(expression.datedExchangeRate()).isEmpty
        assertThat(expression.pipelineProbability()).isEmpty
        assertThat(expression.maxNumbers()).isEmpty
        assertThat(expression.minNumbers()).isEmpty
        assertThat(expression.lessThan()).isEmpty
        assertThat(expression.lessThanOrEqual()).isEmpty
        assertThat(expression.moreThan()).isEmpty
        assertThat(expression.moreThanOrEqual()).isEmpty
        assertThat(expression.numberEquals()).isEmpty
        assertThat(expression.stringEquals()).isEmpty
        assertThat(expression.isPipelineStageClosed()).isEmpty
        assertThat(expression.not()).isEmpty
        assertThat(expression.date()).isEmpty
        assertThat(expression.month()).isEmpty
        assertThat(expression.year()).isEmpty
        assertThat(expression.now()).isEmpty
        assertThat(expression.timeBetween()).isEmpty
        assertThat(expression.periodToMonths()).isEmpty
        assertThat(expression.periodToWeeks()).isEmpty
        assertThat(expression.and()).isEmpty
        assertThat(expression.or()).isEmpty
        assertThat(expression.xor()).isEmpty
        assertThat(expression.ifString()).isEmpty
        assertThat(expression.ifNumber()).isEmpty
        assertThat(expression.ifBoolean()).isEmpty
        assertThat(expression.isPresent()).isEmpty
        assertThat(expression.hasEmailReply()).isEmpty
        assertThat(expression.hasPlainTextEmailReply()).isEmpty
        assertThat(expression.extractMostRecentEmailReplyHtml()).isEmpty
        assertThat(expression.extractMostRecentEmailReplyText()).isEmpty
        assertThat(expression.extractMostRecentPlainTextEmailReply()).isEmpty
        assertThat(expression.setContainsString()).isEmpty
        assertThat(expression.isEngagementType()).isEmpty
        assertThat(expression.formatFullName()).isEmpty
        assertThat(expression.absoluteValue()).isEmpty
        assertThat(expression.squareRoot()).isEmpty
        assertThat(expression.power()).isEmpty
        assertThat(expression.substring()).isEmpty
        assertThat(expression.euler()).isEmpty
        assertThat(expression.stringLength()).isEmpty
        assertThat(expression.addTime()).isEmpty
        assertThat(expression.subtractTime()).isEmpty
    }

    @Test
    fun ofAddNumbersRoundtrip() {
        val jsonMapper = jsonMapper()
        val expression =
            Expression.ofAddNumbers(
                AddNumbers.builder()
                    .enclosedInParentheses(true)
                    .operator(AddNumbers.Operator.ADD_NUMBERS)
                    .addInput(
                        ConstantBoolean.builder()
                            .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                            .inputs(listOf())
                            .propertyName("propertyName")
                            .value(true)
                            .build()
                    )
                    .propertyName("propertyName")
                    .value(0.0)
                    .build()
            )

        val roundtrippedExpression =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(expression),
                jacksonTypeRef<Expression>(),
            )

        assertThat(roundtrippedExpression).isEqualTo(expression)
    }

    @Test
    fun ofSubtractNumbers() {
        val subtractNumbers =
            SubtractNumbers.builder()
                .enclosedInParentheses(true)
                .operator(SubtractNumbers.Operator.SUBTRACT_NUMBERS)
                .addInput(
                    ConstantBoolean.builder()
                        .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                        .inputs(listOf())
                        .propertyName("propertyName")
                        .value(true)
                        .build()
                )
                .propertyName("propertyName")
                .value(0.0)
                .build()

        val expression = Expression.ofSubtractNumbers(subtractNumbers)

        assertThat(expression.constantBoolean()).isEmpty
        assertThat(expression.constantNumber()).isEmpty
        assertThat(expression.constantString()).isEmpty
        assertThat(expression.booleanPropertyVariable()).isEmpty
        assertThat(expression.stringPropertyVariable()).isEmpty
        assertThat(expression.numberPropertyVariable()).isEmpty
        assertThat(expression.timestampOfPropertyVariable()).isEmpty
        assertThat(expression.booleanTargetPropertyVariable()).isEmpty
        assertThat(expression.stringTargetPropertyVariable()).isEmpty
        assertThat(expression.numberTargetPropertyVariable()).isEmpty
        assertThat(expression.timestampOfTargetPropertyVariable()).isEmpty
        assertThat(expression.addNumbers()).isEmpty
        assertThat(expression.subtractNumbers()).contains(subtractNumbers)
        assertThat(expression.multiplyNumbers()).isEmpty
        assertThat(expression.divideNumbers()).isEmpty
        assertThat(expression.roundDownNumbers()).isEmpty
        assertThat(expression.roundUpNumbers()).isEmpty
        assertThat(expression.roundNearestNumbers()).isEmpty
        assertThat(expression.upperCase()).isEmpty
        assertThat(expression.lowerCase()).isEmpty
        assertThat(expression.concatStrings()).isEmpty
        assertThat(expression.contains()).isEmpty
        assertThat(expression.beginsWith()).isEmpty
        assertThat(expression.numberToString()).isEmpty
        assertThat(expression.parseNumber()).isEmpty
        assertThat(expression.fetchExchangeRate()).isEmpty
        assertThat(expression.fetchCurrencyDecimalPlaces()).isEmpty
        assertThat(expression.fetchSingleCurrencyPortalCurrency()).isEmpty
        assertThat(expression.datedExchangeRate()).isEmpty
        assertThat(expression.pipelineProbability()).isEmpty
        assertThat(expression.maxNumbers()).isEmpty
        assertThat(expression.minNumbers()).isEmpty
        assertThat(expression.lessThan()).isEmpty
        assertThat(expression.lessThanOrEqual()).isEmpty
        assertThat(expression.moreThan()).isEmpty
        assertThat(expression.moreThanOrEqual()).isEmpty
        assertThat(expression.numberEquals()).isEmpty
        assertThat(expression.stringEquals()).isEmpty
        assertThat(expression.isPipelineStageClosed()).isEmpty
        assertThat(expression.not()).isEmpty
        assertThat(expression.date()).isEmpty
        assertThat(expression.month()).isEmpty
        assertThat(expression.year()).isEmpty
        assertThat(expression.now()).isEmpty
        assertThat(expression.timeBetween()).isEmpty
        assertThat(expression.periodToMonths()).isEmpty
        assertThat(expression.periodToWeeks()).isEmpty
        assertThat(expression.and()).isEmpty
        assertThat(expression.or()).isEmpty
        assertThat(expression.xor()).isEmpty
        assertThat(expression.ifString()).isEmpty
        assertThat(expression.ifNumber()).isEmpty
        assertThat(expression.ifBoolean()).isEmpty
        assertThat(expression.isPresent()).isEmpty
        assertThat(expression.hasEmailReply()).isEmpty
        assertThat(expression.hasPlainTextEmailReply()).isEmpty
        assertThat(expression.extractMostRecentEmailReplyHtml()).isEmpty
        assertThat(expression.extractMostRecentEmailReplyText()).isEmpty
        assertThat(expression.extractMostRecentPlainTextEmailReply()).isEmpty
        assertThat(expression.setContainsString()).isEmpty
        assertThat(expression.isEngagementType()).isEmpty
        assertThat(expression.formatFullName()).isEmpty
        assertThat(expression.absoluteValue()).isEmpty
        assertThat(expression.squareRoot()).isEmpty
        assertThat(expression.power()).isEmpty
        assertThat(expression.substring()).isEmpty
        assertThat(expression.euler()).isEmpty
        assertThat(expression.stringLength()).isEmpty
        assertThat(expression.addTime()).isEmpty
        assertThat(expression.subtractTime()).isEmpty
    }

    @Test
    fun ofSubtractNumbersRoundtrip() {
        val jsonMapper = jsonMapper()
        val expression =
            Expression.ofSubtractNumbers(
                SubtractNumbers.builder()
                    .enclosedInParentheses(true)
                    .operator(SubtractNumbers.Operator.SUBTRACT_NUMBERS)
                    .addInput(
                        ConstantBoolean.builder()
                            .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                            .inputs(listOf())
                            .propertyName("propertyName")
                            .value(true)
                            .build()
                    )
                    .propertyName("propertyName")
                    .value(0.0)
                    .build()
            )

        val roundtrippedExpression =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(expression),
                jacksonTypeRef<Expression>(),
            )

        assertThat(roundtrippedExpression).isEqualTo(expression)
    }

    @Test
    fun ofMultiplyNumbers() {
        val multiplyNumbers =
            MultiplyNumbers.builder()
                .enclosedInParentheses(true)
                .operator(MultiplyNumbers.Operator.MULTIPLY_NUMBERS)
                .addInput(
                    ConstantBoolean.builder()
                        .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                        .inputs(listOf())
                        .propertyName("propertyName")
                        .value(true)
                        .build()
                )
                .propertyName("propertyName")
                .value(0.0)
                .build()

        val expression = Expression.ofMultiplyNumbers(multiplyNumbers)

        assertThat(expression.constantBoolean()).isEmpty
        assertThat(expression.constantNumber()).isEmpty
        assertThat(expression.constantString()).isEmpty
        assertThat(expression.booleanPropertyVariable()).isEmpty
        assertThat(expression.stringPropertyVariable()).isEmpty
        assertThat(expression.numberPropertyVariable()).isEmpty
        assertThat(expression.timestampOfPropertyVariable()).isEmpty
        assertThat(expression.booleanTargetPropertyVariable()).isEmpty
        assertThat(expression.stringTargetPropertyVariable()).isEmpty
        assertThat(expression.numberTargetPropertyVariable()).isEmpty
        assertThat(expression.timestampOfTargetPropertyVariable()).isEmpty
        assertThat(expression.addNumbers()).isEmpty
        assertThat(expression.subtractNumbers()).isEmpty
        assertThat(expression.multiplyNumbers()).contains(multiplyNumbers)
        assertThat(expression.divideNumbers()).isEmpty
        assertThat(expression.roundDownNumbers()).isEmpty
        assertThat(expression.roundUpNumbers()).isEmpty
        assertThat(expression.roundNearestNumbers()).isEmpty
        assertThat(expression.upperCase()).isEmpty
        assertThat(expression.lowerCase()).isEmpty
        assertThat(expression.concatStrings()).isEmpty
        assertThat(expression.contains()).isEmpty
        assertThat(expression.beginsWith()).isEmpty
        assertThat(expression.numberToString()).isEmpty
        assertThat(expression.parseNumber()).isEmpty
        assertThat(expression.fetchExchangeRate()).isEmpty
        assertThat(expression.fetchCurrencyDecimalPlaces()).isEmpty
        assertThat(expression.fetchSingleCurrencyPortalCurrency()).isEmpty
        assertThat(expression.datedExchangeRate()).isEmpty
        assertThat(expression.pipelineProbability()).isEmpty
        assertThat(expression.maxNumbers()).isEmpty
        assertThat(expression.minNumbers()).isEmpty
        assertThat(expression.lessThan()).isEmpty
        assertThat(expression.lessThanOrEqual()).isEmpty
        assertThat(expression.moreThan()).isEmpty
        assertThat(expression.moreThanOrEqual()).isEmpty
        assertThat(expression.numberEquals()).isEmpty
        assertThat(expression.stringEquals()).isEmpty
        assertThat(expression.isPipelineStageClosed()).isEmpty
        assertThat(expression.not()).isEmpty
        assertThat(expression.date()).isEmpty
        assertThat(expression.month()).isEmpty
        assertThat(expression.year()).isEmpty
        assertThat(expression.now()).isEmpty
        assertThat(expression.timeBetween()).isEmpty
        assertThat(expression.periodToMonths()).isEmpty
        assertThat(expression.periodToWeeks()).isEmpty
        assertThat(expression.and()).isEmpty
        assertThat(expression.or()).isEmpty
        assertThat(expression.xor()).isEmpty
        assertThat(expression.ifString()).isEmpty
        assertThat(expression.ifNumber()).isEmpty
        assertThat(expression.ifBoolean()).isEmpty
        assertThat(expression.isPresent()).isEmpty
        assertThat(expression.hasEmailReply()).isEmpty
        assertThat(expression.hasPlainTextEmailReply()).isEmpty
        assertThat(expression.extractMostRecentEmailReplyHtml()).isEmpty
        assertThat(expression.extractMostRecentEmailReplyText()).isEmpty
        assertThat(expression.extractMostRecentPlainTextEmailReply()).isEmpty
        assertThat(expression.setContainsString()).isEmpty
        assertThat(expression.isEngagementType()).isEmpty
        assertThat(expression.formatFullName()).isEmpty
        assertThat(expression.absoluteValue()).isEmpty
        assertThat(expression.squareRoot()).isEmpty
        assertThat(expression.power()).isEmpty
        assertThat(expression.substring()).isEmpty
        assertThat(expression.euler()).isEmpty
        assertThat(expression.stringLength()).isEmpty
        assertThat(expression.addTime()).isEmpty
        assertThat(expression.subtractTime()).isEmpty
    }

    @Test
    fun ofMultiplyNumbersRoundtrip() {
        val jsonMapper = jsonMapper()
        val expression =
            Expression.ofMultiplyNumbers(
                MultiplyNumbers.builder()
                    .enclosedInParentheses(true)
                    .operator(MultiplyNumbers.Operator.MULTIPLY_NUMBERS)
                    .addInput(
                        ConstantBoolean.builder()
                            .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                            .inputs(listOf())
                            .propertyName("propertyName")
                            .value(true)
                            .build()
                    )
                    .propertyName("propertyName")
                    .value(0.0)
                    .build()
            )

        val roundtrippedExpression =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(expression),
                jacksonTypeRef<Expression>(),
            )

        assertThat(roundtrippedExpression).isEqualTo(expression)
    }

    @Test
    fun ofDivideNumbers() {
        val divideNumbers =
            DivideNumbers.builder()
                .enclosedInParentheses(true)
                .operator(DivideNumbers.Operator.DIVIDE_NUMBERS)
                .addInput(
                    ConstantBoolean.builder()
                        .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                        .inputs(listOf())
                        .propertyName("propertyName")
                        .value(true)
                        .build()
                )
                .propertyName("propertyName")
                .value(0.0)
                .build()

        val expression = Expression.ofDivideNumbers(divideNumbers)

        assertThat(expression.constantBoolean()).isEmpty
        assertThat(expression.constantNumber()).isEmpty
        assertThat(expression.constantString()).isEmpty
        assertThat(expression.booleanPropertyVariable()).isEmpty
        assertThat(expression.stringPropertyVariable()).isEmpty
        assertThat(expression.numberPropertyVariable()).isEmpty
        assertThat(expression.timestampOfPropertyVariable()).isEmpty
        assertThat(expression.booleanTargetPropertyVariable()).isEmpty
        assertThat(expression.stringTargetPropertyVariable()).isEmpty
        assertThat(expression.numberTargetPropertyVariable()).isEmpty
        assertThat(expression.timestampOfTargetPropertyVariable()).isEmpty
        assertThat(expression.addNumbers()).isEmpty
        assertThat(expression.subtractNumbers()).isEmpty
        assertThat(expression.multiplyNumbers()).isEmpty
        assertThat(expression.divideNumbers()).contains(divideNumbers)
        assertThat(expression.roundDownNumbers()).isEmpty
        assertThat(expression.roundUpNumbers()).isEmpty
        assertThat(expression.roundNearestNumbers()).isEmpty
        assertThat(expression.upperCase()).isEmpty
        assertThat(expression.lowerCase()).isEmpty
        assertThat(expression.concatStrings()).isEmpty
        assertThat(expression.contains()).isEmpty
        assertThat(expression.beginsWith()).isEmpty
        assertThat(expression.numberToString()).isEmpty
        assertThat(expression.parseNumber()).isEmpty
        assertThat(expression.fetchExchangeRate()).isEmpty
        assertThat(expression.fetchCurrencyDecimalPlaces()).isEmpty
        assertThat(expression.fetchSingleCurrencyPortalCurrency()).isEmpty
        assertThat(expression.datedExchangeRate()).isEmpty
        assertThat(expression.pipelineProbability()).isEmpty
        assertThat(expression.maxNumbers()).isEmpty
        assertThat(expression.minNumbers()).isEmpty
        assertThat(expression.lessThan()).isEmpty
        assertThat(expression.lessThanOrEqual()).isEmpty
        assertThat(expression.moreThan()).isEmpty
        assertThat(expression.moreThanOrEqual()).isEmpty
        assertThat(expression.numberEquals()).isEmpty
        assertThat(expression.stringEquals()).isEmpty
        assertThat(expression.isPipelineStageClosed()).isEmpty
        assertThat(expression.not()).isEmpty
        assertThat(expression.date()).isEmpty
        assertThat(expression.month()).isEmpty
        assertThat(expression.year()).isEmpty
        assertThat(expression.now()).isEmpty
        assertThat(expression.timeBetween()).isEmpty
        assertThat(expression.periodToMonths()).isEmpty
        assertThat(expression.periodToWeeks()).isEmpty
        assertThat(expression.and()).isEmpty
        assertThat(expression.or()).isEmpty
        assertThat(expression.xor()).isEmpty
        assertThat(expression.ifString()).isEmpty
        assertThat(expression.ifNumber()).isEmpty
        assertThat(expression.ifBoolean()).isEmpty
        assertThat(expression.isPresent()).isEmpty
        assertThat(expression.hasEmailReply()).isEmpty
        assertThat(expression.hasPlainTextEmailReply()).isEmpty
        assertThat(expression.extractMostRecentEmailReplyHtml()).isEmpty
        assertThat(expression.extractMostRecentEmailReplyText()).isEmpty
        assertThat(expression.extractMostRecentPlainTextEmailReply()).isEmpty
        assertThat(expression.setContainsString()).isEmpty
        assertThat(expression.isEngagementType()).isEmpty
        assertThat(expression.formatFullName()).isEmpty
        assertThat(expression.absoluteValue()).isEmpty
        assertThat(expression.squareRoot()).isEmpty
        assertThat(expression.power()).isEmpty
        assertThat(expression.substring()).isEmpty
        assertThat(expression.euler()).isEmpty
        assertThat(expression.stringLength()).isEmpty
        assertThat(expression.addTime()).isEmpty
        assertThat(expression.subtractTime()).isEmpty
    }

    @Test
    fun ofDivideNumbersRoundtrip() {
        val jsonMapper = jsonMapper()
        val expression =
            Expression.ofDivideNumbers(
                DivideNumbers.builder()
                    .enclosedInParentheses(true)
                    .operator(DivideNumbers.Operator.DIVIDE_NUMBERS)
                    .addInput(
                        ConstantBoolean.builder()
                            .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                            .inputs(listOf())
                            .propertyName("propertyName")
                            .value(true)
                            .build()
                    )
                    .propertyName("propertyName")
                    .value(0.0)
                    .build()
            )

        val roundtrippedExpression =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(expression),
                jacksonTypeRef<Expression>(),
            )

        assertThat(roundtrippedExpression).isEqualTo(expression)
    }

    @Test
    fun ofRoundDownNumbers() {
        val roundDownNumbers =
            RoundDownNumbers.builder()
                .operator(RoundDownNumbers.Operator.ROUND_DOWN)
                .addInput(
                    ConstantBoolean.builder()
                        .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                        .inputs(listOf())
                        .propertyName("propertyName")
                        .value(true)
                        .build()
                )
                .propertyName("propertyName")
                .value(0.0)
                .build()

        val expression = Expression.ofRoundDownNumbers(roundDownNumbers)

        assertThat(expression.constantBoolean()).isEmpty
        assertThat(expression.constantNumber()).isEmpty
        assertThat(expression.constantString()).isEmpty
        assertThat(expression.booleanPropertyVariable()).isEmpty
        assertThat(expression.stringPropertyVariable()).isEmpty
        assertThat(expression.numberPropertyVariable()).isEmpty
        assertThat(expression.timestampOfPropertyVariable()).isEmpty
        assertThat(expression.booleanTargetPropertyVariable()).isEmpty
        assertThat(expression.stringTargetPropertyVariable()).isEmpty
        assertThat(expression.numberTargetPropertyVariable()).isEmpty
        assertThat(expression.timestampOfTargetPropertyVariable()).isEmpty
        assertThat(expression.addNumbers()).isEmpty
        assertThat(expression.subtractNumbers()).isEmpty
        assertThat(expression.multiplyNumbers()).isEmpty
        assertThat(expression.divideNumbers()).isEmpty
        assertThat(expression.roundDownNumbers()).contains(roundDownNumbers)
        assertThat(expression.roundUpNumbers()).isEmpty
        assertThat(expression.roundNearestNumbers()).isEmpty
        assertThat(expression.upperCase()).isEmpty
        assertThat(expression.lowerCase()).isEmpty
        assertThat(expression.concatStrings()).isEmpty
        assertThat(expression.contains()).isEmpty
        assertThat(expression.beginsWith()).isEmpty
        assertThat(expression.numberToString()).isEmpty
        assertThat(expression.parseNumber()).isEmpty
        assertThat(expression.fetchExchangeRate()).isEmpty
        assertThat(expression.fetchCurrencyDecimalPlaces()).isEmpty
        assertThat(expression.fetchSingleCurrencyPortalCurrency()).isEmpty
        assertThat(expression.datedExchangeRate()).isEmpty
        assertThat(expression.pipelineProbability()).isEmpty
        assertThat(expression.maxNumbers()).isEmpty
        assertThat(expression.minNumbers()).isEmpty
        assertThat(expression.lessThan()).isEmpty
        assertThat(expression.lessThanOrEqual()).isEmpty
        assertThat(expression.moreThan()).isEmpty
        assertThat(expression.moreThanOrEqual()).isEmpty
        assertThat(expression.numberEquals()).isEmpty
        assertThat(expression.stringEquals()).isEmpty
        assertThat(expression.isPipelineStageClosed()).isEmpty
        assertThat(expression.not()).isEmpty
        assertThat(expression.date()).isEmpty
        assertThat(expression.month()).isEmpty
        assertThat(expression.year()).isEmpty
        assertThat(expression.now()).isEmpty
        assertThat(expression.timeBetween()).isEmpty
        assertThat(expression.periodToMonths()).isEmpty
        assertThat(expression.periodToWeeks()).isEmpty
        assertThat(expression.and()).isEmpty
        assertThat(expression.or()).isEmpty
        assertThat(expression.xor()).isEmpty
        assertThat(expression.ifString()).isEmpty
        assertThat(expression.ifNumber()).isEmpty
        assertThat(expression.ifBoolean()).isEmpty
        assertThat(expression.isPresent()).isEmpty
        assertThat(expression.hasEmailReply()).isEmpty
        assertThat(expression.hasPlainTextEmailReply()).isEmpty
        assertThat(expression.extractMostRecentEmailReplyHtml()).isEmpty
        assertThat(expression.extractMostRecentEmailReplyText()).isEmpty
        assertThat(expression.extractMostRecentPlainTextEmailReply()).isEmpty
        assertThat(expression.setContainsString()).isEmpty
        assertThat(expression.isEngagementType()).isEmpty
        assertThat(expression.formatFullName()).isEmpty
        assertThat(expression.absoluteValue()).isEmpty
        assertThat(expression.squareRoot()).isEmpty
        assertThat(expression.power()).isEmpty
        assertThat(expression.substring()).isEmpty
        assertThat(expression.euler()).isEmpty
        assertThat(expression.stringLength()).isEmpty
        assertThat(expression.addTime()).isEmpty
        assertThat(expression.subtractTime()).isEmpty
    }

    @Test
    fun ofRoundDownNumbersRoundtrip() {
        val jsonMapper = jsonMapper()
        val expression =
            Expression.ofRoundDownNumbers(
                RoundDownNumbers.builder()
                    .operator(RoundDownNumbers.Operator.ROUND_DOWN)
                    .addInput(
                        ConstantBoolean.builder()
                            .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                            .inputs(listOf())
                            .propertyName("propertyName")
                            .value(true)
                            .build()
                    )
                    .propertyName("propertyName")
                    .value(0.0)
                    .build()
            )

        val roundtrippedExpression =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(expression),
                jacksonTypeRef<Expression>(),
            )

        assertThat(roundtrippedExpression).isEqualTo(expression)
    }

    @Test
    fun ofRoundUpNumbers() {
        val roundUpNumbers =
            RoundUpNumbers.builder()
                .operator(RoundUpNumbers.Operator.ROUND_UP)
                .addInput(
                    ConstantBoolean.builder()
                        .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                        .inputs(listOf())
                        .propertyName("propertyName")
                        .value(true)
                        .build()
                )
                .propertyName("propertyName")
                .value(0.0)
                .build()

        val expression = Expression.ofRoundUpNumbers(roundUpNumbers)

        assertThat(expression.constantBoolean()).isEmpty
        assertThat(expression.constantNumber()).isEmpty
        assertThat(expression.constantString()).isEmpty
        assertThat(expression.booleanPropertyVariable()).isEmpty
        assertThat(expression.stringPropertyVariable()).isEmpty
        assertThat(expression.numberPropertyVariable()).isEmpty
        assertThat(expression.timestampOfPropertyVariable()).isEmpty
        assertThat(expression.booleanTargetPropertyVariable()).isEmpty
        assertThat(expression.stringTargetPropertyVariable()).isEmpty
        assertThat(expression.numberTargetPropertyVariable()).isEmpty
        assertThat(expression.timestampOfTargetPropertyVariable()).isEmpty
        assertThat(expression.addNumbers()).isEmpty
        assertThat(expression.subtractNumbers()).isEmpty
        assertThat(expression.multiplyNumbers()).isEmpty
        assertThat(expression.divideNumbers()).isEmpty
        assertThat(expression.roundDownNumbers()).isEmpty
        assertThat(expression.roundUpNumbers()).contains(roundUpNumbers)
        assertThat(expression.roundNearestNumbers()).isEmpty
        assertThat(expression.upperCase()).isEmpty
        assertThat(expression.lowerCase()).isEmpty
        assertThat(expression.concatStrings()).isEmpty
        assertThat(expression.contains()).isEmpty
        assertThat(expression.beginsWith()).isEmpty
        assertThat(expression.numberToString()).isEmpty
        assertThat(expression.parseNumber()).isEmpty
        assertThat(expression.fetchExchangeRate()).isEmpty
        assertThat(expression.fetchCurrencyDecimalPlaces()).isEmpty
        assertThat(expression.fetchSingleCurrencyPortalCurrency()).isEmpty
        assertThat(expression.datedExchangeRate()).isEmpty
        assertThat(expression.pipelineProbability()).isEmpty
        assertThat(expression.maxNumbers()).isEmpty
        assertThat(expression.minNumbers()).isEmpty
        assertThat(expression.lessThan()).isEmpty
        assertThat(expression.lessThanOrEqual()).isEmpty
        assertThat(expression.moreThan()).isEmpty
        assertThat(expression.moreThanOrEqual()).isEmpty
        assertThat(expression.numberEquals()).isEmpty
        assertThat(expression.stringEquals()).isEmpty
        assertThat(expression.isPipelineStageClosed()).isEmpty
        assertThat(expression.not()).isEmpty
        assertThat(expression.date()).isEmpty
        assertThat(expression.month()).isEmpty
        assertThat(expression.year()).isEmpty
        assertThat(expression.now()).isEmpty
        assertThat(expression.timeBetween()).isEmpty
        assertThat(expression.periodToMonths()).isEmpty
        assertThat(expression.periodToWeeks()).isEmpty
        assertThat(expression.and()).isEmpty
        assertThat(expression.or()).isEmpty
        assertThat(expression.xor()).isEmpty
        assertThat(expression.ifString()).isEmpty
        assertThat(expression.ifNumber()).isEmpty
        assertThat(expression.ifBoolean()).isEmpty
        assertThat(expression.isPresent()).isEmpty
        assertThat(expression.hasEmailReply()).isEmpty
        assertThat(expression.hasPlainTextEmailReply()).isEmpty
        assertThat(expression.extractMostRecentEmailReplyHtml()).isEmpty
        assertThat(expression.extractMostRecentEmailReplyText()).isEmpty
        assertThat(expression.extractMostRecentPlainTextEmailReply()).isEmpty
        assertThat(expression.setContainsString()).isEmpty
        assertThat(expression.isEngagementType()).isEmpty
        assertThat(expression.formatFullName()).isEmpty
        assertThat(expression.absoluteValue()).isEmpty
        assertThat(expression.squareRoot()).isEmpty
        assertThat(expression.power()).isEmpty
        assertThat(expression.substring()).isEmpty
        assertThat(expression.euler()).isEmpty
        assertThat(expression.stringLength()).isEmpty
        assertThat(expression.addTime()).isEmpty
        assertThat(expression.subtractTime()).isEmpty
    }

    @Test
    fun ofRoundUpNumbersRoundtrip() {
        val jsonMapper = jsonMapper()
        val expression =
            Expression.ofRoundUpNumbers(
                RoundUpNumbers.builder()
                    .operator(RoundUpNumbers.Operator.ROUND_UP)
                    .addInput(
                        ConstantBoolean.builder()
                            .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                            .inputs(listOf())
                            .propertyName("propertyName")
                            .value(true)
                            .build()
                    )
                    .propertyName("propertyName")
                    .value(0.0)
                    .build()
            )

        val roundtrippedExpression =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(expression),
                jacksonTypeRef<Expression>(),
            )

        assertThat(roundtrippedExpression).isEqualTo(expression)
    }

    @Test
    fun ofRoundNearestNumbers() {
        val roundNearestNumbers =
            RoundNearestNumbers.builder()
                .operator(RoundNearestNumbers.Operator.ROUND_NEAREST)
                .addInput(
                    ConstantBoolean.builder()
                        .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                        .inputs(listOf())
                        .propertyName("propertyName")
                        .value(true)
                        .build()
                )
                .propertyName("propertyName")
                .value(0.0)
                .build()

        val expression = Expression.ofRoundNearestNumbers(roundNearestNumbers)

        assertThat(expression.constantBoolean()).isEmpty
        assertThat(expression.constantNumber()).isEmpty
        assertThat(expression.constantString()).isEmpty
        assertThat(expression.booleanPropertyVariable()).isEmpty
        assertThat(expression.stringPropertyVariable()).isEmpty
        assertThat(expression.numberPropertyVariable()).isEmpty
        assertThat(expression.timestampOfPropertyVariable()).isEmpty
        assertThat(expression.booleanTargetPropertyVariable()).isEmpty
        assertThat(expression.stringTargetPropertyVariable()).isEmpty
        assertThat(expression.numberTargetPropertyVariable()).isEmpty
        assertThat(expression.timestampOfTargetPropertyVariable()).isEmpty
        assertThat(expression.addNumbers()).isEmpty
        assertThat(expression.subtractNumbers()).isEmpty
        assertThat(expression.multiplyNumbers()).isEmpty
        assertThat(expression.divideNumbers()).isEmpty
        assertThat(expression.roundDownNumbers()).isEmpty
        assertThat(expression.roundUpNumbers()).isEmpty
        assertThat(expression.roundNearestNumbers()).contains(roundNearestNumbers)
        assertThat(expression.upperCase()).isEmpty
        assertThat(expression.lowerCase()).isEmpty
        assertThat(expression.concatStrings()).isEmpty
        assertThat(expression.contains()).isEmpty
        assertThat(expression.beginsWith()).isEmpty
        assertThat(expression.numberToString()).isEmpty
        assertThat(expression.parseNumber()).isEmpty
        assertThat(expression.fetchExchangeRate()).isEmpty
        assertThat(expression.fetchCurrencyDecimalPlaces()).isEmpty
        assertThat(expression.fetchSingleCurrencyPortalCurrency()).isEmpty
        assertThat(expression.datedExchangeRate()).isEmpty
        assertThat(expression.pipelineProbability()).isEmpty
        assertThat(expression.maxNumbers()).isEmpty
        assertThat(expression.minNumbers()).isEmpty
        assertThat(expression.lessThan()).isEmpty
        assertThat(expression.lessThanOrEqual()).isEmpty
        assertThat(expression.moreThan()).isEmpty
        assertThat(expression.moreThanOrEqual()).isEmpty
        assertThat(expression.numberEquals()).isEmpty
        assertThat(expression.stringEquals()).isEmpty
        assertThat(expression.isPipelineStageClosed()).isEmpty
        assertThat(expression.not()).isEmpty
        assertThat(expression.date()).isEmpty
        assertThat(expression.month()).isEmpty
        assertThat(expression.year()).isEmpty
        assertThat(expression.now()).isEmpty
        assertThat(expression.timeBetween()).isEmpty
        assertThat(expression.periodToMonths()).isEmpty
        assertThat(expression.periodToWeeks()).isEmpty
        assertThat(expression.and()).isEmpty
        assertThat(expression.or()).isEmpty
        assertThat(expression.xor()).isEmpty
        assertThat(expression.ifString()).isEmpty
        assertThat(expression.ifNumber()).isEmpty
        assertThat(expression.ifBoolean()).isEmpty
        assertThat(expression.isPresent()).isEmpty
        assertThat(expression.hasEmailReply()).isEmpty
        assertThat(expression.hasPlainTextEmailReply()).isEmpty
        assertThat(expression.extractMostRecentEmailReplyHtml()).isEmpty
        assertThat(expression.extractMostRecentEmailReplyText()).isEmpty
        assertThat(expression.extractMostRecentPlainTextEmailReply()).isEmpty
        assertThat(expression.setContainsString()).isEmpty
        assertThat(expression.isEngagementType()).isEmpty
        assertThat(expression.formatFullName()).isEmpty
        assertThat(expression.absoluteValue()).isEmpty
        assertThat(expression.squareRoot()).isEmpty
        assertThat(expression.power()).isEmpty
        assertThat(expression.substring()).isEmpty
        assertThat(expression.euler()).isEmpty
        assertThat(expression.stringLength()).isEmpty
        assertThat(expression.addTime()).isEmpty
        assertThat(expression.subtractTime()).isEmpty
    }

    @Test
    fun ofRoundNearestNumbersRoundtrip() {
        val jsonMapper = jsonMapper()
        val expression =
            Expression.ofRoundNearestNumbers(
                RoundNearestNumbers.builder()
                    .operator(RoundNearestNumbers.Operator.ROUND_NEAREST)
                    .addInput(
                        ConstantBoolean.builder()
                            .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                            .inputs(listOf())
                            .propertyName("propertyName")
                            .value(true)
                            .build()
                    )
                    .propertyName("propertyName")
                    .value(0.0)
                    .build()
            )

        val roundtrippedExpression =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(expression),
                jacksonTypeRef<Expression>(),
            )

        assertThat(roundtrippedExpression).isEqualTo(expression)
    }

    @Test
    fun ofUpperCase() {
        val upperCase =
            UpperCase.builder()
                .operator(UpperCase.Operator.UPPER_CASE)
                .addInput(
                    ConstantBoolean.builder()
                        .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                        .inputs(listOf())
                        .propertyName("propertyName")
                        .value(true)
                        .build()
                )
                .propertyName("propertyName")
                .value("value")
                .build()

        val expression = Expression.ofUpperCase(upperCase)

        assertThat(expression.constantBoolean()).isEmpty
        assertThat(expression.constantNumber()).isEmpty
        assertThat(expression.constantString()).isEmpty
        assertThat(expression.booleanPropertyVariable()).isEmpty
        assertThat(expression.stringPropertyVariable()).isEmpty
        assertThat(expression.numberPropertyVariable()).isEmpty
        assertThat(expression.timestampOfPropertyVariable()).isEmpty
        assertThat(expression.booleanTargetPropertyVariable()).isEmpty
        assertThat(expression.stringTargetPropertyVariable()).isEmpty
        assertThat(expression.numberTargetPropertyVariable()).isEmpty
        assertThat(expression.timestampOfTargetPropertyVariable()).isEmpty
        assertThat(expression.addNumbers()).isEmpty
        assertThat(expression.subtractNumbers()).isEmpty
        assertThat(expression.multiplyNumbers()).isEmpty
        assertThat(expression.divideNumbers()).isEmpty
        assertThat(expression.roundDownNumbers()).isEmpty
        assertThat(expression.roundUpNumbers()).isEmpty
        assertThat(expression.roundNearestNumbers()).isEmpty
        assertThat(expression.upperCase()).contains(upperCase)
        assertThat(expression.lowerCase()).isEmpty
        assertThat(expression.concatStrings()).isEmpty
        assertThat(expression.contains()).isEmpty
        assertThat(expression.beginsWith()).isEmpty
        assertThat(expression.numberToString()).isEmpty
        assertThat(expression.parseNumber()).isEmpty
        assertThat(expression.fetchExchangeRate()).isEmpty
        assertThat(expression.fetchCurrencyDecimalPlaces()).isEmpty
        assertThat(expression.fetchSingleCurrencyPortalCurrency()).isEmpty
        assertThat(expression.datedExchangeRate()).isEmpty
        assertThat(expression.pipelineProbability()).isEmpty
        assertThat(expression.maxNumbers()).isEmpty
        assertThat(expression.minNumbers()).isEmpty
        assertThat(expression.lessThan()).isEmpty
        assertThat(expression.lessThanOrEqual()).isEmpty
        assertThat(expression.moreThan()).isEmpty
        assertThat(expression.moreThanOrEqual()).isEmpty
        assertThat(expression.numberEquals()).isEmpty
        assertThat(expression.stringEquals()).isEmpty
        assertThat(expression.isPipelineStageClosed()).isEmpty
        assertThat(expression.not()).isEmpty
        assertThat(expression.date()).isEmpty
        assertThat(expression.month()).isEmpty
        assertThat(expression.year()).isEmpty
        assertThat(expression.now()).isEmpty
        assertThat(expression.timeBetween()).isEmpty
        assertThat(expression.periodToMonths()).isEmpty
        assertThat(expression.periodToWeeks()).isEmpty
        assertThat(expression.and()).isEmpty
        assertThat(expression.or()).isEmpty
        assertThat(expression.xor()).isEmpty
        assertThat(expression.ifString()).isEmpty
        assertThat(expression.ifNumber()).isEmpty
        assertThat(expression.ifBoolean()).isEmpty
        assertThat(expression.isPresent()).isEmpty
        assertThat(expression.hasEmailReply()).isEmpty
        assertThat(expression.hasPlainTextEmailReply()).isEmpty
        assertThat(expression.extractMostRecentEmailReplyHtml()).isEmpty
        assertThat(expression.extractMostRecentEmailReplyText()).isEmpty
        assertThat(expression.extractMostRecentPlainTextEmailReply()).isEmpty
        assertThat(expression.setContainsString()).isEmpty
        assertThat(expression.isEngagementType()).isEmpty
        assertThat(expression.formatFullName()).isEmpty
        assertThat(expression.absoluteValue()).isEmpty
        assertThat(expression.squareRoot()).isEmpty
        assertThat(expression.power()).isEmpty
        assertThat(expression.substring()).isEmpty
        assertThat(expression.euler()).isEmpty
        assertThat(expression.stringLength()).isEmpty
        assertThat(expression.addTime()).isEmpty
        assertThat(expression.subtractTime()).isEmpty
    }

    @Test
    fun ofUpperCaseRoundtrip() {
        val jsonMapper = jsonMapper()
        val expression =
            Expression.ofUpperCase(
                UpperCase.builder()
                    .operator(UpperCase.Operator.UPPER_CASE)
                    .addInput(
                        ConstantBoolean.builder()
                            .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                            .inputs(listOf())
                            .propertyName("propertyName")
                            .value(true)
                            .build()
                    )
                    .propertyName("propertyName")
                    .value("value")
                    .build()
            )

        val roundtrippedExpression =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(expression),
                jacksonTypeRef<Expression>(),
            )

        assertThat(roundtrippedExpression).isEqualTo(expression)
    }

    @Test
    fun ofLowerCase() {
        val lowerCase =
            LowerCase.builder()
                .operator(LowerCase.Operator.LOWER_CASE)
                .addInput(
                    ConstantBoolean.builder()
                        .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                        .inputs(listOf())
                        .propertyName("propertyName")
                        .value(true)
                        .build()
                )
                .propertyName("propertyName")
                .value("value")
                .build()

        val expression = Expression.ofLowerCase(lowerCase)

        assertThat(expression.constantBoolean()).isEmpty
        assertThat(expression.constantNumber()).isEmpty
        assertThat(expression.constantString()).isEmpty
        assertThat(expression.booleanPropertyVariable()).isEmpty
        assertThat(expression.stringPropertyVariable()).isEmpty
        assertThat(expression.numberPropertyVariable()).isEmpty
        assertThat(expression.timestampOfPropertyVariable()).isEmpty
        assertThat(expression.booleanTargetPropertyVariable()).isEmpty
        assertThat(expression.stringTargetPropertyVariable()).isEmpty
        assertThat(expression.numberTargetPropertyVariable()).isEmpty
        assertThat(expression.timestampOfTargetPropertyVariable()).isEmpty
        assertThat(expression.addNumbers()).isEmpty
        assertThat(expression.subtractNumbers()).isEmpty
        assertThat(expression.multiplyNumbers()).isEmpty
        assertThat(expression.divideNumbers()).isEmpty
        assertThat(expression.roundDownNumbers()).isEmpty
        assertThat(expression.roundUpNumbers()).isEmpty
        assertThat(expression.roundNearestNumbers()).isEmpty
        assertThat(expression.upperCase()).isEmpty
        assertThat(expression.lowerCase()).contains(lowerCase)
        assertThat(expression.concatStrings()).isEmpty
        assertThat(expression.contains()).isEmpty
        assertThat(expression.beginsWith()).isEmpty
        assertThat(expression.numberToString()).isEmpty
        assertThat(expression.parseNumber()).isEmpty
        assertThat(expression.fetchExchangeRate()).isEmpty
        assertThat(expression.fetchCurrencyDecimalPlaces()).isEmpty
        assertThat(expression.fetchSingleCurrencyPortalCurrency()).isEmpty
        assertThat(expression.datedExchangeRate()).isEmpty
        assertThat(expression.pipelineProbability()).isEmpty
        assertThat(expression.maxNumbers()).isEmpty
        assertThat(expression.minNumbers()).isEmpty
        assertThat(expression.lessThan()).isEmpty
        assertThat(expression.lessThanOrEqual()).isEmpty
        assertThat(expression.moreThan()).isEmpty
        assertThat(expression.moreThanOrEqual()).isEmpty
        assertThat(expression.numberEquals()).isEmpty
        assertThat(expression.stringEquals()).isEmpty
        assertThat(expression.isPipelineStageClosed()).isEmpty
        assertThat(expression.not()).isEmpty
        assertThat(expression.date()).isEmpty
        assertThat(expression.month()).isEmpty
        assertThat(expression.year()).isEmpty
        assertThat(expression.now()).isEmpty
        assertThat(expression.timeBetween()).isEmpty
        assertThat(expression.periodToMonths()).isEmpty
        assertThat(expression.periodToWeeks()).isEmpty
        assertThat(expression.and()).isEmpty
        assertThat(expression.or()).isEmpty
        assertThat(expression.xor()).isEmpty
        assertThat(expression.ifString()).isEmpty
        assertThat(expression.ifNumber()).isEmpty
        assertThat(expression.ifBoolean()).isEmpty
        assertThat(expression.isPresent()).isEmpty
        assertThat(expression.hasEmailReply()).isEmpty
        assertThat(expression.hasPlainTextEmailReply()).isEmpty
        assertThat(expression.extractMostRecentEmailReplyHtml()).isEmpty
        assertThat(expression.extractMostRecentEmailReplyText()).isEmpty
        assertThat(expression.extractMostRecentPlainTextEmailReply()).isEmpty
        assertThat(expression.setContainsString()).isEmpty
        assertThat(expression.isEngagementType()).isEmpty
        assertThat(expression.formatFullName()).isEmpty
        assertThat(expression.absoluteValue()).isEmpty
        assertThat(expression.squareRoot()).isEmpty
        assertThat(expression.power()).isEmpty
        assertThat(expression.substring()).isEmpty
        assertThat(expression.euler()).isEmpty
        assertThat(expression.stringLength()).isEmpty
        assertThat(expression.addTime()).isEmpty
        assertThat(expression.subtractTime()).isEmpty
    }

    @Test
    fun ofLowerCaseRoundtrip() {
        val jsonMapper = jsonMapper()
        val expression =
            Expression.ofLowerCase(
                LowerCase.builder()
                    .operator(LowerCase.Operator.LOWER_CASE)
                    .addInput(
                        ConstantBoolean.builder()
                            .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                            .inputs(listOf())
                            .propertyName("propertyName")
                            .value(true)
                            .build()
                    )
                    .propertyName("propertyName")
                    .value("value")
                    .build()
            )

        val roundtrippedExpression =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(expression),
                jacksonTypeRef<Expression>(),
            )

        assertThat(roundtrippedExpression).isEqualTo(expression)
    }

    @Test
    fun ofConcatStrings() {
        val concatStrings =
            ConcatStrings.builder()
                .operator(ConcatStrings.Operator.CONCAT_STRINGS)
                .addInput(
                    ConstantBoolean.builder()
                        .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                        .inputs(listOf())
                        .propertyName("propertyName")
                        .value(true)
                        .build()
                )
                .propertyName("propertyName")
                .value("value")
                .build()

        val expression = Expression.ofConcatStrings(concatStrings)

        assertThat(expression.constantBoolean()).isEmpty
        assertThat(expression.constantNumber()).isEmpty
        assertThat(expression.constantString()).isEmpty
        assertThat(expression.booleanPropertyVariable()).isEmpty
        assertThat(expression.stringPropertyVariable()).isEmpty
        assertThat(expression.numberPropertyVariable()).isEmpty
        assertThat(expression.timestampOfPropertyVariable()).isEmpty
        assertThat(expression.booleanTargetPropertyVariable()).isEmpty
        assertThat(expression.stringTargetPropertyVariable()).isEmpty
        assertThat(expression.numberTargetPropertyVariable()).isEmpty
        assertThat(expression.timestampOfTargetPropertyVariable()).isEmpty
        assertThat(expression.addNumbers()).isEmpty
        assertThat(expression.subtractNumbers()).isEmpty
        assertThat(expression.multiplyNumbers()).isEmpty
        assertThat(expression.divideNumbers()).isEmpty
        assertThat(expression.roundDownNumbers()).isEmpty
        assertThat(expression.roundUpNumbers()).isEmpty
        assertThat(expression.roundNearestNumbers()).isEmpty
        assertThat(expression.upperCase()).isEmpty
        assertThat(expression.lowerCase()).isEmpty
        assertThat(expression.concatStrings()).contains(concatStrings)
        assertThat(expression.contains()).isEmpty
        assertThat(expression.beginsWith()).isEmpty
        assertThat(expression.numberToString()).isEmpty
        assertThat(expression.parseNumber()).isEmpty
        assertThat(expression.fetchExchangeRate()).isEmpty
        assertThat(expression.fetchCurrencyDecimalPlaces()).isEmpty
        assertThat(expression.fetchSingleCurrencyPortalCurrency()).isEmpty
        assertThat(expression.datedExchangeRate()).isEmpty
        assertThat(expression.pipelineProbability()).isEmpty
        assertThat(expression.maxNumbers()).isEmpty
        assertThat(expression.minNumbers()).isEmpty
        assertThat(expression.lessThan()).isEmpty
        assertThat(expression.lessThanOrEqual()).isEmpty
        assertThat(expression.moreThan()).isEmpty
        assertThat(expression.moreThanOrEqual()).isEmpty
        assertThat(expression.numberEquals()).isEmpty
        assertThat(expression.stringEquals()).isEmpty
        assertThat(expression.isPipelineStageClosed()).isEmpty
        assertThat(expression.not()).isEmpty
        assertThat(expression.date()).isEmpty
        assertThat(expression.month()).isEmpty
        assertThat(expression.year()).isEmpty
        assertThat(expression.now()).isEmpty
        assertThat(expression.timeBetween()).isEmpty
        assertThat(expression.periodToMonths()).isEmpty
        assertThat(expression.periodToWeeks()).isEmpty
        assertThat(expression.and()).isEmpty
        assertThat(expression.or()).isEmpty
        assertThat(expression.xor()).isEmpty
        assertThat(expression.ifString()).isEmpty
        assertThat(expression.ifNumber()).isEmpty
        assertThat(expression.ifBoolean()).isEmpty
        assertThat(expression.isPresent()).isEmpty
        assertThat(expression.hasEmailReply()).isEmpty
        assertThat(expression.hasPlainTextEmailReply()).isEmpty
        assertThat(expression.extractMostRecentEmailReplyHtml()).isEmpty
        assertThat(expression.extractMostRecentEmailReplyText()).isEmpty
        assertThat(expression.extractMostRecentPlainTextEmailReply()).isEmpty
        assertThat(expression.setContainsString()).isEmpty
        assertThat(expression.isEngagementType()).isEmpty
        assertThat(expression.formatFullName()).isEmpty
        assertThat(expression.absoluteValue()).isEmpty
        assertThat(expression.squareRoot()).isEmpty
        assertThat(expression.power()).isEmpty
        assertThat(expression.substring()).isEmpty
        assertThat(expression.euler()).isEmpty
        assertThat(expression.stringLength()).isEmpty
        assertThat(expression.addTime()).isEmpty
        assertThat(expression.subtractTime()).isEmpty
    }

    @Test
    fun ofConcatStringsRoundtrip() {
        val jsonMapper = jsonMapper()
        val expression =
            Expression.ofConcatStrings(
                ConcatStrings.builder()
                    .operator(ConcatStrings.Operator.CONCAT_STRINGS)
                    .addInput(
                        ConstantBoolean.builder()
                            .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                            .inputs(listOf())
                            .propertyName("propertyName")
                            .value(true)
                            .build()
                    )
                    .propertyName("propertyName")
                    .value("value")
                    .build()
            )

        val roundtrippedExpression =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(expression),
                jacksonTypeRef<Expression>(),
            )

        assertThat(roundtrippedExpression).isEqualTo(expression)
    }

    @Test
    fun ofContains() {
        val contains =
            Contains.builder()
                .operator(Contains.Operator.CONTAINS)
                .stringToCheck(
                    ConstantBoolean.builder()
                        .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                        .inputs(listOf())
                        .propertyName("propertyName")
                        .value(true)
                        .build()
                )
                .inputs(listOf())
                .propertyName("propertyName")
                .value(true)
                .build()

        val expression = Expression.ofContains(contains)

        assertThat(expression.constantBoolean()).isEmpty
        assertThat(expression.constantNumber()).isEmpty
        assertThat(expression.constantString()).isEmpty
        assertThat(expression.booleanPropertyVariable()).isEmpty
        assertThat(expression.stringPropertyVariable()).isEmpty
        assertThat(expression.numberPropertyVariable()).isEmpty
        assertThat(expression.timestampOfPropertyVariable()).isEmpty
        assertThat(expression.booleanTargetPropertyVariable()).isEmpty
        assertThat(expression.stringTargetPropertyVariable()).isEmpty
        assertThat(expression.numberTargetPropertyVariable()).isEmpty
        assertThat(expression.timestampOfTargetPropertyVariable()).isEmpty
        assertThat(expression.addNumbers()).isEmpty
        assertThat(expression.subtractNumbers()).isEmpty
        assertThat(expression.multiplyNumbers()).isEmpty
        assertThat(expression.divideNumbers()).isEmpty
        assertThat(expression.roundDownNumbers()).isEmpty
        assertThat(expression.roundUpNumbers()).isEmpty
        assertThat(expression.roundNearestNumbers()).isEmpty
        assertThat(expression.upperCase()).isEmpty
        assertThat(expression.lowerCase()).isEmpty
        assertThat(expression.concatStrings()).isEmpty
        assertThat(expression.contains()).contains(contains)
        assertThat(expression.beginsWith()).isEmpty
        assertThat(expression.numberToString()).isEmpty
        assertThat(expression.parseNumber()).isEmpty
        assertThat(expression.fetchExchangeRate()).isEmpty
        assertThat(expression.fetchCurrencyDecimalPlaces()).isEmpty
        assertThat(expression.fetchSingleCurrencyPortalCurrency()).isEmpty
        assertThat(expression.datedExchangeRate()).isEmpty
        assertThat(expression.pipelineProbability()).isEmpty
        assertThat(expression.maxNumbers()).isEmpty
        assertThat(expression.minNumbers()).isEmpty
        assertThat(expression.lessThan()).isEmpty
        assertThat(expression.lessThanOrEqual()).isEmpty
        assertThat(expression.moreThan()).isEmpty
        assertThat(expression.moreThanOrEqual()).isEmpty
        assertThat(expression.numberEquals()).isEmpty
        assertThat(expression.stringEquals()).isEmpty
        assertThat(expression.isPipelineStageClosed()).isEmpty
        assertThat(expression.not()).isEmpty
        assertThat(expression.date()).isEmpty
        assertThat(expression.month()).isEmpty
        assertThat(expression.year()).isEmpty
        assertThat(expression.now()).isEmpty
        assertThat(expression.timeBetween()).isEmpty
        assertThat(expression.periodToMonths()).isEmpty
        assertThat(expression.periodToWeeks()).isEmpty
        assertThat(expression.and()).isEmpty
        assertThat(expression.or()).isEmpty
        assertThat(expression.xor()).isEmpty
        assertThat(expression.ifString()).isEmpty
        assertThat(expression.ifNumber()).isEmpty
        assertThat(expression.ifBoolean()).isEmpty
        assertThat(expression.isPresent()).isEmpty
        assertThat(expression.hasEmailReply()).isEmpty
        assertThat(expression.hasPlainTextEmailReply()).isEmpty
        assertThat(expression.extractMostRecentEmailReplyHtml()).isEmpty
        assertThat(expression.extractMostRecentEmailReplyText()).isEmpty
        assertThat(expression.extractMostRecentPlainTextEmailReply()).isEmpty
        assertThat(expression.setContainsString()).isEmpty
        assertThat(expression.isEngagementType()).isEmpty
        assertThat(expression.formatFullName()).isEmpty
        assertThat(expression.absoluteValue()).isEmpty
        assertThat(expression.squareRoot()).isEmpty
        assertThat(expression.power()).isEmpty
        assertThat(expression.substring()).isEmpty
        assertThat(expression.euler()).isEmpty
        assertThat(expression.stringLength()).isEmpty
        assertThat(expression.addTime()).isEmpty
        assertThat(expression.subtractTime()).isEmpty
    }

    @Test
    fun ofContainsRoundtrip() {
        val jsonMapper = jsonMapper()
        val expression =
            Expression.ofContains(
                Contains.builder()
                    .operator(Contains.Operator.CONTAINS)
                    .stringToCheck(
                        ConstantBoolean.builder()
                            .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                            .inputs(listOf())
                            .propertyName("propertyName")
                            .value(true)
                            .build()
                    )
                    .inputs(listOf())
                    .propertyName("propertyName")
                    .value(true)
                    .build()
            )

        val roundtrippedExpression =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(expression),
                jacksonTypeRef<Expression>(),
            )

        assertThat(roundtrippedExpression).isEqualTo(expression)
    }

    @Test
    fun ofBeginsWith() {
        val beginsWith =
            BeginsWith.builder()
                .operator(BeginsWith.Operator.BEGINS_WITH)
                .stringToCheck(
                    ConstantBoolean.builder()
                        .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                        .inputs(listOf())
                        .propertyName("propertyName")
                        .value(true)
                        .build()
                )
                .inputs(listOf())
                .propertyName("propertyName")
                .value(true)
                .build()

        val expression = Expression.ofBeginsWith(beginsWith)

        assertThat(expression.constantBoolean()).isEmpty
        assertThat(expression.constantNumber()).isEmpty
        assertThat(expression.constantString()).isEmpty
        assertThat(expression.booleanPropertyVariable()).isEmpty
        assertThat(expression.stringPropertyVariable()).isEmpty
        assertThat(expression.numberPropertyVariable()).isEmpty
        assertThat(expression.timestampOfPropertyVariable()).isEmpty
        assertThat(expression.booleanTargetPropertyVariable()).isEmpty
        assertThat(expression.stringTargetPropertyVariable()).isEmpty
        assertThat(expression.numberTargetPropertyVariable()).isEmpty
        assertThat(expression.timestampOfTargetPropertyVariable()).isEmpty
        assertThat(expression.addNumbers()).isEmpty
        assertThat(expression.subtractNumbers()).isEmpty
        assertThat(expression.multiplyNumbers()).isEmpty
        assertThat(expression.divideNumbers()).isEmpty
        assertThat(expression.roundDownNumbers()).isEmpty
        assertThat(expression.roundUpNumbers()).isEmpty
        assertThat(expression.roundNearestNumbers()).isEmpty
        assertThat(expression.upperCase()).isEmpty
        assertThat(expression.lowerCase()).isEmpty
        assertThat(expression.concatStrings()).isEmpty
        assertThat(expression.contains()).isEmpty
        assertThat(expression.beginsWith()).contains(beginsWith)
        assertThat(expression.numberToString()).isEmpty
        assertThat(expression.parseNumber()).isEmpty
        assertThat(expression.fetchExchangeRate()).isEmpty
        assertThat(expression.fetchCurrencyDecimalPlaces()).isEmpty
        assertThat(expression.fetchSingleCurrencyPortalCurrency()).isEmpty
        assertThat(expression.datedExchangeRate()).isEmpty
        assertThat(expression.pipelineProbability()).isEmpty
        assertThat(expression.maxNumbers()).isEmpty
        assertThat(expression.minNumbers()).isEmpty
        assertThat(expression.lessThan()).isEmpty
        assertThat(expression.lessThanOrEqual()).isEmpty
        assertThat(expression.moreThan()).isEmpty
        assertThat(expression.moreThanOrEqual()).isEmpty
        assertThat(expression.numberEquals()).isEmpty
        assertThat(expression.stringEquals()).isEmpty
        assertThat(expression.isPipelineStageClosed()).isEmpty
        assertThat(expression.not()).isEmpty
        assertThat(expression.date()).isEmpty
        assertThat(expression.month()).isEmpty
        assertThat(expression.year()).isEmpty
        assertThat(expression.now()).isEmpty
        assertThat(expression.timeBetween()).isEmpty
        assertThat(expression.periodToMonths()).isEmpty
        assertThat(expression.periodToWeeks()).isEmpty
        assertThat(expression.and()).isEmpty
        assertThat(expression.or()).isEmpty
        assertThat(expression.xor()).isEmpty
        assertThat(expression.ifString()).isEmpty
        assertThat(expression.ifNumber()).isEmpty
        assertThat(expression.ifBoolean()).isEmpty
        assertThat(expression.isPresent()).isEmpty
        assertThat(expression.hasEmailReply()).isEmpty
        assertThat(expression.hasPlainTextEmailReply()).isEmpty
        assertThat(expression.extractMostRecentEmailReplyHtml()).isEmpty
        assertThat(expression.extractMostRecentEmailReplyText()).isEmpty
        assertThat(expression.extractMostRecentPlainTextEmailReply()).isEmpty
        assertThat(expression.setContainsString()).isEmpty
        assertThat(expression.isEngagementType()).isEmpty
        assertThat(expression.formatFullName()).isEmpty
        assertThat(expression.absoluteValue()).isEmpty
        assertThat(expression.squareRoot()).isEmpty
        assertThat(expression.power()).isEmpty
        assertThat(expression.substring()).isEmpty
        assertThat(expression.euler()).isEmpty
        assertThat(expression.stringLength()).isEmpty
        assertThat(expression.addTime()).isEmpty
        assertThat(expression.subtractTime()).isEmpty
    }

    @Test
    fun ofBeginsWithRoundtrip() {
        val jsonMapper = jsonMapper()
        val expression =
            Expression.ofBeginsWith(
                BeginsWith.builder()
                    .operator(BeginsWith.Operator.BEGINS_WITH)
                    .stringToCheck(
                        ConstantBoolean.builder()
                            .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                            .inputs(listOf())
                            .propertyName("propertyName")
                            .value(true)
                            .build()
                    )
                    .inputs(listOf())
                    .propertyName("propertyName")
                    .value(true)
                    .build()
            )

        val roundtrippedExpression =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(expression),
                jacksonTypeRef<Expression>(),
            )

        assertThat(roundtrippedExpression).isEqualTo(expression)
    }

    @Test
    fun ofNumberToString() {
        val numberToString =
            NumberToString.builder()
                .operator(NumberToString.Operator.NUMBER_TO_STRING)
                .addInput(
                    ConstantBoolean.builder()
                        .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                        .inputs(listOf())
                        .propertyName("propertyName")
                        .value(true)
                        .build()
                )
                .propertyName("propertyName")
                .value("value")
                .build()

        val expression = Expression.ofNumberToString(numberToString)

        assertThat(expression.constantBoolean()).isEmpty
        assertThat(expression.constantNumber()).isEmpty
        assertThat(expression.constantString()).isEmpty
        assertThat(expression.booleanPropertyVariable()).isEmpty
        assertThat(expression.stringPropertyVariable()).isEmpty
        assertThat(expression.numberPropertyVariable()).isEmpty
        assertThat(expression.timestampOfPropertyVariable()).isEmpty
        assertThat(expression.booleanTargetPropertyVariable()).isEmpty
        assertThat(expression.stringTargetPropertyVariable()).isEmpty
        assertThat(expression.numberTargetPropertyVariable()).isEmpty
        assertThat(expression.timestampOfTargetPropertyVariable()).isEmpty
        assertThat(expression.addNumbers()).isEmpty
        assertThat(expression.subtractNumbers()).isEmpty
        assertThat(expression.multiplyNumbers()).isEmpty
        assertThat(expression.divideNumbers()).isEmpty
        assertThat(expression.roundDownNumbers()).isEmpty
        assertThat(expression.roundUpNumbers()).isEmpty
        assertThat(expression.roundNearestNumbers()).isEmpty
        assertThat(expression.upperCase()).isEmpty
        assertThat(expression.lowerCase()).isEmpty
        assertThat(expression.concatStrings()).isEmpty
        assertThat(expression.contains()).isEmpty
        assertThat(expression.beginsWith()).isEmpty
        assertThat(expression.numberToString()).contains(numberToString)
        assertThat(expression.parseNumber()).isEmpty
        assertThat(expression.fetchExchangeRate()).isEmpty
        assertThat(expression.fetchCurrencyDecimalPlaces()).isEmpty
        assertThat(expression.fetchSingleCurrencyPortalCurrency()).isEmpty
        assertThat(expression.datedExchangeRate()).isEmpty
        assertThat(expression.pipelineProbability()).isEmpty
        assertThat(expression.maxNumbers()).isEmpty
        assertThat(expression.minNumbers()).isEmpty
        assertThat(expression.lessThan()).isEmpty
        assertThat(expression.lessThanOrEqual()).isEmpty
        assertThat(expression.moreThan()).isEmpty
        assertThat(expression.moreThanOrEqual()).isEmpty
        assertThat(expression.numberEquals()).isEmpty
        assertThat(expression.stringEquals()).isEmpty
        assertThat(expression.isPipelineStageClosed()).isEmpty
        assertThat(expression.not()).isEmpty
        assertThat(expression.date()).isEmpty
        assertThat(expression.month()).isEmpty
        assertThat(expression.year()).isEmpty
        assertThat(expression.now()).isEmpty
        assertThat(expression.timeBetween()).isEmpty
        assertThat(expression.periodToMonths()).isEmpty
        assertThat(expression.periodToWeeks()).isEmpty
        assertThat(expression.and()).isEmpty
        assertThat(expression.or()).isEmpty
        assertThat(expression.xor()).isEmpty
        assertThat(expression.ifString()).isEmpty
        assertThat(expression.ifNumber()).isEmpty
        assertThat(expression.ifBoolean()).isEmpty
        assertThat(expression.isPresent()).isEmpty
        assertThat(expression.hasEmailReply()).isEmpty
        assertThat(expression.hasPlainTextEmailReply()).isEmpty
        assertThat(expression.extractMostRecentEmailReplyHtml()).isEmpty
        assertThat(expression.extractMostRecentEmailReplyText()).isEmpty
        assertThat(expression.extractMostRecentPlainTextEmailReply()).isEmpty
        assertThat(expression.setContainsString()).isEmpty
        assertThat(expression.isEngagementType()).isEmpty
        assertThat(expression.formatFullName()).isEmpty
        assertThat(expression.absoluteValue()).isEmpty
        assertThat(expression.squareRoot()).isEmpty
        assertThat(expression.power()).isEmpty
        assertThat(expression.substring()).isEmpty
        assertThat(expression.euler()).isEmpty
        assertThat(expression.stringLength()).isEmpty
        assertThat(expression.addTime()).isEmpty
        assertThat(expression.subtractTime()).isEmpty
    }

    @Test
    fun ofNumberToStringRoundtrip() {
        val jsonMapper = jsonMapper()
        val expression =
            Expression.ofNumberToString(
                NumberToString.builder()
                    .operator(NumberToString.Operator.NUMBER_TO_STRING)
                    .addInput(
                        ConstantBoolean.builder()
                            .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                            .inputs(listOf())
                            .propertyName("propertyName")
                            .value(true)
                            .build()
                    )
                    .propertyName("propertyName")
                    .value("value")
                    .build()
            )

        val roundtrippedExpression =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(expression),
                jacksonTypeRef<Expression>(),
            )

        assertThat(roundtrippedExpression).isEqualTo(expression)
    }

    @Test
    fun ofParseNumber() {
        val parseNumber =
            ParseNumber.builder()
                .operator(ParseNumber.Operator.PARSE_NUMBER)
                .addInput(
                    ConstantBoolean.builder()
                        .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                        .inputs(listOf())
                        .propertyName("propertyName")
                        .value(true)
                        .build()
                )
                .propertyName("propertyName")
                .value(0.0)
                .build()

        val expression = Expression.ofParseNumber(parseNumber)

        assertThat(expression.constantBoolean()).isEmpty
        assertThat(expression.constantNumber()).isEmpty
        assertThat(expression.constantString()).isEmpty
        assertThat(expression.booleanPropertyVariable()).isEmpty
        assertThat(expression.stringPropertyVariable()).isEmpty
        assertThat(expression.numberPropertyVariable()).isEmpty
        assertThat(expression.timestampOfPropertyVariable()).isEmpty
        assertThat(expression.booleanTargetPropertyVariable()).isEmpty
        assertThat(expression.stringTargetPropertyVariable()).isEmpty
        assertThat(expression.numberTargetPropertyVariable()).isEmpty
        assertThat(expression.timestampOfTargetPropertyVariable()).isEmpty
        assertThat(expression.addNumbers()).isEmpty
        assertThat(expression.subtractNumbers()).isEmpty
        assertThat(expression.multiplyNumbers()).isEmpty
        assertThat(expression.divideNumbers()).isEmpty
        assertThat(expression.roundDownNumbers()).isEmpty
        assertThat(expression.roundUpNumbers()).isEmpty
        assertThat(expression.roundNearestNumbers()).isEmpty
        assertThat(expression.upperCase()).isEmpty
        assertThat(expression.lowerCase()).isEmpty
        assertThat(expression.concatStrings()).isEmpty
        assertThat(expression.contains()).isEmpty
        assertThat(expression.beginsWith()).isEmpty
        assertThat(expression.numberToString()).isEmpty
        assertThat(expression.parseNumber()).contains(parseNumber)
        assertThat(expression.fetchExchangeRate()).isEmpty
        assertThat(expression.fetchCurrencyDecimalPlaces()).isEmpty
        assertThat(expression.fetchSingleCurrencyPortalCurrency()).isEmpty
        assertThat(expression.datedExchangeRate()).isEmpty
        assertThat(expression.pipelineProbability()).isEmpty
        assertThat(expression.maxNumbers()).isEmpty
        assertThat(expression.minNumbers()).isEmpty
        assertThat(expression.lessThan()).isEmpty
        assertThat(expression.lessThanOrEqual()).isEmpty
        assertThat(expression.moreThan()).isEmpty
        assertThat(expression.moreThanOrEqual()).isEmpty
        assertThat(expression.numberEquals()).isEmpty
        assertThat(expression.stringEquals()).isEmpty
        assertThat(expression.isPipelineStageClosed()).isEmpty
        assertThat(expression.not()).isEmpty
        assertThat(expression.date()).isEmpty
        assertThat(expression.month()).isEmpty
        assertThat(expression.year()).isEmpty
        assertThat(expression.now()).isEmpty
        assertThat(expression.timeBetween()).isEmpty
        assertThat(expression.periodToMonths()).isEmpty
        assertThat(expression.periodToWeeks()).isEmpty
        assertThat(expression.and()).isEmpty
        assertThat(expression.or()).isEmpty
        assertThat(expression.xor()).isEmpty
        assertThat(expression.ifString()).isEmpty
        assertThat(expression.ifNumber()).isEmpty
        assertThat(expression.ifBoolean()).isEmpty
        assertThat(expression.isPresent()).isEmpty
        assertThat(expression.hasEmailReply()).isEmpty
        assertThat(expression.hasPlainTextEmailReply()).isEmpty
        assertThat(expression.extractMostRecentEmailReplyHtml()).isEmpty
        assertThat(expression.extractMostRecentEmailReplyText()).isEmpty
        assertThat(expression.extractMostRecentPlainTextEmailReply()).isEmpty
        assertThat(expression.setContainsString()).isEmpty
        assertThat(expression.isEngagementType()).isEmpty
        assertThat(expression.formatFullName()).isEmpty
        assertThat(expression.absoluteValue()).isEmpty
        assertThat(expression.squareRoot()).isEmpty
        assertThat(expression.power()).isEmpty
        assertThat(expression.substring()).isEmpty
        assertThat(expression.euler()).isEmpty
        assertThat(expression.stringLength()).isEmpty
        assertThat(expression.addTime()).isEmpty
        assertThat(expression.subtractTime()).isEmpty
    }

    @Test
    fun ofParseNumberRoundtrip() {
        val jsonMapper = jsonMapper()
        val expression =
            Expression.ofParseNumber(
                ParseNumber.builder()
                    .operator(ParseNumber.Operator.PARSE_NUMBER)
                    .addInput(
                        ConstantBoolean.builder()
                            .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                            .inputs(listOf())
                            .propertyName("propertyName")
                            .value(true)
                            .build()
                    )
                    .propertyName("propertyName")
                    .value(0.0)
                    .build()
            )

        val roundtrippedExpression =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(expression),
                jacksonTypeRef<Expression>(),
            )

        assertThat(roundtrippedExpression).isEqualTo(expression)
    }

    @Test
    fun ofFetchExchangeRate() {
        val fetchExchangeRate =
            FetchExchangeRate.builder()
                .operator(FetchExchangeRate.Operator.FETCH_EXCHANGE_RATE)
                .addInput(
                    ConstantBoolean.builder()
                        .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                        .inputs(listOf())
                        .propertyName("propertyName")
                        .value(true)
                        .build()
                )
                .propertyName("propertyName")
                .value(0.0)
                .build()

        val expression = Expression.ofFetchExchangeRate(fetchExchangeRate)

        assertThat(expression.constantBoolean()).isEmpty
        assertThat(expression.constantNumber()).isEmpty
        assertThat(expression.constantString()).isEmpty
        assertThat(expression.booleanPropertyVariable()).isEmpty
        assertThat(expression.stringPropertyVariable()).isEmpty
        assertThat(expression.numberPropertyVariable()).isEmpty
        assertThat(expression.timestampOfPropertyVariable()).isEmpty
        assertThat(expression.booleanTargetPropertyVariable()).isEmpty
        assertThat(expression.stringTargetPropertyVariable()).isEmpty
        assertThat(expression.numberTargetPropertyVariable()).isEmpty
        assertThat(expression.timestampOfTargetPropertyVariable()).isEmpty
        assertThat(expression.addNumbers()).isEmpty
        assertThat(expression.subtractNumbers()).isEmpty
        assertThat(expression.multiplyNumbers()).isEmpty
        assertThat(expression.divideNumbers()).isEmpty
        assertThat(expression.roundDownNumbers()).isEmpty
        assertThat(expression.roundUpNumbers()).isEmpty
        assertThat(expression.roundNearestNumbers()).isEmpty
        assertThat(expression.upperCase()).isEmpty
        assertThat(expression.lowerCase()).isEmpty
        assertThat(expression.concatStrings()).isEmpty
        assertThat(expression.contains()).isEmpty
        assertThat(expression.beginsWith()).isEmpty
        assertThat(expression.numberToString()).isEmpty
        assertThat(expression.parseNumber()).isEmpty
        assertThat(expression.fetchExchangeRate()).contains(fetchExchangeRate)
        assertThat(expression.fetchCurrencyDecimalPlaces()).isEmpty
        assertThat(expression.fetchSingleCurrencyPortalCurrency()).isEmpty
        assertThat(expression.datedExchangeRate()).isEmpty
        assertThat(expression.pipelineProbability()).isEmpty
        assertThat(expression.maxNumbers()).isEmpty
        assertThat(expression.minNumbers()).isEmpty
        assertThat(expression.lessThan()).isEmpty
        assertThat(expression.lessThanOrEqual()).isEmpty
        assertThat(expression.moreThan()).isEmpty
        assertThat(expression.moreThanOrEqual()).isEmpty
        assertThat(expression.numberEquals()).isEmpty
        assertThat(expression.stringEquals()).isEmpty
        assertThat(expression.isPipelineStageClosed()).isEmpty
        assertThat(expression.not()).isEmpty
        assertThat(expression.date()).isEmpty
        assertThat(expression.month()).isEmpty
        assertThat(expression.year()).isEmpty
        assertThat(expression.now()).isEmpty
        assertThat(expression.timeBetween()).isEmpty
        assertThat(expression.periodToMonths()).isEmpty
        assertThat(expression.periodToWeeks()).isEmpty
        assertThat(expression.and()).isEmpty
        assertThat(expression.or()).isEmpty
        assertThat(expression.xor()).isEmpty
        assertThat(expression.ifString()).isEmpty
        assertThat(expression.ifNumber()).isEmpty
        assertThat(expression.ifBoolean()).isEmpty
        assertThat(expression.isPresent()).isEmpty
        assertThat(expression.hasEmailReply()).isEmpty
        assertThat(expression.hasPlainTextEmailReply()).isEmpty
        assertThat(expression.extractMostRecentEmailReplyHtml()).isEmpty
        assertThat(expression.extractMostRecentEmailReplyText()).isEmpty
        assertThat(expression.extractMostRecentPlainTextEmailReply()).isEmpty
        assertThat(expression.setContainsString()).isEmpty
        assertThat(expression.isEngagementType()).isEmpty
        assertThat(expression.formatFullName()).isEmpty
        assertThat(expression.absoluteValue()).isEmpty
        assertThat(expression.squareRoot()).isEmpty
        assertThat(expression.power()).isEmpty
        assertThat(expression.substring()).isEmpty
        assertThat(expression.euler()).isEmpty
        assertThat(expression.stringLength()).isEmpty
        assertThat(expression.addTime()).isEmpty
        assertThat(expression.subtractTime()).isEmpty
    }

    @Test
    fun ofFetchExchangeRateRoundtrip() {
        val jsonMapper = jsonMapper()
        val expression =
            Expression.ofFetchExchangeRate(
                FetchExchangeRate.builder()
                    .operator(FetchExchangeRate.Operator.FETCH_EXCHANGE_RATE)
                    .addInput(
                        ConstantBoolean.builder()
                            .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                            .inputs(listOf())
                            .propertyName("propertyName")
                            .value(true)
                            .build()
                    )
                    .propertyName("propertyName")
                    .value(0.0)
                    .build()
            )

        val roundtrippedExpression =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(expression),
                jacksonTypeRef<Expression>(),
            )

        assertThat(roundtrippedExpression).isEqualTo(expression)
    }

    @Test
    fun ofFetchCurrencyDecimalPlaces() {
        val fetchCurrencyDecimalPlaces =
            FetchCurrencyDecimalPlaces.builder()
                .operator(FetchCurrencyDecimalPlaces.Operator.FETCH_CURRENCY_DECIMAL_PLACES)
                .addInput(
                    ConstantBoolean.builder()
                        .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                        .inputs(listOf())
                        .propertyName("propertyName")
                        .value(true)
                        .build()
                )
                .propertyName("propertyName")
                .value(0.0)
                .build()

        val expression = Expression.ofFetchCurrencyDecimalPlaces(fetchCurrencyDecimalPlaces)

        assertThat(expression.constantBoolean()).isEmpty
        assertThat(expression.constantNumber()).isEmpty
        assertThat(expression.constantString()).isEmpty
        assertThat(expression.booleanPropertyVariable()).isEmpty
        assertThat(expression.stringPropertyVariable()).isEmpty
        assertThat(expression.numberPropertyVariable()).isEmpty
        assertThat(expression.timestampOfPropertyVariable()).isEmpty
        assertThat(expression.booleanTargetPropertyVariable()).isEmpty
        assertThat(expression.stringTargetPropertyVariable()).isEmpty
        assertThat(expression.numberTargetPropertyVariable()).isEmpty
        assertThat(expression.timestampOfTargetPropertyVariable()).isEmpty
        assertThat(expression.addNumbers()).isEmpty
        assertThat(expression.subtractNumbers()).isEmpty
        assertThat(expression.multiplyNumbers()).isEmpty
        assertThat(expression.divideNumbers()).isEmpty
        assertThat(expression.roundDownNumbers()).isEmpty
        assertThat(expression.roundUpNumbers()).isEmpty
        assertThat(expression.roundNearestNumbers()).isEmpty
        assertThat(expression.upperCase()).isEmpty
        assertThat(expression.lowerCase()).isEmpty
        assertThat(expression.concatStrings()).isEmpty
        assertThat(expression.contains()).isEmpty
        assertThat(expression.beginsWith()).isEmpty
        assertThat(expression.numberToString()).isEmpty
        assertThat(expression.parseNumber()).isEmpty
        assertThat(expression.fetchExchangeRate()).isEmpty
        assertThat(expression.fetchCurrencyDecimalPlaces()).contains(fetchCurrencyDecimalPlaces)
        assertThat(expression.fetchSingleCurrencyPortalCurrency()).isEmpty
        assertThat(expression.datedExchangeRate()).isEmpty
        assertThat(expression.pipelineProbability()).isEmpty
        assertThat(expression.maxNumbers()).isEmpty
        assertThat(expression.minNumbers()).isEmpty
        assertThat(expression.lessThan()).isEmpty
        assertThat(expression.lessThanOrEqual()).isEmpty
        assertThat(expression.moreThan()).isEmpty
        assertThat(expression.moreThanOrEqual()).isEmpty
        assertThat(expression.numberEquals()).isEmpty
        assertThat(expression.stringEquals()).isEmpty
        assertThat(expression.isPipelineStageClosed()).isEmpty
        assertThat(expression.not()).isEmpty
        assertThat(expression.date()).isEmpty
        assertThat(expression.month()).isEmpty
        assertThat(expression.year()).isEmpty
        assertThat(expression.now()).isEmpty
        assertThat(expression.timeBetween()).isEmpty
        assertThat(expression.periodToMonths()).isEmpty
        assertThat(expression.periodToWeeks()).isEmpty
        assertThat(expression.and()).isEmpty
        assertThat(expression.or()).isEmpty
        assertThat(expression.xor()).isEmpty
        assertThat(expression.ifString()).isEmpty
        assertThat(expression.ifNumber()).isEmpty
        assertThat(expression.ifBoolean()).isEmpty
        assertThat(expression.isPresent()).isEmpty
        assertThat(expression.hasEmailReply()).isEmpty
        assertThat(expression.hasPlainTextEmailReply()).isEmpty
        assertThat(expression.extractMostRecentEmailReplyHtml()).isEmpty
        assertThat(expression.extractMostRecentEmailReplyText()).isEmpty
        assertThat(expression.extractMostRecentPlainTextEmailReply()).isEmpty
        assertThat(expression.setContainsString()).isEmpty
        assertThat(expression.isEngagementType()).isEmpty
        assertThat(expression.formatFullName()).isEmpty
        assertThat(expression.absoluteValue()).isEmpty
        assertThat(expression.squareRoot()).isEmpty
        assertThat(expression.power()).isEmpty
        assertThat(expression.substring()).isEmpty
        assertThat(expression.euler()).isEmpty
        assertThat(expression.stringLength()).isEmpty
        assertThat(expression.addTime()).isEmpty
        assertThat(expression.subtractTime()).isEmpty
    }

    @Test
    fun ofFetchCurrencyDecimalPlacesRoundtrip() {
        val jsonMapper = jsonMapper()
        val expression =
            Expression.ofFetchCurrencyDecimalPlaces(
                FetchCurrencyDecimalPlaces.builder()
                    .operator(FetchCurrencyDecimalPlaces.Operator.FETCH_CURRENCY_DECIMAL_PLACES)
                    .addInput(
                        ConstantBoolean.builder()
                            .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                            .inputs(listOf())
                            .propertyName("propertyName")
                            .value(true)
                            .build()
                    )
                    .propertyName("propertyName")
                    .value(0.0)
                    .build()
            )

        val roundtrippedExpression =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(expression),
                jacksonTypeRef<Expression>(),
            )

        assertThat(roundtrippedExpression).isEqualTo(expression)
    }

    @Test
    fun ofFetchSingleCurrencyPortalCurrency() {
        val fetchSingleCurrencyPortalCurrency =
            FetchSingleCurrencyPortalCurrency.builder()
                .operator(
                    FetchSingleCurrencyPortalCurrency.Operator.FETCH_SINGLE_CURRENCY_PORTAL_CURRENCY
                )
                .addInput(
                    ConstantBoolean.builder()
                        .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                        .inputs(listOf())
                        .propertyName("propertyName")
                        .value(true)
                        .build()
                )
                .propertyName("propertyName")
                .value("value")
                .build()

        val expression =
            Expression.ofFetchSingleCurrencyPortalCurrency(fetchSingleCurrencyPortalCurrency)

        assertThat(expression.constantBoolean()).isEmpty
        assertThat(expression.constantNumber()).isEmpty
        assertThat(expression.constantString()).isEmpty
        assertThat(expression.booleanPropertyVariable()).isEmpty
        assertThat(expression.stringPropertyVariable()).isEmpty
        assertThat(expression.numberPropertyVariable()).isEmpty
        assertThat(expression.timestampOfPropertyVariable()).isEmpty
        assertThat(expression.booleanTargetPropertyVariable()).isEmpty
        assertThat(expression.stringTargetPropertyVariable()).isEmpty
        assertThat(expression.numberTargetPropertyVariable()).isEmpty
        assertThat(expression.timestampOfTargetPropertyVariable()).isEmpty
        assertThat(expression.addNumbers()).isEmpty
        assertThat(expression.subtractNumbers()).isEmpty
        assertThat(expression.multiplyNumbers()).isEmpty
        assertThat(expression.divideNumbers()).isEmpty
        assertThat(expression.roundDownNumbers()).isEmpty
        assertThat(expression.roundUpNumbers()).isEmpty
        assertThat(expression.roundNearestNumbers()).isEmpty
        assertThat(expression.upperCase()).isEmpty
        assertThat(expression.lowerCase()).isEmpty
        assertThat(expression.concatStrings()).isEmpty
        assertThat(expression.contains()).isEmpty
        assertThat(expression.beginsWith()).isEmpty
        assertThat(expression.numberToString()).isEmpty
        assertThat(expression.parseNumber()).isEmpty
        assertThat(expression.fetchExchangeRate()).isEmpty
        assertThat(expression.fetchCurrencyDecimalPlaces()).isEmpty
        assertThat(expression.fetchSingleCurrencyPortalCurrency())
            .contains(fetchSingleCurrencyPortalCurrency)
        assertThat(expression.datedExchangeRate()).isEmpty
        assertThat(expression.pipelineProbability()).isEmpty
        assertThat(expression.maxNumbers()).isEmpty
        assertThat(expression.minNumbers()).isEmpty
        assertThat(expression.lessThan()).isEmpty
        assertThat(expression.lessThanOrEqual()).isEmpty
        assertThat(expression.moreThan()).isEmpty
        assertThat(expression.moreThanOrEqual()).isEmpty
        assertThat(expression.numberEquals()).isEmpty
        assertThat(expression.stringEquals()).isEmpty
        assertThat(expression.isPipelineStageClosed()).isEmpty
        assertThat(expression.not()).isEmpty
        assertThat(expression.date()).isEmpty
        assertThat(expression.month()).isEmpty
        assertThat(expression.year()).isEmpty
        assertThat(expression.now()).isEmpty
        assertThat(expression.timeBetween()).isEmpty
        assertThat(expression.periodToMonths()).isEmpty
        assertThat(expression.periodToWeeks()).isEmpty
        assertThat(expression.and()).isEmpty
        assertThat(expression.or()).isEmpty
        assertThat(expression.xor()).isEmpty
        assertThat(expression.ifString()).isEmpty
        assertThat(expression.ifNumber()).isEmpty
        assertThat(expression.ifBoolean()).isEmpty
        assertThat(expression.isPresent()).isEmpty
        assertThat(expression.hasEmailReply()).isEmpty
        assertThat(expression.hasPlainTextEmailReply()).isEmpty
        assertThat(expression.extractMostRecentEmailReplyHtml()).isEmpty
        assertThat(expression.extractMostRecentEmailReplyText()).isEmpty
        assertThat(expression.extractMostRecentPlainTextEmailReply()).isEmpty
        assertThat(expression.setContainsString()).isEmpty
        assertThat(expression.isEngagementType()).isEmpty
        assertThat(expression.formatFullName()).isEmpty
        assertThat(expression.absoluteValue()).isEmpty
        assertThat(expression.squareRoot()).isEmpty
        assertThat(expression.power()).isEmpty
        assertThat(expression.substring()).isEmpty
        assertThat(expression.euler()).isEmpty
        assertThat(expression.stringLength()).isEmpty
        assertThat(expression.addTime()).isEmpty
        assertThat(expression.subtractTime()).isEmpty
    }

    @Test
    fun ofFetchSingleCurrencyPortalCurrencyRoundtrip() {
        val jsonMapper = jsonMapper()
        val expression =
            Expression.ofFetchSingleCurrencyPortalCurrency(
                FetchSingleCurrencyPortalCurrency.builder()
                    .operator(
                        FetchSingleCurrencyPortalCurrency.Operator
                            .FETCH_SINGLE_CURRENCY_PORTAL_CURRENCY
                    )
                    .addInput(
                        ConstantBoolean.builder()
                            .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                            .inputs(listOf())
                            .propertyName("propertyName")
                            .value(true)
                            .build()
                    )
                    .propertyName("propertyName")
                    .value("value")
                    .build()
            )

        val roundtrippedExpression =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(expression),
                jacksonTypeRef<Expression>(),
            )

        assertThat(roundtrippedExpression).isEqualTo(expression)
    }

    @Test
    fun ofDatedExchangeRate() {
        val datedExchangeRate =
            DatedExchangeRate.builder()
                .operator(DatedExchangeRate.Operator.DATED_EXCHANGE_RATE)
                .addInput(
                    ConstantBoolean.builder()
                        .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                        .inputs(listOf())
                        .propertyName("propertyName")
                        .value(true)
                        .build()
                )
                .propertyName("propertyName")
                .value(0.0)
                .build()

        val expression = Expression.ofDatedExchangeRate(datedExchangeRate)

        assertThat(expression.constantBoolean()).isEmpty
        assertThat(expression.constantNumber()).isEmpty
        assertThat(expression.constantString()).isEmpty
        assertThat(expression.booleanPropertyVariable()).isEmpty
        assertThat(expression.stringPropertyVariable()).isEmpty
        assertThat(expression.numberPropertyVariable()).isEmpty
        assertThat(expression.timestampOfPropertyVariable()).isEmpty
        assertThat(expression.booleanTargetPropertyVariable()).isEmpty
        assertThat(expression.stringTargetPropertyVariable()).isEmpty
        assertThat(expression.numberTargetPropertyVariable()).isEmpty
        assertThat(expression.timestampOfTargetPropertyVariable()).isEmpty
        assertThat(expression.addNumbers()).isEmpty
        assertThat(expression.subtractNumbers()).isEmpty
        assertThat(expression.multiplyNumbers()).isEmpty
        assertThat(expression.divideNumbers()).isEmpty
        assertThat(expression.roundDownNumbers()).isEmpty
        assertThat(expression.roundUpNumbers()).isEmpty
        assertThat(expression.roundNearestNumbers()).isEmpty
        assertThat(expression.upperCase()).isEmpty
        assertThat(expression.lowerCase()).isEmpty
        assertThat(expression.concatStrings()).isEmpty
        assertThat(expression.contains()).isEmpty
        assertThat(expression.beginsWith()).isEmpty
        assertThat(expression.numberToString()).isEmpty
        assertThat(expression.parseNumber()).isEmpty
        assertThat(expression.fetchExchangeRate()).isEmpty
        assertThat(expression.fetchCurrencyDecimalPlaces()).isEmpty
        assertThat(expression.fetchSingleCurrencyPortalCurrency()).isEmpty
        assertThat(expression.datedExchangeRate()).contains(datedExchangeRate)
        assertThat(expression.pipelineProbability()).isEmpty
        assertThat(expression.maxNumbers()).isEmpty
        assertThat(expression.minNumbers()).isEmpty
        assertThat(expression.lessThan()).isEmpty
        assertThat(expression.lessThanOrEqual()).isEmpty
        assertThat(expression.moreThan()).isEmpty
        assertThat(expression.moreThanOrEqual()).isEmpty
        assertThat(expression.numberEquals()).isEmpty
        assertThat(expression.stringEquals()).isEmpty
        assertThat(expression.isPipelineStageClosed()).isEmpty
        assertThat(expression.not()).isEmpty
        assertThat(expression.date()).isEmpty
        assertThat(expression.month()).isEmpty
        assertThat(expression.year()).isEmpty
        assertThat(expression.now()).isEmpty
        assertThat(expression.timeBetween()).isEmpty
        assertThat(expression.periodToMonths()).isEmpty
        assertThat(expression.periodToWeeks()).isEmpty
        assertThat(expression.and()).isEmpty
        assertThat(expression.or()).isEmpty
        assertThat(expression.xor()).isEmpty
        assertThat(expression.ifString()).isEmpty
        assertThat(expression.ifNumber()).isEmpty
        assertThat(expression.ifBoolean()).isEmpty
        assertThat(expression.isPresent()).isEmpty
        assertThat(expression.hasEmailReply()).isEmpty
        assertThat(expression.hasPlainTextEmailReply()).isEmpty
        assertThat(expression.extractMostRecentEmailReplyHtml()).isEmpty
        assertThat(expression.extractMostRecentEmailReplyText()).isEmpty
        assertThat(expression.extractMostRecentPlainTextEmailReply()).isEmpty
        assertThat(expression.setContainsString()).isEmpty
        assertThat(expression.isEngagementType()).isEmpty
        assertThat(expression.formatFullName()).isEmpty
        assertThat(expression.absoluteValue()).isEmpty
        assertThat(expression.squareRoot()).isEmpty
        assertThat(expression.power()).isEmpty
        assertThat(expression.substring()).isEmpty
        assertThat(expression.euler()).isEmpty
        assertThat(expression.stringLength()).isEmpty
        assertThat(expression.addTime()).isEmpty
        assertThat(expression.subtractTime()).isEmpty
    }

    @Test
    fun ofDatedExchangeRateRoundtrip() {
        val jsonMapper = jsonMapper()
        val expression =
            Expression.ofDatedExchangeRate(
                DatedExchangeRate.builder()
                    .operator(DatedExchangeRate.Operator.DATED_EXCHANGE_RATE)
                    .addInput(
                        ConstantBoolean.builder()
                            .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                            .inputs(listOf())
                            .propertyName("propertyName")
                            .value(true)
                            .build()
                    )
                    .propertyName("propertyName")
                    .value(0.0)
                    .build()
            )

        val roundtrippedExpression =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(expression),
                jacksonTypeRef<Expression>(),
            )

        assertThat(roundtrippedExpression).isEqualTo(expression)
    }

    @Test
    fun ofPipelineProbability() {
        val pipelineProbability =
            PipelineProbability.builder()
                .operator(PipelineProbability.Operator.PIPELINE_PROBABILITY)
                .addInput(
                    ConstantBoolean.builder()
                        .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                        .inputs(listOf())
                        .propertyName("propertyName")
                        .value(true)
                        .build()
                )
                .propertyName("propertyName")
                .value(0.0)
                .build()

        val expression = Expression.ofPipelineProbability(pipelineProbability)

        assertThat(expression.constantBoolean()).isEmpty
        assertThat(expression.constantNumber()).isEmpty
        assertThat(expression.constantString()).isEmpty
        assertThat(expression.booleanPropertyVariable()).isEmpty
        assertThat(expression.stringPropertyVariable()).isEmpty
        assertThat(expression.numberPropertyVariable()).isEmpty
        assertThat(expression.timestampOfPropertyVariable()).isEmpty
        assertThat(expression.booleanTargetPropertyVariable()).isEmpty
        assertThat(expression.stringTargetPropertyVariable()).isEmpty
        assertThat(expression.numberTargetPropertyVariable()).isEmpty
        assertThat(expression.timestampOfTargetPropertyVariable()).isEmpty
        assertThat(expression.addNumbers()).isEmpty
        assertThat(expression.subtractNumbers()).isEmpty
        assertThat(expression.multiplyNumbers()).isEmpty
        assertThat(expression.divideNumbers()).isEmpty
        assertThat(expression.roundDownNumbers()).isEmpty
        assertThat(expression.roundUpNumbers()).isEmpty
        assertThat(expression.roundNearestNumbers()).isEmpty
        assertThat(expression.upperCase()).isEmpty
        assertThat(expression.lowerCase()).isEmpty
        assertThat(expression.concatStrings()).isEmpty
        assertThat(expression.contains()).isEmpty
        assertThat(expression.beginsWith()).isEmpty
        assertThat(expression.numberToString()).isEmpty
        assertThat(expression.parseNumber()).isEmpty
        assertThat(expression.fetchExchangeRate()).isEmpty
        assertThat(expression.fetchCurrencyDecimalPlaces()).isEmpty
        assertThat(expression.fetchSingleCurrencyPortalCurrency()).isEmpty
        assertThat(expression.datedExchangeRate()).isEmpty
        assertThat(expression.pipelineProbability()).contains(pipelineProbability)
        assertThat(expression.maxNumbers()).isEmpty
        assertThat(expression.minNumbers()).isEmpty
        assertThat(expression.lessThan()).isEmpty
        assertThat(expression.lessThanOrEqual()).isEmpty
        assertThat(expression.moreThan()).isEmpty
        assertThat(expression.moreThanOrEqual()).isEmpty
        assertThat(expression.numberEquals()).isEmpty
        assertThat(expression.stringEquals()).isEmpty
        assertThat(expression.isPipelineStageClosed()).isEmpty
        assertThat(expression.not()).isEmpty
        assertThat(expression.date()).isEmpty
        assertThat(expression.month()).isEmpty
        assertThat(expression.year()).isEmpty
        assertThat(expression.now()).isEmpty
        assertThat(expression.timeBetween()).isEmpty
        assertThat(expression.periodToMonths()).isEmpty
        assertThat(expression.periodToWeeks()).isEmpty
        assertThat(expression.and()).isEmpty
        assertThat(expression.or()).isEmpty
        assertThat(expression.xor()).isEmpty
        assertThat(expression.ifString()).isEmpty
        assertThat(expression.ifNumber()).isEmpty
        assertThat(expression.ifBoolean()).isEmpty
        assertThat(expression.isPresent()).isEmpty
        assertThat(expression.hasEmailReply()).isEmpty
        assertThat(expression.hasPlainTextEmailReply()).isEmpty
        assertThat(expression.extractMostRecentEmailReplyHtml()).isEmpty
        assertThat(expression.extractMostRecentEmailReplyText()).isEmpty
        assertThat(expression.extractMostRecentPlainTextEmailReply()).isEmpty
        assertThat(expression.setContainsString()).isEmpty
        assertThat(expression.isEngagementType()).isEmpty
        assertThat(expression.formatFullName()).isEmpty
        assertThat(expression.absoluteValue()).isEmpty
        assertThat(expression.squareRoot()).isEmpty
        assertThat(expression.power()).isEmpty
        assertThat(expression.substring()).isEmpty
        assertThat(expression.euler()).isEmpty
        assertThat(expression.stringLength()).isEmpty
        assertThat(expression.addTime()).isEmpty
        assertThat(expression.subtractTime()).isEmpty
    }

    @Test
    fun ofPipelineProbabilityRoundtrip() {
        val jsonMapper = jsonMapper()
        val expression =
            Expression.ofPipelineProbability(
                PipelineProbability.builder()
                    .operator(PipelineProbability.Operator.PIPELINE_PROBABILITY)
                    .addInput(
                        ConstantBoolean.builder()
                            .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                            .inputs(listOf())
                            .propertyName("propertyName")
                            .value(true)
                            .build()
                    )
                    .propertyName("propertyName")
                    .value(0.0)
                    .build()
            )

        val roundtrippedExpression =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(expression),
                jacksonTypeRef<Expression>(),
            )

        assertThat(roundtrippedExpression).isEqualTo(expression)
    }

    @Test
    fun ofMaxNumbers() {
        val maxNumbers =
            MaxNumbers.builder()
                .operator(MaxNumbers.Operator.MAX_NUMBERS)
                .addInput(
                    ConstantBoolean.builder()
                        .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                        .inputs(listOf())
                        .propertyName("propertyName")
                        .value(true)
                        .build()
                )
                .propertyName("propertyName")
                .value(0.0)
                .build()

        val expression = Expression.ofMaxNumbers(maxNumbers)

        assertThat(expression.constantBoolean()).isEmpty
        assertThat(expression.constantNumber()).isEmpty
        assertThat(expression.constantString()).isEmpty
        assertThat(expression.booleanPropertyVariable()).isEmpty
        assertThat(expression.stringPropertyVariable()).isEmpty
        assertThat(expression.numberPropertyVariable()).isEmpty
        assertThat(expression.timestampOfPropertyVariable()).isEmpty
        assertThat(expression.booleanTargetPropertyVariable()).isEmpty
        assertThat(expression.stringTargetPropertyVariable()).isEmpty
        assertThat(expression.numberTargetPropertyVariable()).isEmpty
        assertThat(expression.timestampOfTargetPropertyVariable()).isEmpty
        assertThat(expression.addNumbers()).isEmpty
        assertThat(expression.subtractNumbers()).isEmpty
        assertThat(expression.multiplyNumbers()).isEmpty
        assertThat(expression.divideNumbers()).isEmpty
        assertThat(expression.roundDownNumbers()).isEmpty
        assertThat(expression.roundUpNumbers()).isEmpty
        assertThat(expression.roundNearestNumbers()).isEmpty
        assertThat(expression.upperCase()).isEmpty
        assertThat(expression.lowerCase()).isEmpty
        assertThat(expression.concatStrings()).isEmpty
        assertThat(expression.contains()).isEmpty
        assertThat(expression.beginsWith()).isEmpty
        assertThat(expression.numberToString()).isEmpty
        assertThat(expression.parseNumber()).isEmpty
        assertThat(expression.fetchExchangeRate()).isEmpty
        assertThat(expression.fetchCurrencyDecimalPlaces()).isEmpty
        assertThat(expression.fetchSingleCurrencyPortalCurrency()).isEmpty
        assertThat(expression.datedExchangeRate()).isEmpty
        assertThat(expression.pipelineProbability()).isEmpty
        assertThat(expression.maxNumbers()).contains(maxNumbers)
        assertThat(expression.minNumbers()).isEmpty
        assertThat(expression.lessThan()).isEmpty
        assertThat(expression.lessThanOrEqual()).isEmpty
        assertThat(expression.moreThan()).isEmpty
        assertThat(expression.moreThanOrEqual()).isEmpty
        assertThat(expression.numberEquals()).isEmpty
        assertThat(expression.stringEquals()).isEmpty
        assertThat(expression.isPipelineStageClosed()).isEmpty
        assertThat(expression.not()).isEmpty
        assertThat(expression.date()).isEmpty
        assertThat(expression.month()).isEmpty
        assertThat(expression.year()).isEmpty
        assertThat(expression.now()).isEmpty
        assertThat(expression.timeBetween()).isEmpty
        assertThat(expression.periodToMonths()).isEmpty
        assertThat(expression.periodToWeeks()).isEmpty
        assertThat(expression.and()).isEmpty
        assertThat(expression.or()).isEmpty
        assertThat(expression.xor()).isEmpty
        assertThat(expression.ifString()).isEmpty
        assertThat(expression.ifNumber()).isEmpty
        assertThat(expression.ifBoolean()).isEmpty
        assertThat(expression.isPresent()).isEmpty
        assertThat(expression.hasEmailReply()).isEmpty
        assertThat(expression.hasPlainTextEmailReply()).isEmpty
        assertThat(expression.extractMostRecentEmailReplyHtml()).isEmpty
        assertThat(expression.extractMostRecentEmailReplyText()).isEmpty
        assertThat(expression.extractMostRecentPlainTextEmailReply()).isEmpty
        assertThat(expression.setContainsString()).isEmpty
        assertThat(expression.isEngagementType()).isEmpty
        assertThat(expression.formatFullName()).isEmpty
        assertThat(expression.absoluteValue()).isEmpty
        assertThat(expression.squareRoot()).isEmpty
        assertThat(expression.power()).isEmpty
        assertThat(expression.substring()).isEmpty
        assertThat(expression.euler()).isEmpty
        assertThat(expression.stringLength()).isEmpty
        assertThat(expression.addTime()).isEmpty
        assertThat(expression.subtractTime()).isEmpty
    }

    @Test
    fun ofMaxNumbersRoundtrip() {
        val jsonMapper = jsonMapper()
        val expression =
            Expression.ofMaxNumbers(
                MaxNumbers.builder()
                    .operator(MaxNumbers.Operator.MAX_NUMBERS)
                    .addInput(
                        ConstantBoolean.builder()
                            .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                            .inputs(listOf())
                            .propertyName("propertyName")
                            .value(true)
                            .build()
                    )
                    .propertyName("propertyName")
                    .value(0.0)
                    .build()
            )

        val roundtrippedExpression =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(expression),
                jacksonTypeRef<Expression>(),
            )

        assertThat(roundtrippedExpression).isEqualTo(expression)
    }

    @Test
    fun ofMinNumbers() {
        val minNumbers =
            MinNumbers.builder()
                .operator(MinNumbers.Operator.MIN_NUMBERS)
                .addInput(
                    ConstantBoolean.builder()
                        .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                        .inputs(listOf())
                        .propertyName("propertyName")
                        .value(true)
                        .build()
                )
                .propertyName("propertyName")
                .value(0.0)
                .build()

        val expression = Expression.ofMinNumbers(minNumbers)

        assertThat(expression.constantBoolean()).isEmpty
        assertThat(expression.constantNumber()).isEmpty
        assertThat(expression.constantString()).isEmpty
        assertThat(expression.booleanPropertyVariable()).isEmpty
        assertThat(expression.stringPropertyVariable()).isEmpty
        assertThat(expression.numberPropertyVariable()).isEmpty
        assertThat(expression.timestampOfPropertyVariable()).isEmpty
        assertThat(expression.booleanTargetPropertyVariable()).isEmpty
        assertThat(expression.stringTargetPropertyVariable()).isEmpty
        assertThat(expression.numberTargetPropertyVariable()).isEmpty
        assertThat(expression.timestampOfTargetPropertyVariable()).isEmpty
        assertThat(expression.addNumbers()).isEmpty
        assertThat(expression.subtractNumbers()).isEmpty
        assertThat(expression.multiplyNumbers()).isEmpty
        assertThat(expression.divideNumbers()).isEmpty
        assertThat(expression.roundDownNumbers()).isEmpty
        assertThat(expression.roundUpNumbers()).isEmpty
        assertThat(expression.roundNearestNumbers()).isEmpty
        assertThat(expression.upperCase()).isEmpty
        assertThat(expression.lowerCase()).isEmpty
        assertThat(expression.concatStrings()).isEmpty
        assertThat(expression.contains()).isEmpty
        assertThat(expression.beginsWith()).isEmpty
        assertThat(expression.numberToString()).isEmpty
        assertThat(expression.parseNumber()).isEmpty
        assertThat(expression.fetchExchangeRate()).isEmpty
        assertThat(expression.fetchCurrencyDecimalPlaces()).isEmpty
        assertThat(expression.fetchSingleCurrencyPortalCurrency()).isEmpty
        assertThat(expression.datedExchangeRate()).isEmpty
        assertThat(expression.pipelineProbability()).isEmpty
        assertThat(expression.maxNumbers()).isEmpty
        assertThat(expression.minNumbers()).contains(minNumbers)
        assertThat(expression.lessThan()).isEmpty
        assertThat(expression.lessThanOrEqual()).isEmpty
        assertThat(expression.moreThan()).isEmpty
        assertThat(expression.moreThanOrEqual()).isEmpty
        assertThat(expression.numberEquals()).isEmpty
        assertThat(expression.stringEquals()).isEmpty
        assertThat(expression.isPipelineStageClosed()).isEmpty
        assertThat(expression.not()).isEmpty
        assertThat(expression.date()).isEmpty
        assertThat(expression.month()).isEmpty
        assertThat(expression.year()).isEmpty
        assertThat(expression.now()).isEmpty
        assertThat(expression.timeBetween()).isEmpty
        assertThat(expression.periodToMonths()).isEmpty
        assertThat(expression.periodToWeeks()).isEmpty
        assertThat(expression.and()).isEmpty
        assertThat(expression.or()).isEmpty
        assertThat(expression.xor()).isEmpty
        assertThat(expression.ifString()).isEmpty
        assertThat(expression.ifNumber()).isEmpty
        assertThat(expression.ifBoolean()).isEmpty
        assertThat(expression.isPresent()).isEmpty
        assertThat(expression.hasEmailReply()).isEmpty
        assertThat(expression.hasPlainTextEmailReply()).isEmpty
        assertThat(expression.extractMostRecentEmailReplyHtml()).isEmpty
        assertThat(expression.extractMostRecentEmailReplyText()).isEmpty
        assertThat(expression.extractMostRecentPlainTextEmailReply()).isEmpty
        assertThat(expression.setContainsString()).isEmpty
        assertThat(expression.isEngagementType()).isEmpty
        assertThat(expression.formatFullName()).isEmpty
        assertThat(expression.absoluteValue()).isEmpty
        assertThat(expression.squareRoot()).isEmpty
        assertThat(expression.power()).isEmpty
        assertThat(expression.substring()).isEmpty
        assertThat(expression.euler()).isEmpty
        assertThat(expression.stringLength()).isEmpty
        assertThat(expression.addTime()).isEmpty
        assertThat(expression.subtractTime()).isEmpty
    }

    @Test
    fun ofMinNumbersRoundtrip() {
        val jsonMapper = jsonMapper()
        val expression =
            Expression.ofMinNumbers(
                MinNumbers.builder()
                    .operator(MinNumbers.Operator.MIN_NUMBERS)
                    .addInput(
                        ConstantBoolean.builder()
                            .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                            .inputs(listOf())
                            .propertyName("propertyName")
                            .value(true)
                            .build()
                    )
                    .propertyName("propertyName")
                    .value(0.0)
                    .build()
            )

        val roundtrippedExpression =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(expression),
                jacksonTypeRef<Expression>(),
            )

        assertThat(roundtrippedExpression).isEqualTo(expression)
    }

    @Test
    fun ofLessThan() {
        val lessThan =
            LessThan.builder()
                .operator(LessThan.Operator.LESS_THAN)
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

        val expression = Expression.ofLessThan(lessThan)

        assertThat(expression.constantBoolean()).isEmpty
        assertThat(expression.constantNumber()).isEmpty
        assertThat(expression.constantString()).isEmpty
        assertThat(expression.booleanPropertyVariable()).isEmpty
        assertThat(expression.stringPropertyVariable()).isEmpty
        assertThat(expression.numberPropertyVariable()).isEmpty
        assertThat(expression.timestampOfPropertyVariable()).isEmpty
        assertThat(expression.booleanTargetPropertyVariable()).isEmpty
        assertThat(expression.stringTargetPropertyVariable()).isEmpty
        assertThat(expression.numberTargetPropertyVariable()).isEmpty
        assertThat(expression.timestampOfTargetPropertyVariable()).isEmpty
        assertThat(expression.addNumbers()).isEmpty
        assertThat(expression.subtractNumbers()).isEmpty
        assertThat(expression.multiplyNumbers()).isEmpty
        assertThat(expression.divideNumbers()).isEmpty
        assertThat(expression.roundDownNumbers()).isEmpty
        assertThat(expression.roundUpNumbers()).isEmpty
        assertThat(expression.roundNearestNumbers()).isEmpty
        assertThat(expression.upperCase()).isEmpty
        assertThat(expression.lowerCase()).isEmpty
        assertThat(expression.concatStrings()).isEmpty
        assertThat(expression.contains()).isEmpty
        assertThat(expression.beginsWith()).isEmpty
        assertThat(expression.numberToString()).isEmpty
        assertThat(expression.parseNumber()).isEmpty
        assertThat(expression.fetchExchangeRate()).isEmpty
        assertThat(expression.fetchCurrencyDecimalPlaces()).isEmpty
        assertThat(expression.fetchSingleCurrencyPortalCurrency()).isEmpty
        assertThat(expression.datedExchangeRate()).isEmpty
        assertThat(expression.pipelineProbability()).isEmpty
        assertThat(expression.maxNumbers()).isEmpty
        assertThat(expression.minNumbers()).isEmpty
        assertThat(expression.lessThan()).contains(lessThan)
        assertThat(expression.lessThanOrEqual()).isEmpty
        assertThat(expression.moreThan()).isEmpty
        assertThat(expression.moreThanOrEqual()).isEmpty
        assertThat(expression.numberEquals()).isEmpty
        assertThat(expression.stringEquals()).isEmpty
        assertThat(expression.isPipelineStageClosed()).isEmpty
        assertThat(expression.not()).isEmpty
        assertThat(expression.date()).isEmpty
        assertThat(expression.month()).isEmpty
        assertThat(expression.year()).isEmpty
        assertThat(expression.now()).isEmpty
        assertThat(expression.timeBetween()).isEmpty
        assertThat(expression.periodToMonths()).isEmpty
        assertThat(expression.periodToWeeks()).isEmpty
        assertThat(expression.and()).isEmpty
        assertThat(expression.or()).isEmpty
        assertThat(expression.xor()).isEmpty
        assertThat(expression.ifString()).isEmpty
        assertThat(expression.ifNumber()).isEmpty
        assertThat(expression.ifBoolean()).isEmpty
        assertThat(expression.isPresent()).isEmpty
        assertThat(expression.hasEmailReply()).isEmpty
        assertThat(expression.hasPlainTextEmailReply()).isEmpty
        assertThat(expression.extractMostRecentEmailReplyHtml()).isEmpty
        assertThat(expression.extractMostRecentEmailReplyText()).isEmpty
        assertThat(expression.extractMostRecentPlainTextEmailReply()).isEmpty
        assertThat(expression.setContainsString()).isEmpty
        assertThat(expression.isEngagementType()).isEmpty
        assertThat(expression.formatFullName()).isEmpty
        assertThat(expression.absoluteValue()).isEmpty
        assertThat(expression.squareRoot()).isEmpty
        assertThat(expression.power()).isEmpty
        assertThat(expression.substring()).isEmpty
        assertThat(expression.euler()).isEmpty
        assertThat(expression.stringLength()).isEmpty
        assertThat(expression.addTime()).isEmpty
        assertThat(expression.subtractTime()).isEmpty
    }

    @Test
    fun ofLessThanRoundtrip() {
        val jsonMapper = jsonMapper()
        val expression =
            Expression.ofLessThan(
                LessThan.builder()
                    .operator(LessThan.Operator.LESS_THAN)
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
            )

        val roundtrippedExpression =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(expression),
                jacksonTypeRef<Expression>(),
            )

        assertThat(roundtrippedExpression).isEqualTo(expression)
    }

    @Test
    fun ofLessThanOrEqual() {
        val lessThanOrEqual =
            LessThanOrEqual.builder()
                .operator(LessThanOrEqual.Operator.LESS_THAN_OR_EQUAL)
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

        val expression = Expression.ofLessThanOrEqual(lessThanOrEqual)

        assertThat(expression.constantBoolean()).isEmpty
        assertThat(expression.constantNumber()).isEmpty
        assertThat(expression.constantString()).isEmpty
        assertThat(expression.booleanPropertyVariable()).isEmpty
        assertThat(expression.stringPropertyVariable()).isEmpty
        assertThat(expression.numberPropertyVariable()).isEmpty
        assertThat(expression.timestampOfPropertyVariable()).isEmpty
        assertThat(expression.booleanTargetPropertyVariable()).isEmpty
        assertThat(expression.stringTargetPropertyVariable()).isEmpty
        assertThat(expression.numberTargetPropertyVariable()).isEmpty
        assertThat(expression.timestampOfTargetPropertyVariable()).isEmpty
        assertThat(expression.addNumbers()).isEmpty
        assertThat(expression.subtractNumbers()).isEmpty
        assertThat(expression.multiplyNumbers()).isEmpty
        assertThat(expression.divideNumbers()).isEmpty
        assertThat(expression.roundDownNumbers()).isEmpty
        assertThat(expression.roundUpNumbers()).isEmpty
        assertThat(expression.roundNearestNumbers()).isEmpty
        assertThat(expression.upperCase()).isEmpty
        assertThat(expression.lowerCase()).isEmpty
        assertThat(expression.concatStrings()).isEmpty
        assertThat(expression.contains()).isEmpty
        assertThat(expression.beginsWith()).isEmpty
        assertThat(expression.numberToString()).isEmpty
        assertThat(expression.parseNumber()).isEmpty
        assertThat(expression.fetchExchangeRate()).isEmpty
        assertThat(expression.fetchCurrencyDecimalPlaces()).isEmpty
        assertThat(expression.fetchSingleCurrencyPortalCurrency()).isEmpty
        assertThat(expression.datedExchangeRate()).isEmpty
        assertThat(expression.pipelineProbability()).isEmpty
        assertThat(expression.maxNumbers()).isEmpty
        assertThat(expression.minNumbers()).isEmpty
        assertThat(expression.lessThan()).isEmpty
        assertThat(expression.lessThanOrEqual()).contains(lessThanOrEqual)
        assertThat(expression.moreThan()).isEmpty
        assertThat(expression.moreThanOrEqual()).isEmpty
        assertThat(expression.numberEquals()).isEmpty
        assertThat(expression.stringEquals()).isEmpty
        assertThat(expression.isPipelineStageClosed()).isEmpty
        assertThat(expression.not()).isEmpty
        assertThat(expression.date()).isEmpty
        assertThat(expression.month()).isEmpty
        assertThat(expression.year()).isEmpty
        assertThat(expression.now()).isEmpty
        assertThat(expression.timeBetween()).isEmpty
        assertThat(expression.periodToMonths()).isEmpty
        assertThat(expression.periodToWeeks()).isEmpty
        assertThat(expression.and()).isEmpty
        assertThat(expression.or()).isEmpty
        assertThat(expression.xor()).isEmpty
        assertThat(expression.ifString()).isEmpty
        assertThat(expression.ifNumber()).isEmpty
        assertThat(expression.ifBoolean()).isEmpty
        assertThat(expression.isPresent()).isEmpty
        assertThat(expression.hasEmailReply()).isEmpty
        assertThat(expression.hasPlainTextEmailReply()).isEmpty
        assertThat(expression.extractMostRecentEmailReplyHtml()).isEmpty
        assertThat(expression.extractMostRecentEmailReplyText()).isEmpty
        assertThat(expression.extractMostRecentPlainTextEmailReply()).isEmpty
        assertThat(expression.setContainsString()).isEmpty
        assertThat(expression.isEngagementType()).isEmpty
        assertThat(expression.formatFullName()).isEmpty
        assertThat(expression.absoluteValue()).isEmpty
        assertThat(expression.squareRoot()).isEmpty
        assertThat(expression.power()).isEmpty
        assertThat(expression.substring()).isEmpty
        assertThat(expression.euler()).isEmpty
        assertThat(expression.stringLength()).isEmpty
        assertThat(expression.addTime()).isEmpty
        assertThat(expression.subtractTime()).isEmpty
    }

    @Test
    fun ofLessThanOrEqualRoundtrip() {
        val jsonMapper = jsonMapper()
        val expression =
            Expression.ofLessThanOrEqual(
                LessThanOrEqual.builder()
                    .operator(LessThanOrEqual.Operator.LESS_THAN_OR_EQUAL)
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
            )

        val roundtrippedExpression =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(expression),
                jacksonTypeRef<Expression>(),
            )

        assertThat(roundtrippedExpression).isEqualTo(expression)
    }

    @Test
    fun ofMoreThan() {
        val moreThan =
            MoreThan.builder()
                .operator(MoreThan.Operator.MORE_THAN)
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

        val expression = Expression.ofMoreThan(moreThan)

        assertThat(expression.constantBoolean()).isEmpty
        assertThat(expression.constantNumber()).isEmpty
        assertThat(expression.constantString()).isEmpty
        assertThat(expression.booleanPropertyVariable()).isEmpty
        assertThat(expression.stringPropertyVariable()).isEmpty
        assertThat(expression.numberPropertyVariable()).isEmpty
        assertThat(expression.timestampOfPropertyVariable()).isEmpty
        assertThat(expression.booleanTargetPropertyVariable()).isEmpty
        assertThat(expression.stringTargetPropertyVariable()).isEmpty
        assertThat(expression.numberTargetPropertyVariable()).isEmpty
        assertThat(expression.timestampOfTargetPropertyVariable()).isEmpty
        assertThat(expression.addNumbers()).isEmpty
        assertThat(expression.subtractNumbers()).isEmpty
        assertThat(expression.multiplyNumbers()).isEmpty
        assertThat(expression.divideNumbers()).isEmpty
        assertThat(expression.roundDownNumbers()).isEmpty
        assertThat(expression.roundUpNumbers()).isEmpty
        assertThat(expression.roundNearestNumbers()).isEmpty
        assertThat(expression.upperCase()).isEmpty
        assertThat(expression.lowerCase()).isEmpty
        assertThat(expression.concatStrings()).isEmpty
        assertThat(expression.contains()).isEmpty
        assertThat(expression.beginsWith()).isEmpty
        assertThat(expression.numberToString()).isEmpty
        assertThat(expression.parseNumber()).isEmpty
        assertThat(expression.fetchExchangeRate()).isEmpty
        assertThat(expression.fetchCurrencyDecimalPlaces()).isEmpty
        assertThat(expression.fetchSingleCurrencyPortalCurrency()).isEmpty
        assertThat(expression.datedExchangeRate()).isEmpty
        assertThat(expression.pipelineProbability()).isEmpty
        assertThat(expression.maxNumbers()).isEmpty
        assertThat(expression.minNumbers()).isEmpty
        assertThat(expression.lessThan()).isEmpty
        assertThat(expression.lessThanOrEqual()).isEmpty
        assertThat(expression.moreThan()).contains(moreThan)
        assertThat(expression.moreThanOrEqual()).isEmpty
        assertThat(expression.numberEquals()).isEmpty
        assertThat(expression.stringEquals()).isEmpty
        assertThat(expression.isPipelineStageClosed()).isEmpty
        assertThat(expression.not()).isEmpty
        assertThat(expression.date()).isEmpty
        assertThat(expression.month()).isEmpty
        assertThat(expression.year()).isEmpty
        assertThat(expression.now()).isEmpty
        assertThat(expression.timeBetween()).isEmpty
        assertThat(expression.periodToMonths()).isEmpty
        assertThat(expression.periodToWeeks()).isEmpty
        assertThat(expression.and()).isEmpty
        assertThat(expression.or()).isEmpty
        assertThat(expression.xor()).isEmpty
        assertThat(expression.ifString()).isEmpty
        assertThat(expression.ifNumber()).isEmpty
        assertThat(expression.ifBoolean()).isEmpty
        assertThat(expression.isPresent()).isEmpty
        assertThat(expression.hasEmailReply()).isEmpty
        assertThat(expression.hasPlainTextEmailReply()).isEmpty
        assertThat(expression.extractMostRecentEmailReplyHtml()).isEmpty
        assertThat(expression.extractMostRecentEmailReplyText()).isEmpty
        assertThat(expression.extractMostRecentPlainTextEmailReply()).isEmpty
        assertThat(expression.setContainsString()).isEmpty
        assertThat(expression.isEngagementType()).isEmpty
        assertThat(expression.formatFullName()).isEmpty
        assertThat(expression.absoluteValue()).isEmpty
        assertThat(expression.squareRoot()).isEmpty
        assertThat(expression.power()).isEmpty
        assertThat(expression.substring()).isEmpty
        assertThat(expression.euler()).isEmpty
        assertThat(expression.stringLength()).isEmpty
        assertThat(expression.addTime()).isEmpty
        assertThat(expression.subtractTime()).isEmpty
    }

    @Test
    fun ofMoreThanRoundtrip() {
        val jsonMapper = jsonMapper()
        val expression =
            Expression.ofMoreThan(
                MoreThan.builder()
                    .operator(MoreThan.Operator.MORE_THAN)
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
            )

        val roundtrippedExpression =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(expression),
                jacksonTypeRef<Expression>(),
            )

        assertThat(roundtrippedExpression).isEqualTo(expression)
    }

    @Test
    fun ofMoreThanOrEqual() {
        val moreThanOrEqual =
            MoreThanOrEqual.builder()
                .operator(MoreThanOrEqual.Operator.MORE_THAN_OR_EQUAL)
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

        val expression = Expression.ofMoreThanOrEqual(moreThanOrEqual)

        assertThat(expression.constantBoolean()).isEmpty
        assertThat(expression.constantNumber()).isEmpty
        assertThat(expression.constantString()).isEmpty
        assertThat(expression.booleanPropertyVariable()).isEmpty
        assertThat(expression.stringPropertyVariable()).isEmpty
        assertThat(expression.numberPropertyVariable()).isEmpty
        assertThat(expression.timestampOfPropertyVariable()).isEmpty
        assertThat(expression.booleanTargetPropertyVariable()).isEmpty
        assertThat(expression.stringTargetPropertyVariable()).isEmpty
        assertThat(expression.numberTargetPropertyVariable()).isEmpty
        assertThat(expression.timestampOfTargetPropertyVariable()).isEmpty
        assertThat(expression.addNumbers()).isEmpty
        assertThat(expression.subtractNumbers()).isEmpty
        assertThat(expression.multiplyNumbers()).isEmpty
        assertThat(expression.divideNumbers()).isEmpty
        assertThat(expression.roundDownNumbers()).isEmpty
        assertThat(expression.roundUpNumbers()).isEmpty
        assertThat(expression.roundNearestNumbers()).isEmpty
        assertThat(expression.upperCase()).isEmpty
        assertThat(expression.lowerCase()).isEmpty
        assertThat(expression.concatStrings()).isEmpty
        assertThat(expression.contains()).isEmpty
        assertThat(expression.beginsWith()).isEmpty
        assertThat(expression.numberToString()).isEmpty
        assertThat(expression.parseNumber()).isEmpty
        assertThat(expression.fetchExchangeRate()).isEmpty
        assertThat(expression.fetchCurrencyDecimalPlaces()).isEmpty
        assertThat(expression.fetchSingleCurrencyPortalCurrency()).isEmpty
        assertThat(expression.datedExchangeRate()).isEmpty
        assertThat(expression.pipelineProbability()).isEmpty
        assertThat(expression.maxNumbers()).isEmpty
        assertThat(expression.minNumbers()).isEmpty
        assertThat(expression.lessThan()).isEmpty
        assertThat(expression.lessThanOrEqual()).isEmpty
        assertThat(expression.moreThan()).isEmpty
        assertThat(expression.moreThanOrEqual()).contains(moreThanOrEqual)
        assertThat(expression.numberEquals()).isEmpty
        assertThat(expression.stringEquals()).isEmpty
        assertThat(expression.isPipelineStageClosed()).isEmpty
        assertThat(expression.not()).isEmpty
        assertThat(expression.date()).isEmpty
        assertThat(expression.month()).isEmpty
        assertThat(expression.year()).isEmpty
        assertThat(expression.now()).isEmpty
        assertThat(expression.timeBetween()).isEmpty
        assertThat(expression.periodToMonths()).isEmpty
        assertThat(expression.periodToWeeks()).isEmpty
        assertThat(expression.and()).isEmpty
        assertThat(expression.or()).isEmpty
        assertThat(expression.xor()).isEmpty
        assertThat(expression.ifString()).isEmpty
        assertThat(expression.ifNumber()).isEmpty
        assertThat(expression.ifBoolean()).isEmpty
        assertThat(expression.isPresent()).isEmpty
        assertThat(expression.hasEmailReply()).isEmpty
        assertThat(expression.hasPlainTextEmailReply()).isEmpty
        assertThat(expression.extractMostRecentEmailReplyHtml()).isEmpty
        assertThat(expression.extractMostRecentEmailReplyText()).isEmpty
        assertThat(expression.extractMostRecentPlainTextEmailReply()).isEmpty
        assertThat(expression.setContainsString()).isEmpty
        assertThat(expression.isEngagementType()).isEmpty
        assertThat(expression.formatFullName()).isEmpty
        assertThat(expression.absoluteValue()).isEmpty
        assertThat(expression.squareRoot()).isEmpty
        assertThat(expression.power()).isEmpty
        assertThat(expression.substring()).isEmpty
        assertThat(expression.euler()).isEmpty
        assertThat(expression.stringLength()).isEmpty
        assertThat(expression.addTime()).isEmpty
        assertThat(expression.subtractTime()).isEmpty
    }

    @Test
    fun ofMoreThanOrEqualRoundtrip() {
        val jsonMapper = jsonMapper()
        val expression =
            Expression.ofMoreThanOrEqual(
                MoreThanOrEqual.builder()
                    .operator(MoreThanOrEqual.Operator.MORE_THAN_OR_EQUAL)
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
            )

        val roundtrippedExpression =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(expression),
                jacksonTypeRef<Expression>(),
            )

        assertThat(roundtrippedExpression).isEqualTo(expression)
    }

    @Test
    fun ofNumberEquals() {
        val numberEquals =
            NumberEquals.builder()
                .operator(NumberEquals.Operator.NUMBER_EQUALS)
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

        val expression = Expression.ofNumberEquals(numberEquals)

        assertThat(expression.constantBoolean()).isEmpty
        assertThat(expression.constantNumber()).isEmpty
        assertThat(expression.constantString()).isEmpty
        assertThat(expression.booleanPropertyVariable()).isEmpty
        assertThat(expression.stringPropertyVariable()).isEmpty
        assertThat(expression.numberPropertyVariable()).isEmpty
        assertThat(expression.timestampOfPropertyVariable()).isEmpty
        assertThat(expression.booleanTargetPropertyVariable()).isEmpty
        assertThat(expression.stringTargetPropertyVariable()).isEmpty
        assertThat(expression.numberTargetPropertyVariable()).isEmpty
        assertThat(expression.timestampOfTargetPropertyVariable()).isEmpty
        assertThat(expression.addNumbers()).isEmpty
        assertThat(expression.subtractNumbers()).isEmpty
        assertThat(expression.multiplyNumbers()).isEmpty
        assertThat(expression.divideNumbers()).isEmpty
        assertThat(expression.roundDownNumbers()).isEmpty
        assertThat(expression.roundUpNumbers()).isEmpty
        assertThat(expression.roundNearestNumbers()).isEmpty
        assertThat(expression.upperCase()).isEmpty
        assertThat(expression.lowerCase()).isEmpty
        assertThat(expression.concatStrings()).isEmpty
        assertThat(expression.contains()).isEmpty
        assertThat(expression.beginsWith()).isEmpty
        assertThat(expression.numberToString()).isEmpty
        assertThat(expression.parseNumber()).isEmpty
        assertThat(expression.fetchExchangeRate()).isEmpty
        assertThat(expression.fetchCurrencyDecimalPlaces()).isEmpty
        assertThat(expression.fetchSingleCurrencyPortalCurrency()).isEmpty
        assertThat(expression.datedExchangeRate()).isEmpty
        assertThat(expression.pipelineProbability()).isEmpty
        assertThat(expression.maxNumbers()).isEmpty
        assertThat(expression.minNumbers()).isEmpty
        assertThat(expression.lessThan()).isEmpty
        assertThat(expression.lessThanOrEqual()).isEmpty
        assertThat(expression.moreThan()).isEmpty
        assertThat(expression.moreThanOrEqual()).isEmpty
        assertThat(expression.numberEquals()).contains(numberEquals)
        assertThat(expression.stringEquals()).isEmpty
        assertThat(expression.isPipelineStageClosed()).isEmpty
        assertThat(expression.not()).isEmpty
        assertThat(expression.date()).isEmpty
        assertThat(expression.month()).isEmpty
        assertThat(expression.year()).isEmpty
        assertThat(expression.now()).isEmpty
        assertThat(expression.timeBetween()).isEmpty
        assertThat(expression.periodToMonths()).isEmpty
        assertThat(expression.periodToWeeks()).isEmpty
        assertThat(expression.and()).isEmpty
        assertThat(expression.or()).isEmpty
        assertThat(expression.xor()).isEmpty
        assertThat(expression.ifString()).isEmpty
        assertThat(expression.ifNumber()).isEmpty
        assertThat(expression.ifBoolean()).isEmpty
        assertThat(expression.isPresent()).isEmpty
        assertThat(expression.hasEmailReply()).isEmpty
        assertThat(expression.hasPlainTextEmailReply()).isEmpty
        assertThat(expression.extractMostRecentEmailReplyHtml()).isEmpty
        assertThat(expression.extractMostRecentEmailReplyText()).isEmpty
        assertThat(expression.extractMostRecentPlainTextEmailReply()).isEmpty
        assertThat(expression.setContainsString()).isEmpty
        assertThat(expression.isEngagementType()).isEmpty
        assertThat(expression.formatFullName()).isEmpty
        assertThat(expression.absoluteValue()).isEmpty
        assertThat(expression.squareRoot()).isEmpty
        assertThat(expression.power()).isEmpty
        assertThat(expression.substring()).isEmpty
        assertThat(expression.euler()).isEmpty
        assertThat(expression.stringLength()).isEmpty
        assertThat(expression.addTime()).isEmpty
        assertThat(expression.subtractTime()).isEmpty
    }

    @Test
    fun ofNumberEqualsRoundtrip() {
        val jsonMapper = jsonMapper()
        val expression =
            Expression.ofNumberEquals(
                NumberEquals.builder()
                    .operator(NumberEquals.Operator.NUMBER_EQUALS)
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
            )

        val roundtrippedExpression =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(expression),
                jacksonTypeRef<Expression>(),
            )

        assertThat(roundtrippedExpression).isEqualTo(expression)
    }

    @Test
    fun ofStringEquals() {
        val stringEquals =
            StringEquals.builder()
                .operator(StringEquals.Operator.STRING_EQUALS)
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

        val expression = Expression.ofStringEquals(stringEquals)

        assertThat(expression.constantBoolean()).isEmpty
        assertThat(expression.constantNumber()).isEmpty
        assertThat(expression.constantString()).isEmpty
        assertThat(expression.booleanPropertyVariable()).isEmpty
        assertThat(expression.stringPropertyVariable()).isEmpty
        assertThat(expression.numberPropertyVariable()).isEmpty
        assertThat(expression.timestampOfPropertyVariable()).isEmpty
        assertThat(expression.booleanTargetPropertyVariable()).isEmpty
        assertThat(expression.stringTargetPropertyVariable()).isEmpty
        assertThat(expression.numberTargetPropertyVariable()).isEmpty
        assertThat(expression.timestampOfTargetPropertyVariable()).isEmpty
        assertThat(expression.addNumbers()).isEmpty
        assertThat(expression.subtractNumbers()).isEmpty
        assertThat(expression.multiplyNumbers()).isEmpty
        assertThat(expression.divideNumbers()).isEmpty
        assertThat(expression.roundDownNumbers()).isEmpty
        assertThat(expression.roundUpNumbers()).isEmpty
        assertThat(expression.roundNearestNumbers()).isEmpty
        assertThat(expression.upperCase()).isEmpty
        assertThat(expression.lowerCase()).isEmpty
        assertThat(expression.concatStrings()).isEmpty
        assertThat(expression.contains()).isEmpty
        assertThat(expression.beginsWith()).isEmpty
        assertThat(expression.numberToString()).isEmpty
        assertThat(expression.parseNumber()).isEmpty
        assertThat(expression.fetchExchangeRate()).isEmpty
        assertThat(expression.fetchCurrencyDecimalPlaces()).isEmpty
        assertThat(expression.fetchSingleCurrencyPortalCurrency()).isEmpty
        assertThat(expression.datedExchangeRate()).isEmpty
        assertThat(expression.pipelineProbability()).isEmpty
        assertThat(expression.maxNumbers()).isEmpty
        assertThat(expression.minNumbers()).isEmpty
        assertThat(expression.lessThan()).isEmpty
        assertThat(expression.lessThanOrEqual()).isEmpty
        assertThat(expression.moreThan()).isEmpty
        assertThat(expression.moreThanOrEqual()).isEmpty
        assertThat(expression.numberEquals()).isEmpty
        assertThat(expression.stringEquals()).contains(stringEquals)
        assertThat(expression.isPipelineStageClosed()).isEmpty
        assertThat(expression.not()).isEmpty
        assertThat(expression.date()).isEmpty
        assertThat(expression.month()).isEmpty
        assertThat(expression.year()).isEmpty
        assertThat(expression.now()).isEmpty
        assertThat(expression.timeBetween()).isEmpty
        assertThat(expression.periodToMonths()).isEmpty
        assertThat(expression.periodToWeeks()).isEmpty
        assertThat(expression.and()).isEmpty
        assertThat(expression.or()).isEmpty
        assertThat(expression.xor()).isEmpty
        assertThat(expression.ifString()).isEmpty
        assertThat(expression.ifNumber()).isEmpty
        assertThat(expression.ifBoolean()).isEmpty
        assertThat(expression.isPresent()).isEmpty
        assertThat(expression.hasEmailReply()).isEmpty
        assertThat(expression.hasPlainTextEmailReply()).isEmpty
        assertThat(expression.extractMostRecentEmailReplyHtml()).isEmpty
        assertThat(expression.extractMostRecentEmailReplyText()).isEmpty
        assertThat(expression.extractMostRecentPlainTextEmailReply()).isEmpty
        assertThat(expression.setContainsString()).isEmpty
        assertThat(expression.isEngagementType()).isEmpty
        assertThat(expression.formatFullName()).isEmpty
        assertThat(expression.absoluteValue()).isEmpty
        assertThat(expression.squareRoot()).isEmpty
        assertThat(expression.power()).isEmpty
        assertThat(expression.substring()).isEmpty
        assertThat(expression.euler()).isEmpty
        assertThat(expression.stringLength()).isEmpty
        assertThat(expression.addTime()).isEmpty
        assertThat(expression.subtractTime()).isEmpty
    }

    @Test
    fun ofStringEqualsRoundtrip() {
        val jsonMapper = jsonMapper()
        val expression =
            Expression.ofStringEquals(
                StringEquals.builder()
                    .operator(StringEquals.Operator.STRING_EQUALS)
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
            )

        val roundtrippedExpression =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(expression),
                jacksonTypeRef<Expression>(),
            )

        assertThat(roundtrippedExpression).isEqualTo(expression)
    }

    @Test
    fun ofIsPipelineStageClosed() {
        val isPipelineStageClosed =
            IsPipelineStageClosed.builder()
                .operator(IsPipelineStageClosed.Operator.IS_PIPELINE_STAGE_CLOSED)
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

        val expression = Expression.ofIsPipelineStageClosed(isPipelineStageClosed)

        assertThat(expression.constantBoolean()).isEmpty
        assertThat(expression.constantNumber()).isEmpty
        assertThat(expression.constantString()).isEmpty
        assertThat(expression.booleanPropertyVariable()).isEmpty
        assertThat(expression.stringPropertyVariable()).isEmpty
        assertThat(expression.numberPropertyVariable()).isEmpty
        assertThat(expression.timestampOfPropertyVariable()).isEmpty
        assertThat(expression.booleanTargetPropertyVariable()).isEmpty
        assertThat(expression.stringTargetPropertyVariable()).isEmpty
        assertThat(expression.numberTargetPropertyVariable()).isEmpty
        assertThat(expression.timestampOfTargetPropertyVariable()).isEmpty
        assertThat(expression.addNumbers()).isEmpty
        assertThat(expression.subtractNumbers()).isEmpty
        assertThat(expression.multiplyNumbers()).isEmpty
        assertThat(expression.divideNumbers()).isEmpty
        assertThat(expression.roundDownNumbers()).isEmpty
        assertThat(expression.roundUpNumbers()).isEmpty
        assertThat(expression.roundNearestNumbers()).isEmpty
        assertThat(expression.upperCase()).isEmpty
        assertThat(expression.lowerCase()).isEmpty
        assertThat(expression.concatStrings()).isEmpty
        assertThat(expression.contains()).isEmpty
        assertThat(expression.beginsWith()).isEmpty
        assertThat(expression.numberToString()).isEmpty
        assertThat(expression.parseNumber()).isEmpty
        assertThat(expression.fetchExchangeRate()).isEmpty
        assertThat(expression.fetchCurrencyDecimalPlaces()).isEmpty
        assertThat(expression.fetchSingleCurrencyPortalCurrency()).isEmpty
        assertThat(expression.datedExchangeRate()).isEmpty
        assertThat(expression.pipelineProbability()).isEmpty
        assertThat(expression.maxNumbers()).isEmpty
        assertThat(expression.minNumbers()).isEmpty
        assertThat(expression.lessThan()).isEmpty
        assertThat(expression.lessThanOrEqual()).isEmpty
        assertThat(expression.moreThan()).isEmpty
        assertThat(expression.moreThanOrEqual()).isEmpty
        assertThat(expression.numberEquals()).isEmpty
        assertThat(expression.stringEquals()).isEmpty
        assertThat(expression.isPipelineStageClosed()).contains(isPipelineStageClosed)
        assertThat(expression.not()).isEmpty
        assertThat(expression.date()).isEmpty
        assertThat(expression.month()).isEmpty
        assertThat(expression.year()).isEmpty
        assertThat(expression.now()).isEmpty
        assertThat(expression.timeBetween()).isEmpty
        assertThat(expression.periodToMonths()).isEmpty
        assertThat(expression.periodToWeeks()).isEmpty
        assertThat(expression.and()).isEmpty
        assertThat(expression.or()).isEmpty
        assertThat(expression.xor()).isEmpty
        assertThat(expression.ifString()).isEmpty
        assertThat(expression.ifNumber()).isEmpty
        assertThat(expression.ifBoolean()).isEmpty
        assertThat(expression.isPresent()).isEmpty
        assertThat(expression.hasEmailReply()).isEmpty
        assertThat(expression.hasPlainTextEmailReply()).isEmpty
        assertThat(expression.extractMostRecentEmailReplyHtml()).isEmpty
        assertThat(expression.extractMostRecentEmailReplyText()).isEmpty
        assertThat(expression.extractMostRecentPlainTextEmailReply()).isEmpty
        assertThat(expression.setContainsString()).isEmpty
        assertThat(expression.isEngagementType()).isEmpty
        assertThat(expression.formatFullName()).isEmpty
        assertThat(expression.absoluteValue()).isEmpty
        assertThat(expression.squareRoot()).isEmpty
        assertThat(expression.power()).isEmpty
        assertThat(expression.substring()).isEmpty
        assertThat(expression.euler()).isEmpty
        assertThat(expression.stringLength()).isEmpty
        assertThat(expression.addTime()).isEmpty
        assertThat(expression.subtractTime()).isEmpty
    }

    @Test
    fun ofIsPipelineStageClosedRoundtrip() {
        val jsonMapper = jsonMapper()
        val expression =
            Expression.ofIsPipelineStageClosed(
                IsPipelineStageClosed.builder()
                    .operator(IsPipelineStageClosed.Operator.IS_PIPELINE_STAGE_CLOSED)
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
            )

        val roundtrippedExpression =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(expression),
                jacksonTypeRef<Expression>(),
            )

        assertThat(roundtrippedExpression).isEqualTo(expression)
    }

    @Test
    fun ofNot() {
        val not =
            Not.builder()
                .operator(Not.Operator.NOT)
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

        val expression = Expression.ofNot(not)

        assertThat(expression.constantBoolean()).isEmpty
        assertThat(expression.constantNumber()).isEmpty
        assertThat(expression.constantString()).isEmpty
        assertThat(expression.booleanPropertyVariable()).isEmpty
        assertThat(expression.stringPropertyVariable()).isEmpty
        assertThat(expression.numberPropertyVariable()).isEmpty
        assertThat(expression.timestampOfPropertyVariable()).isEmpty
        assertThat(expression.booleanTargetPropertyVariable()).isEmpty
        assertThat(expression.stringTargetPropertyVariable()).isEmpty
        assertThat(expression.numberTargetPropertyVariable()).isEmpty
        assertThat(expression.timestampOfTargetPropertyVariable()).isEmpty
        assertThat(expression.addNumbers()).isEmpty
        assertThat(expression.subtractNumbers()).isEmpty
        assertThat(expression.multiplyNumbers()).isEmpty
        assertThat(expression.divideNumbers()).isEmpty
        assertThat(expression.roundDownNumbers()).isEmpty
        assertThat(expression.roundUpNumbers()).isEmpty
        assertThat(expression.roundNearestNumbers()).isEmpty
        assertThat(expression.upperCase()).isEmpty
        assertThat(expression.lowerCase()).isEmpty
        assertThat(expression.concatStrings()).isEmpty
        assertThat(expression.contains()).isEmpty
        assertThat(expression.beginsWith()).isEmpty
        assertThat(expression.numberToString()).isEmpty
        assertThat(expression.parseNumber()).isEmpty
        assertThat(expression.fetchExchangeRate()).isEmpty
        assertThat(expression.fetchCurrencyDecimalPlaces()).isEmpty
        assertThat(expression.fetchSingleCurrencyPortalCurrency()).isEmpty
        assertThat(expression.datedExchangeRate()).isEmpty
        assertThat(expression.pipelineProbability()).isEmpty
        assertThat(expression.maxNumbers()).isEmpty
        assertThat(expression.minNumbers()).isEmpty
        assertThat(expression.lessThan()).isEmpty
        assertThat(expression.lessThanOrEqual()).isEmpty
        assertThat(expression.moreThan()).isEmpty
        assertThat(expression.moreThanOrEqual()).isEmpty
        assertThat(expression.numberEquals()).isEmpty
        assertThat(expression.stringEquals()).isEmpty
        assertThat(expression.isPipelineStageClosed()).isEmpty
        assertThat(expression.not()).contains(not)
        assertThat(expression.date()).isEmpty
        assertThat(expression.month()).isEmpty
        assertThat(expression.year()).isEmpty
        assertThat(expression.now()).isEmpty
        assertThat(expression.timeBetween()).isEmpty
        assertThat(expression.periodToMonths()).isEmpty
        assertThat(expression.periodToWeeks()).isEmpty
        assertThat(expression.and()).isEmpty
        assertThat(expression.or()).isEmpty
        assertThat(expression.xor()).isEmpty
        assertThat(expression.ifString()).isEmpty
        assertThat(expression.ifNumber()).isEmpty
        assertThat(expression.ifBoolean()).isEmpty
        assertThat(expression.isPresent()).isEmpty
        assertThat(expression.hasEmailReply()).isEmpty
        assertThat(expression.hasPlainTextEmailReply()).isEmpty
        assertThat(expression.extractMostRecentEmailReplyHtml()).isEmpty
        assertThat(expression.extractMostRecentEmailReplyText()).isEmpty
        assertThat(expression.extractMostRecentPlainTextEmailReply()).isEmpty
        assertThat(expression.setContainsString()).isEmpty
        assertThat(expression.isEngagementType()).isEmpty
        assertThat(expression.formatFullName()).isEmpty
        assertThat(expression.absoluteValue()).isEmpty
        assertThat(expression.squareRoot()).isEmpty
        assertThat(expression.power()).isEmpty
        assertThat(expression.substring()).isEmpty
        assertThat(expression.euler()).isEmpty
        assertThat(expression.stringLength()).isEmpty
        assertThat(expression.addTime()).isEmpty
        assertThat(expression.subtractTime()).isEmpty
    }

    @Test
    fun ofNotRoundtrip() {
        val jsonMapper = jsonMapper()
        val expression =
            Expression.ofNot(
                Not.builder()
                    .operator(Not.Operator.NOT)
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
            )

        val roundtrippedExpression =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(expression),
                jacksonTypeRef<Expression>(),
            )

        assertThat(roundtrippedExpression).isEqualTo(expression)
    }

    @Test
    fun ofDate() {
        val date =
            Date.builder()
                .operator(Date.Operator.DATE)
                .addInput(
                    ConstantBoolean.builder()
                        .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                        .inputs(listOf())
                        .propertyName("propertyName")
                        .value(true)
                        .build()
                )
                .propertyName("propertyName")
                .value(0.0)
                .build()

        val expression = Expression.ofDate(date)

        assertThat(expression.constantBoolean()).isEmpty
        assertThat(expression.constantNumber()).isEmpty
        assertThat(expression.constantString()).isEmpty
        assertThat(expression.booleanPropertyVariable()).isEmpty
        assertThat(expression.stringPropertyVariable()).isEmpty
        assertThat(expression.numberPropertyVariable()).isEmpty
        assertThat(expression.timestampOfPropertyVariable()).isEmpty
        assertThat(expression.booleanTargetPropertyVariable()).isEmpty
        assertThat(expression.stringTargetPropertyVariable()).isEmpty
        assertThat(expression.numberTargetPropertyVariable()).isEmpty
        assertThat(expression.timestampOfTargetPropertyVariable()).isEmpty
        assertThat(expression.addNumbers()).isEmpty
        assertThat(expression.subtractNumbers()).isEmpty
        assertThat(expression.multiplyNumbers()).isEmpty
        assertThat(expression.divideNumbers()).isEmpty
        assertThat(expression.roundDownNumbers()).isEmpty
        assertThat(expression.roundUpNumbers()).isEmpty
        assertThat(expression.roundNearestNumbers()).isEmpty
        assertThat(expression.upperCase()).isEmpty
        assertThat(expression.lowerCase()).isEmpty
        assertThat(expression.concatStrings()).isEmpty
        assertThat(expression.contains()).isEmpty
        assertThat(expression.beginsWith()).isEmpty
        assertThat(expression.numberToString()).isEmpty
        assertThat(expression.parseNumber()).isEmpty
        assertThat(expression.fetchExchangeRate()).isEmpty
        assertThat(expression.fetchCurrencyDecimalPlaces()).isEmpty
        assertThat(expression.fetchSingleCurrencyPortalCurrency()).isEmpty
        assertThat(expression.datedExchangeRate()).isEmpty
        assertThat(expression.pipelineProbability()).isEmpty
        assertThat(expression.maxNumbers()).isEmpty
        assertThat(expression.minNumbers()).isEmpty
        assertThat(expression.lessThan()).isEmpty
        assertThat(expression.lessThanOrEqual()).isEmpty
        assertThat(expression.moreThan()).isEmpty
        assertThat(expression.moreThanOrEqual()).isEmpty
        assertThat(expression.numberEquals()).isEmpty
        assertThat(expression.stringEquals()).isEmpty
        assertThat(expression.isPipelineStageClosed()).isEmpty
        assertThat(expression.not()).isEmpty
        assertThat(expression.date()).contains(date)
        assertThat(expression.month()).isEmpty
        assertThat(expression.year()).isEmpty
        assertThat(expression.now()).isEmpty
        assertThat(expression.timeBetween()).isEmpty
        assertThat(expression.periodToMonths()).isEmpty
        assertThat(expression.periodToWeeks()).isEmpty
        assertThat(expression.and()).isEmpty
        assertThat(expression.or()).isEmpty
        assertThat(expression.xor()).isEmpty
        assertThat(expression.ifString()).isEmpty
        assertThat(expression.ifNumber()).isEmpty
        assertThat(expression.ifBoolean()).isEmpty
        assertThat(expression.isPresent()).isEmpty
        assertThat(expression.hasEmailReply()).isEmpty
        assertThat(expression.hasPlainTextEmailReply()).isEmpty
        assertThat(expression.extractMostRecentEmailReplyHtml()).isEmpty
        assertThat(expression.extractMostRecentEmailReplyText()).isEmpty
        assertThat(expression.extractMostRecentPlainTextEmailReply()).isEmpty
        assertThat(expression.setContainsString()).isEmpty
        assertThat(expression.isEngagementType()).isEmpty
        assertThat(expression.formatFullName()).isEmpty
        assertThat(expression.absoluteValue()).isEmpty
        assertThat(expression.squareRoot()).isEmpty
        assertThat(expression.power()).isEmpty
        assertThat(expression.substring()).isEmpty
        assertThat(expression.euler()).isEmpty
        assertThat(expression.stringLength()).isEmpty
        assertThat(expression.addTime()).isEmpty
        assertThat(expression.subtractTime()).isEmpty
    }

    @Test
    fun ofDateRoundtrip() {
        val jsonMapper = jsonMapper()
        val expression =
            Expression.ofDate(
                Date.builder()
                    .operator(Date.Operator.DATE)
                    .addInput(
                        ConstantBoolean.builder()
                            .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                            .inputs(listOf())
                            .propertyName("propertyName")
                            .value(true)
                            .build()
                    )
                    .propertyName("propertyName")
                    .value(0.0)
                    .build()
            )

        val roundtrippedExpression =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(expression),
                jacksonTypeRef<Expression>(),
            )

        assertThat(roundtrippedExpression).isEqualTo(expression)
    }

    @Test
    fun ofMonth() {
        val month =
            Month.builder()
                .operator(Month.Operator.MONTH)
                .addInput(
                    ConstantBoolean.builder()
                        .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                        .inputs(listOf())
                        .propertyName("propertyName")
                        .value(true)
                        .build()
                )
                .propertyName("propertyName")
                .value(0.0)
                .build()

        val expression = Expression.ofMonth(month)

        assertThat(expression.constantBoolean()).isEmpty
        assertThat(expression.constantNumber()).isEmpty
        assertThat(expression.constantString()).isEmpty
        assertThat(expression.booleanPropertyVariable()).isEmpty
        assertThat(expression.stringPropertyVariable()).isEmpty
        assertThat(expression.numberPropertyVariable()).isEmpty
        assertThat(expression.timestampOfPropertyVariable()).isEmpty
        assertThat(expression.booleanTargetPropertyVariable()).isEmpty
        assertThat(expression.stringTargetPropertyVariable()).isEmpty
        assertThat(expression.numberTargetPropertyVariable()).isEmpty
        assertThat(expression.timestampOfTargetPropertyVariable()).isEmpty
        assertThat(expression.addNumbers()).isEmpty
        assertThat(expression.subtractNumbers()).isEmpty
        assertThat(expression.multiplyNumbers()).isEmpty
        assertThat(expression.divideNumbers()).isEmpty
        assertThat(expression.roundDownNumbers()).isEmpty
        assertThat(expression.roundUpNumbers()).isEmpty
        assertThat(expression.roundNearestNumbers()).isEmpty
        assertThat(expression.upperCase()).isEmpty
        assertThat(expression.lowerCase()).isEmpty
        assertThat(expression.concatStrings()).isEmpty
        assertThat(expression.contains()).isEmpty
        assertThat(expression.beginsWith()).isEmpty
        assertThat(expression.numberToString()).isEmpty
        assertThat(expression.parseNumber()).isEmpty
        assertThat(expression.fetchExchangeRate()).isEmpty
        assertThat(expression.fetchCurrencyDecimalPlaces()).isEmpty
        assertThat(expression.fetchSingleCurrencyPortalCurrency()).isEmpty
        assertThat(expression.datedExchangeRate()).isEmpty
        assertThat(expression.pipelineProbability()).isEmpty
        assertThat(expression.maxNumbers()).isEmpty
        assertThat(expression.minNumbers()).isEmpty
        assertThat(expression.lessThan()).isEmpty
        assertThat(expression.lessThanOrEqual()).isEmpty
        assertThat(expression.moreThan()).isEmpty
        assertThat(expression.moreThanOrEqual()).isEmpty
        assertThat(expression.numberEquals()).isEmpty
        assertThat(expression.stringEquals()).isEmpty
        assertThat(expression.isPipelineStageClosed()).isEmpty
        assertThat(expression.not()).isEmpty
        assertThat(expression.date()).isEmpty
        assertThat(expression.month()).contains(month)
        assertThat(expression.year()).isEmpty
        assertThat(expression.now()).isEmpty
        assertThat(expression.timeBetween()).isEmpty
        assertThat(expression.periodToMonths()).isEmpty
        assertThat(expression.periodToWeeks()).isEmpty
        assertThat(expression.and()).isEmpty
        assertThat(expression.or()).isEmpty
        assertThat(expression.xor()).isEmpty
        assertThat(expression.ifString()).isEmpty
        assertThat(expression.ifNumber()).isEmpty
        assertThat(expression.ifBoolean()).isEmpty
        assertThat(expression.isPresent()).isEmpty
        assertThat(expression.hasEmailReply()).isEmpty
        assertThat(expression.hasPlainTextEmailReply()).isEmpty
        assertThat(expression.extractMostRecentEmailReplyHtml()).isEmpty
        assertThat(expression.extractMostRecentEmailReplyText()).isEmpty
        assertThat(expression.extractMostRecentPlainTextEmailReply()).isEmpty
        assertThat(expression.setContainsString()).isEmpty
        assertThat(expression.isEngagementType()).isEmpty
        assertThat(expression.formatFullName()).isEmpty
        assertThat(expression.absoluteValue()).isEmpty
        assertThat(expression.squareRoot()).isEmpty
        assertThat(expression.power()).isEmpty
        assertThat(expression.substring()).isEmpty
        assertThat(expression.euler()).isEmpty
        assertThat(expression.stringLength()).isEmpty
        assertThat(expression.addTime()).isEmpty
        assertThat(expression.subtractTime()).isEmpty
    }

    @Test
    fun ofMonthRoundtrip() {
        val jsonMapper = jsonMapper()
        val expression =
            Expression.ofMonth(
                Month.builder()
                    .operator(Month.Operator.MONTH)
                    .addInput(
                        ConstantBoolean.builder()
                            .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                            .inputs(listOf())
                            .propertyName("propertyName")
                            .value(true)
                            .build()
                    )
                    .propertyName("propertyName")
                    .value(0.0)
                    .build()
            )

        val roundtrippedExpression =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(expression),
                jacksonTypeRef<Expression>(),
            )

        assertThat(roundtrippedExpression).isEqualTo(expression)
    }

    @Test
    fun ofYear() {
        val year =
            Year.builder()
                .operator(Year.Operator.YEAR)
                .addInput(
                    ConstantBoolean.builder()
                        .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                        .inputs(listOf())
                        .propertyName("propertyName")
                        .value(true)
                        .build()
                )
                .propertyName("propertyName")
                .value(0.0)
                .build()

        val expression = Expression.ofYear(year)

        assertThat(expression.constantBoolean()).isEmpty
        assertThat(expression.constantNumber()).isEmpty
        assertThat(expression.constantString()).isEmpty
        assertThat(expression.booleanPropertyVariable()).isEmpty
        assertThat(expression.stringPropertyVariable()).isEmpty
        assertThat(expression.numberPropertyVariable()).isEmpty
        assertThat(expression.timestampOfPropertyVariable()).isEmpty
        assertThat(expression.booleanTargetPropertyVariable()).isEmpty
        assertThat(expression.stringTargetPropertyVariable()).isEmpty
        assertThat(expression.numberTargetPropertyVariable()).isEmpty
        assertThat(expression.timestampOfTargetPropertyVariable()).isEmpty
        assertThat(expression.addNumbers()).isEmpty
        assertThat(expression.subtractNumbers()).isEmpty
        assertThat(expression.multiplyNumbers()).isEmpty
        assertThat(expression.divideNumbers()).isEmpty
        assertThat(expression.roundDownNumbers()).isEmpty
        assertThat(expression.roundUpNumbers()).isEmpty
        assertThat(expression.roundNearestNumbers()).isEmpty
        assertThat(expression.upperCase()).isEmpty
        assertThat(expression.lowerCase()).isEmpty
        assertThat(expression.concatStrings()).isEmpty
        assertThat(expression.contains()).isEmpty
        assertThat(expression.beginsWith()).isEmpty
        assertThat(expression.numberToString()).isEmpty
        assertThat(expression.parseNumber()).isEmpty
        assertThat(expression.fetchExchangeRate()).isEmpty
        assertThat(expression.fetchCurrencyDecimalPlaces()).isEmpty
        assertThat(expression.fetchSingleCurrencyPortalCurrency()).isEmpty
        assertThat(expression.datedExchangeRate()).isEmpty
        assertThat(expression.pipelineProbability()).isEmpty
        assertThat(expression.maxNumbers()).isEmpty
        assertThat(expression.minNumbers()).isEmpty
        assertThat(expression.lessThan()).isEmpty
        assertThat(expression.lessThanOrEqual()).isEmpty
        assertThat(expression.moreThan()).isEmpty
        assertThat(expression.moreThanOrEqual()).isEmpty
        assertThat(expression.numberEquals()).isEmpty
        assertThat(expression.stringEquals()).isEmpty
        assertThat(expression.isPipelineStageClosed()).isEmpty
        assertThat(expression.not()).isEmpty
        assertThat(expression.date()).isEmpty
        assertThat(expression.month()).isEmpty
        assertThat(expression.year()).contains(year)
        assertThat(expression.now()).isEmpty
        assertThat(expression.timeBetween()).isEmpty
        assertThat(expression.periodToMonths()).isEmpty
        assertThat(expression.periodToWeeks()).isEmpty
        assertThat(expression.and()).isEmpty
        assertThat(expression.or()).isEmpty
        assertThat(expression.xor()).isEmpty
        assertThat(expression.ifString()).isEmpty
        assertThat(expression.ifNumber()).isEmpty
        assertThat(expression.ifBoolean()).isEmpty
        assertThat(expression.isPresent()).isEmpty
        assertThat(expression.hasEmailReply()).isEmpty
        assertThat(expression.hasPlainTextEmailReply()).isEmpty
        assertThat(expression.extractMostRecentEmailReplyHtml()).isEmpty
        assertThat(expression.extractMostRecentEmailReplyText()).isEmpty
        assertThat(expression.extractMostRecentPlainTextEmailReply()).isEmpty
        assertThat(expression.setContainsString()).isEmpty
        assertThat(expression.isEngagementType()).isEmpty
        assertThat(expression.formatFullName()).isEmpty
        assertThat(expression.absoluteValue()).isEmpty
        assertThat(expression.squareRoot()).isEmpty
        assertThat(expression.power()).isEmpty
        assertThat(expression.substring()).isEmpty
        assertThat(expression.euler()).isEmpty
        assertThat(expression.stringLength()).isEmpty
        assertThat(expression.addTime()).isEmpty
        assertThat(expression.subtractTime()).isEmpty
    }

    @Test
    fun ofYearRoundtrip() {
        val jsonMapper = jsonMapper()
        val expression =
            Expression.ofYear(
                Year.builder()
                    .operator(Year.Operator.YEAR)
                    .addInput(
                        ConstantBoolean.builder()
                            .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                            .inputs(listOf())
                            .propertyName("propertyName")
                            .value(true)
                            .build()
                    )
                    .propertyName("propertyName")
                    .value(0.0)
                    .build()
            )

        val roundtrippedExpression =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(expression),
                jacksonTypeRef<Expression>(),
            )

        assertThat(roundtrippedExpression).isEqualTo(expression)
    }

    @Test
    fun ofNow() {
        val now =
            Now.builder()
                .operator(Now.Operator.NOW)
                .addInput(
                    ConstantBoolean.builder()
                        .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                        .inputs(listOf())
                        .propertyName("propertyName")
                        .value(true)
                        .build()
                )
                .propertyName("propertyName")
                .value(0.0)
                .build()

        val expression = Expression.ofNow(now)

        assertThat(expression.constantBoolean()).isEmpty
        assertThat(expression.constantNumber()).isEmpty
        assertThat(expression.constantString()).isEmpty
        assertThat(expression.booleanPropertyVariable()).isEmpty
        assertThat(expression.stringPropertyVariable()).isEmpty
        assertThat(expression.numberPropertyVariable()).isEmpty
        assertThat(expression.timestampOfPropertyVariable()).isEmpty
        assertThat(expression.booleanTargetPropertyVariable()).isEmpty
        assertThat(expression.stringTargetPropertyVariable()).isEmpty
        assertThat(expression.numberTargetPropertyVariable()).isEmpty
        assertThat(expression.timestampOfTargetPropertyVariable()).isEmpty
        assertThat(expression.addNumbers()).isEmpty
        assertThat(expression.subtractNumbers()).isEmpty
        assertThat(expression.multiplyNumbers()).isEmpty
        assertThat(expression.divideNumbers()).isEmpty
        assertThat(expression.roundDownNumbers()).isEmpty
        assertThat(expression.roundUpNumbers()).isEmpty
        assertThat(expression.roundNearestNumbers()).isEmpty
        assertThat(expression.upperCase()).isEmpty
        assertThat(expression.lowerCase()).isEmpty
        assertThat(expression.concatStrings()).isEmpty
        assertThat(expression.contains()).isEmpty
        assertThat(expression.beginsWith()).isEmpty
        assertThat(expression.numberToString()).isEmpty
        assertThat(expression.parseNumber()).isEmpty
        assertThat(expression.fetchExchangeRate()).isEmpty
        assertThat(expression.fetchCurrencyDecimalPlaces()).isEmpty
        assertThat(expression.fetchSingleCurrencyPortalCurrency()).isEmpty
        assertThat(expression.datedExchangeRate()).isEmpty
        assertThat(expression.pipelineProbability()).isEmpty
        assertThat(expression.maxNumbers()).isEmpty
        assertThat(expression.minNumbers()).isEmpty
        assertThat(expression.lessThan()).isEmpty
        assertThat(expression.lessThanOrEqual()).isEmpty
        assertThat(expression.moreThan()).isEmpty
        assertThat(expression.moreThanOrEqual()).isEmpty
        assertThat(expression.numberEquals()).isEmpty
        assertThat(expression.stringEquals()).isEmpty
        assertThat(expression.isPipelineStageClosed()).isEmpty
        assertThat(expression.not()).isEmpty
        assertThat(expression.date()).isEmpty
        assertThat(expression.month()).isEmpty
        assertThat(expression.year()).isEmpty
        assertThat(expression.now()).contains(now)
        assertThat(expression.timeBetween()).isEmpty
        assertThat(expression.periodToMonths()).isEmpty
        assertThat(expression.periodToWeeks()).isEmpty
        assertThat(expression.and()).isEmpty
        assertThat(expression.or()).isEmpty
        assertThat(expression.xor()).isEmpty
        assertThat(expression.ifString()).isEmpty
        assertThat(expression.ifNumber()).isEmpty
        assertThat(expression.ifBoolean()).isEmpty
        assertThat(expression.isPresent()).isEmpty
        assertThat(expression.hasEmailReply()).isEmpty
        assertThat(expression.hasPlainTextEmailReply()).isEmpty
        assertThat(expression.extractMostRecentEmailReplyHtml()).isEmpty
        assertThat(expression.extractMostRecentEmailReplyText()).isEmpty
        assertThat(expression.extractMostRecentPlainTextEmailReply()).isEmpty
        assertThat(expression.setContainsString()).isEmpty
        assertThat(expression.isEngagementType()).isEmpty
        assertThat(expression.formatFullName()).isEmpty
        assertThat(expression.absoluteValue()).isEmpty
        assertThat(expression.squareRoot()).isEmpty
        assertThat(expression.power()).isEmpty
        assertThat(expression.substring()).isEmpty
        assertThat(expression.euler()).isEmpty
        assertThat(expression.stringLength()).isEmpty
        assertThat(expression.addTime()).isEmpty
        assertThat(expression.subtractTime()).isEmpty
    }

    @Test
    fun ofNowRoundtrip() {
        val jsonMapper = jsonMapper()
        val expression =
            Expression.ofNow(
                Now.builder()
                    .operator(Now.Operator.NOW)
                    .addInput(
                        ConstantBoolean.builder()
                            .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                            .inputs(listOf())
                            .propertyName("propertyName")
                            .value(true)
                            .build()
                    )
                    .propertyName("propertyName")
                    .value(0.0)
                    .build()
            )

        val roundtrippedExpression =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(expression),
                jacksonTypeRef<Expression>(),
            )

        assertThat(roundtrippedExpression).isEqualTo(expression)
    }

    @Test
    fun ofTimeBetween() {
        val timeBetween =
            TimeBetween.builder()
                .operator(TimeBetween.Operator.TIME_BETWEEN)
                .addInput(
                    ConstantBoolean.builder()
                        .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                        .inputs(listOf())
                        .propertyName("propertyName")
                        .value(true)
                        .build()
                )
                .propertyName("propertyName")
                .value(0.0)
                .build()

        val expression = Expression.ofTimeBetween(timeBetween)

        assertThat(expression.constantBoolean()).isEmpty
        assertThat(expression.constantNumber()).isEmpty
        assertThat(expression.constantString()).isEmpty
        assertThat(expression.booleanPropertyVariable()).isEmpty
        assertThat(expression.stringPropertyVariable()).isEmpty
        assertThat(expression.numberPropertyVariable()).isEmpty
        assertThat(expression.timestampOfPropertyVariable()).isEmpty
        assertThat(expression.booleanTargetPropertyVariable()).isEmpty
        assertThat(expression.stringTargetPropertyVariable()).isEmpty
        assertThat(expression.numberTargetPropertyVariable()).isEmpty
        assertThat(expression.timestampOfTargetPropertyVariable()).isEmpty
        assertThat(expression.addNumbers()).isEmpty
        assertThat(expression.subtractNumbers()).isEmpty
        assertThat(expression.multiplyNumbers()).isEmpty
        assertThat(expression.divideNumbers()).isEmpty
        assertThat(expression.roundDownNumbers()).isEmpty
        assertThat(expression.roundUpNumbers()).isEmpty
        assertThat(expression.roundNearestNumbers()).isEmpty
        assertThat(expression.upperCase()).isEmpty
        assertThat(expression.lowerCase()).isEmpty
        assertThat(expression.concatStrings()).isEmpty
        assertThat(expression.contains()).isEmpty
        assertThat(expression.beginsWith()).isEmpty
        assertThat(expression.numberToString()).isEmpty
        assertThat(expression.parseNumber()).isEmpty
        assertThat(expression.fetchExchangeRate()).isEmpty
        assertThat(expression.fetchCurrencyDecimalPlaces()).isEmpty
        assertThat(expression.fetchSingleCurrencyPortalCurrency()).isEmpty
        assertThat(expression.datedExchangeRate()).isEmpty
        assertThat(expression.pipelineProbability()).isEmpty
        assertThat(expression.maxNumbers()).isEmpty
        assertThat(expression.minNumbers()).isEmpty
        assertThat(expression.lessThan()).isEmpty
        assertThat(expression.lessThanOrEqual()).isEmpty
        assertThat(expression.moreThan()).isEmpty
        assertThat(expression.moreThanOrEqual()).isEmpty
        assertThat(expression.numberEquals()).isEmpty
        assertThat(expression.stringEquals()).isEmpty
        assertThat(expression.isPipelineStageClosed()).isEmpty
        assertThat(expression.not()).isEmpty
        assertThat(expression.date()).isEmpty
        assertThat(expression.month()).isEmpty
        assertThat(expression.year()).isEmpty
        assertThat(expression.now()).isEmpty
        assertThat(expression.timeBetween()).contains(timeBetween)
        assertThat(expression.periodToMonths()).isEmpty
        assertThat(expression.periodToWeeks()).isEmpty
        assertThat(expression.and()).isEmpty
        assertThat(expression.or()).isEmpty
        assertThat(expression.xor()).isEmpty
        assertThat(expression.ifString()).isEmpty
        assertThat(expression.ifNumber()).isEmpty
        assertThat(expression.ifBoolean()).isEmpty
        assertThat(expression.isPresent()).isEmpty
        assertThat(expression.hasEmailReply()).isEmpty
        assertThat(expression.hasPlainTextEmailReply()).isEmpty
        assertThat(expression.extractMostRecentEmailReplyHtml()).isEmpty
        assertThat(expression.extractMostRecentEmailReplyText()).isEmpty
        assertThat(expression.extractMostRecentPlainTextEmailReply()).isEmpty
        assertThat(expression.setContainsString()).isEmpty
        assertThat(expression.isEngagementType()).isEmpty
        assertThat(expression.formatFullName()).isEmpty
        assertThat(expression.absoluteValue()).isEmpty
        assertThat(expression.squareRoot()).isEmpty
        assertThat(expression.power()).isEmpty
        assertThat(expression.substring()).isEmpty
        assertThat(expression.euler()).isEmpty
        assertThat(expression.stringLength()).isEmpty
        assertThat(expression.addTime()).isEmpty
        assertThat(expression.subtractTime()).isEmpty
    }

    @Test
    fun ofTimeBetweenRoundtrip() {
        val jsonMapper = jsonMapper()
        val expression =
            Expression.ofTimeBetween(
                TimeBetween.builder()
                    .operator(TimeBetween.Operator.TIME_BETWEEN)
                    .addInput(
                        ConstantBoolean.builder()
                            .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                            .inputs(listOf())
                            .propertyName("propertyName")
                            .value(true)
                            .build()
                    )
                    .propertyName("propertyName")
                    .value(0.0)
                    .build()
            )

        val roundtrippedExpression =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(expression),
                jacksonTypeRef<Expression>(),
            )

        assertThat(roundtrippedExpression).isEqualTo(expression)
    }

    @Test
    fun ofPeriodToMonths() {
        val periodToMonths =
            PeriodToMonths.builder()
                .operator(PeriodToMonths.Operator.PERIOD_TO_MONTHS)
                .addInput(
                    ConstantBoolean.builder()
                        .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                        .inputs(listOf())
                        .propertyName("propertyName")
                        .value(true)
                        .build()
                )
                .propertyName("propertyName")
                .value(0.0)
                .build()

        val expression = Expression.ofPeriodToMonths(periodToMonths)

        assertThat(expression.constantBoolean()).isEmpty
        assertThat(expression.constantNumber()).isEmpty
        assertThat(expression.constantString()).isEmpty
        assertThat(expression.booleanPropertyVariable()).isEmpty
        assertThat(expression.stringPropertyVariable()).isEmpty
        assertThat(expression.numberPropertyVariable()).isEmpty
        assertThat(expression.timestampOfPropertyVariable()).isEmpty
        assertThat(expression.booleanTargetPropertyVariable()).isEmpty
        assertThat(expression.stringTargetPropertyVariable()).isEmpty
        assertThat(expression.numberTargetPropertyVariable()).isEmpty
        assertThat(expression.timestampOfTargetPropertyVariable()).isEmpty
        assertThat(expression.addNumbers()).isEmpty
        assertThat(expression.subtractNumbers()).isEmpty
        assertThat(expression.multiplyNumbers()).isEmpty
        assertThat(expression.divideNumbers()).isEmpty
        assertThat(expression.roundDownNumbers()).isEmpty
        assertThat(expression.roundUpNumbers()).isEmpty
        assertThat(expression.roundNearestNumbers()).isEmpty
        assertThat(expression.upperCase()).isEmpty
        assertThat(expression.lowerCase()).isEmpty
        assertThat(expression.concatStrings()).isEmpty
        assertThat(expression.contains()).isEmpty
        assertThat(expression.beginsWith()).isEmpty
        assertThat(expression.numberToString()).isEmpty
        assertThat(expression.parseNumber()).isEmpty
        assertThat(expression.fetchExchangeRate()).isEmpty
        assertThat(expression.fetchCurrencyDecimalPlaces()).isEmpty
        assertThat(expression.fetchSingleCurrencyPortalCurrency()).isEmpty
        assertThat(expression.datedExchangeRate()).isEmpty
        assertThat(expression.pipelineProbability()).isEmpty
        assertThat(expression.maxNumbers()).isEmpty
        assertThat(expression.minNumbers()).isEmpty
        assertThat(expression.lessThan()).isEmpty
        assertThat(expression.lessThanOrEqual()).isEmpty
        assertThat(expression.moreThan()).isEmpty
        assertThat(expression.moreThanOrEqual()).isEmpty
        assertThat(expression.numberEquals()).isEmpty
        assertThat(expression.stringEquals()).isEmpty
        assertThat(expression.isPipelineStageClosed()).isEmpty
        assertThat(expression.not()).isEmpty
        assertThat(expression.date()).isEmpty
        assertThat(expression.month()).isEmpty
        assertThat(expression.year()).isEmpty
        assertThat(expression.now()).isEmpty
        assertThat(expression.timeBetween()).isEmpty
        assertThat(expression.periodToMonths()).contains(periodToMonths)
        assertThat(expression.periodToWeeks()).isEmpty
        assertThat(expression.and()).isEmpty
        assertThat(expression.or()).isEmpty
        assertThat(expression.xor()).isEmpty
        assertThat(expression.ifString()).isEmpty
        assertThat(expression.ifNumber()).isEmpty
        assertThat(expression.ifBoolean()).isEmpty
        assertThat(expression.isPresent()).isEmpty
        assertThat(expression.hasEmailReply()).isEmpty
        assertThat(expression.hasPlainTextEmailReply()).isEmpty
        assertThat(expression.extractMostRecentEmailReplyHtml()).isEmpty
        assertThat(expression.extractMostRecentEmailReplyText()).isEmpty
        assertThat(expression.extractMostRecentPlainTextEmailReply()).isEmpty
        assertThat(expression.setContainsString()).isEmpty
        assertThat(expression.isEngagementType()).isEmpty
        assertThat(expression.formatFullName()).isEmpty
        assertThat(expression.absoluteValue()).isEmpty
        assertThat(expression.squareRoot()).isEmpty
        assertThat(expression.power()).isEmpty
        assertThat(expression.substring()).isEmpty
        assertThat(expression.euler()).isEmpty
        assertThat(expression.stringLength()).isEmpty
        assertThat(expression.addTime()).isEmpty
        assertThat(expression.subtractTime()).isEmpty
    }

    @Test
    fun ofPeriodToMonthsRoundtrip() {
        val jsonMapper = jsonMapper()
        val expression =
            Expression.ofPeriodToMonths(
                PeriodToMonths.builder()
                    .operator(PeriodToMonths.Operator.PERIOD_TO_MONTHS)
                    .addInput(
                        ConstantBoolean.builder()
                            .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                            .inputs(listOf())
                            .propertyName("propertyName")
                            .value(true)
                            .build()
                    )
                    .propertyName("propertyName")
                    .value(0.0)
                    .build()
            )

        val roundtrippedExpression =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(expression),
                jacksonTypeRef<Expression>(),
            )

        assertThat(roundtrippedExpression).isEqualTo(expression)
    }

    @Test
    fun ofPeriodToWeeks() {
        val periodToWeeks =
            PeriodToWeeks.builder()
                .operator(PeriodToWeeks.Operator.PERIOD_TO_WEEKS)
                .addInput(
                    ConstantBoolean.builder()
                        .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                        .inputs(listOf())
                        .propertyName("propertyName")
                        .value(true)
                        .build()
                )
                .propertyName("propertyName")
                .value(0.0)
                .build()

        val expression = Expression.ofPeriodToWeeks(periodToWeeks)

        assertThat(expression.constantBoolean()).isEmpty
        assertThat(expression.constantNumber()).isEmpty
        assertThat(expression.constantString()).isEmpty
        assertThat(expression.booleanPropertyVariable()).isEmpty
        assertThat(expression.stringPropertyVariable()).isEmpty
        assertThat(expression.numberPropertyVariable()).isEmpty
        assertThat(expression.timestampOfPropertyVariable()).isEmpty
        assertThat(expression.booleanTargetPropertyVariable()).isEmpty
        assertThat(expression.stringTargetPropertyVariable()).isEmpty
        assertThat(expression.numberTargetPropertyVariable()).isEmpty
        assertThat(expression.timestampOfTargetPropertyVariable()).isEmpty
        assertThat(expression.addNumbers()).isEmpty
        assertThat(expression.subtractNumbers()).isEmpty
        assertThat(expression.multiplyNumbers()).isEmpty
        assertThat(expression.divideNumbers()).isEmpty
        assertThat(expression.roundDownNumbers()).isEmpty
        assertThat(expression.roundUpNumbers()).isEmpty
        assertThat(expression.roundNearestNumbers()).isEmpty
        assertThat(expression.upperCase()).isEmpty
        assertThat(expression.lowerCase()).isEmpty
        assertThat(expression.concatStrings()).isEmpty
        assertThat(expression.contains()).isEmpty
        assertThat(expression.beginsWith()).isEmpty
        assertThat(expression.numberToString()).isEmpty
        assertThat(expression.parseNumber()).isEmpty
        assertThat(expression.fetchExchangeRate()).isEmpty
        assertThat(expression.fetchCurrencyDecimalPlaces()).isEmpty
        assertThat(expression.fetchSingleCurrencyPortalCurrency()).isEmpty
        assertThat(expression.datedExchangeRate()).isEmpty
        assertThat(expression.pipelineProbability()).isEmpty
        assertThat(expression.maxNumbers()).isEmpty
        assertThat(expression.minNumbers()).isEmpty
        assertThat(expression.lessThan()).isEmpty
        assertThat(expression.lessThanOrEqual()).isEmpty
        assertThat(expression.moreThan()).isEmpty
        assertThat(expression.moreThanOrEqual()).isEmpty
        assertThat(expression.numberEquals()).isEmpty
        assertThat(expression.stringEquals()).isEmpty
        assertThat(expression.isPipelineStageClosed()).isEmpty
        assertThat(expression.not()).isEmpty
        assertThat(expression.date()).isEmpty
        assertThat(expression.month()).isEmpty
        assertThat(expression.year()).isEmpty
        assertThat(expression.now()).isEmpty
        assertThat(expression.timeBetween()).isEmpty
        assertThat(expression.periodToMonths()).isEmpty
        assertThat(expression.periodToWeeks()).contains(periodToWeeks)
        assertThat(expression.and()).isEmpty
        assertThat(expression.or()).isEmpty
        assertThat(expression.xor()).isEmpty
        assertThat(expression.ifString()).isEmpty
        assertThat(expression.ifNumber()).isEmpty
        assertThat(expression.ifBoolean()).isEmpty
        assertThat(expression.isPresent()).isEmpty
        assertThat(expression.hasEmailReply()).isEmpty
        assertThat(expression.hasPlainTextEmailReply()).isEmpty
        assertThat(expression.extractMostRecentEmailReplyHtml()).isEmpty
        assertThat(expression.extractMostRecentEmailReplyText()).isEmpty
        assertThat(expression.extractMostRecentPlainTextEmailReply()).isEmpty
        assertThat(expression.setContainsString()).isEmpty
        assertThat(expression.isEngagementType()).isEmpty
        assertThat(expression.formatFullName()).isEmpty
        assertThat(expression.absoluteValue()).isEmpty
        assertThat(expression.squareRoot()).isEmpty
        assertThat(expression.power()).isEmpty
        assertThat(expression.substring()).isEmpty
        assertThat(expression.euler()).isEmpty
        assertThat(expression.stringLength()).isEmpty
        assertThat(expression.addTime()).isEmpty
        assertThat(expression.subtractTime()).isEmpty
    }

    @Test
    fun ofPeriodToWeeksRoundtrip() {
        val jsonMapper = jsonMapper()
        val expression =
            Expression.ofPeriodToWeeks(
                PeriodToWeeks.builder()
                    .operator(PeriodToWeeks.Operator.PERIOD_TO_WEEKS)
                    .addInput(
                        ConstantBoolean.builder()
                            .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                            .inputs(listOf())
                            .propertyName("propertyName")
                            .value(true)
                            .build()
                    )
                    .propertyName("propertyName")
                    .value(0.0)
                    .build()
            )

        val roundtrippedExpression =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(expression),
                jacksonTypeRef<Expression>(),
            )

        assertThat(roundtrippedExpression).isEqualTo(expression)
    }

    @Test
    fun ofAnd() {
        val and =
            And.builder()
                .enclosedInParentheses(true)
                .operator(And.Operator.AND)
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

        val expression = Expression.ofAnd(and)

        assertThat(expression.constantBoolean()).isEmpty
        assertThat(expression.constantNumber()).isEmpty
        assertThat(expression.constantString()).isEmpty
        assertThat(expression.booleanPropertyVariable()).isEmpty
        assertThat(expression.stringPropertyVariable()).isEmpty
        assertThat(expression.numberPropertyVariable()).isEmpty
        assertThat(expression.timestampOfPropertyVariable()).isEmpty
        assertThat(expression.booleanTargetPropertyVariable()).isEmpty
        assertThat(expression.stringTargetPropertyVariable()).isEmpty
        assertThat(expression.numberTargetPropertyVariable()).isEmpty
        assertThat(expression.timestampOfTargetPropertyVariable()).isEmpty
        assertThat(expression.addNumbers()).isEmpty
        assertThat(expression.subtractNumbers()).isEmpty
        assertThat(expression.multiplyNumbers()).isEmpty
        assertThat(expression.divideNumbers()).isEmpty
        assertThat(expression.roundDownNumbers()).isEmpty
        assertThat(expression.roundUpNumbers()).isEmpty
        assertThat(expression.roundNearestNumbers()).isEmpty
        assertThat(expression.upperCase()).isEmpty
        assertThat(expression.lowerCase()).isEmpty
        assertThat(expression.concatStrings()).isEmpty
        assertThat(expression.contains()).isEmpty
        assertThat(expression.beginsWith()).isEmpty
        assertThat(expression.numberToString()).isEmpty
        assertThat(expression.parseNumber()).isEmpty
        assertThat(expression.fetchExchangeRate()).isEmpty
        assertThat(expression.fetchCurrencyDecimalPlaces()).isEmpty
        assertThat(expression.fetchSingleCurrencyPortalCurrency()).isEmpty
        assertThat(expression.datedExchangeRate()).isEmpty
        assertThat(expression.pipelineProbability()).isEmpty
        assertThat(expression.maxNumbers()).isEmpty
        assertThat(expression.minNumbers()).isEmpty
        assertThat(expression.lessThan()).isEmpty
        assertThat(expression.lessThanOrEqual()).isEmpty
        assertThat(expression.moreThan()).isEmpty
        assertThat(expression.moreThanOrEqual()).isEmpty
        assertThat(expression.numberEquals()).isEmpty
        assertThat(expression.stringEquals()).isEmpty
        assertThat(expression.isPipelineStageClosed()).isEmpty
        assertThat(expression.not()).isEmpty
        assertThat(expression.date()).isEmpty
        assertThat(expression.month()).isEmpty
        assertThat(expression.year()).isEmpty
        assertThat(expression.now()).isEmpty
        assertThat(expression.timeBetween()).isEmpty
        assertThat(expression.periodToMonths()).isEmpty
        assertThat(expression.periodToWeeks()).isEmpty
        assertThat(expression.and()).contains(and)
        assertThat(expression.or()).isEmpty
        assertThat(expression.xor()).isEmpty
        assertThat(expression.ifString()).isEmpty
        assertThat(expression.ifNumber()).isEmpty
        assertThat(expression.ifBoolean()).isEmpty
        assertThat(expression.isPresent()).isEmpty
        assertThat(expression.hasEmailReply()).isEmpty
        assertThat(expression.hasPlainTextEmailReply()).isEmpty
        assertThat(expression.extractMostRecentEmailReplyHtml()).isEmpty
        assertThat(expression.extractMostRecentEmailReplyText()).isEmpty
        assertThat(expression.extractMostRecentPlainTextEmailReply()).isEmpty
        assertThat(expression.setContainsString()).isEmpty
        assertThat(expression.isEngagementType()).isEmpty
        assertThat(expression.formatFullName()).isEmpty
        assertThat(expression.absoluteValue()).isEmpty
        assertThat(expression.squareRoot()).isEmpty
        assertThat(expression.power()).isEmpty
        assertThat(expression.substring()).isEmpty
        assertThat(expression.euler()).isEmpty
        assertThat(expression.stringLength()).isEmpty
        assertThat(expression.addTime()).isEmpty
        assertThat(expression.subtractTime()).isEmpty
    }

    @Test
    fun ofAndRoundtrip() {
        val jsonMapper = jsonMapper()
        val expression =
            Expression.ofAnd(
                And.builder()
                    .enclosedInParentheses(true)
                    .operator(And.Operator.AND)
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
            )

        val roundtrippedExpression =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(expression),
                jacksonTypeRef<Expression>(),
            )

        assertThat(roundtrippedExpression).isEqualTo(expression)
    }

    @Test
    fun ofOr() {
        val or =
            Or.builder()
                .enclosedInParentheses(true)
                .operator(Or.Operator.OR)
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

        val expression = Expression.ofOr(or)

        assertThat(expression.constantBoolean()).isEmpty
        assertThat(expression.constantNumber()).isEmpty
        assertThat(expression.constantString()).isEmpty
        assertThat(expression.booleanPropertyVariable()).isEmpty
        assertThat(expression.stringPropertyVariable()).isEmpty
        assertThat(expression.numberPropertyVariable()).isEmpty
        assertThat(expression.timestampOfPropertyVariable()).isEmpty
        assertThat(expression.booleanTargetPropertyVariable()).isEmpty
        assertThat(expression.stringTargetPropertyVariable()).isEmpty
        assertThat(expression.numberTargetPropertyVariable()).isEmpty
        assertThat(expression.timestampOfTargetPropertyVariable()).isEmpty
        assertThat(expression.addNumbers()).isEmpty
        assertThat(expression.subtractNumbers()).isEmpty
        assertThat(expression.multiplyNumbers()).isEmpty
        assertThat(expression.divideNumbers()).isEmpty
        assertThat(expression.roundDownNumbers()).isEmpty
        assertThat(expression.roundUpNumbers()).isEmpty
        assertThat(expression.roundNearestNumbers()).isEmpty
        assertThat(expression.upperCase()).isEmpty
        assertThat(expression.lowerCase()).isEmpty
        assertThat(expression.concatStrings()).isEmpty
        assertThat(expression.contains()).isEmpty
        assertThat(expression.beginsWith()).isEmpty
        assertThat(expression.numberToString()).isEmpty
        assertThat(expression.parseNumber()).isEmpty
        assertThat(expression.fetchExchangeRate()).isEmpty
        assertThat(expression.fetchCurrencyDecimalPlaces()).isEmpty
        assertThat(expression.fetchSingleCurrencyPortalCurrency()).isEmpty
        assertThat(expression.datedExchangeRate()).isEmpty
        assertThat(expression.pipelineProbability()).isEmpty
        assertThat(expression.maxNumbers()).isEmpty
        assertThat(expression.minNumbers()).isEmpty
        assertThat(expression.lessThan()).isEmpty
        assertThat(expression.lessThanOrEqual()).isEmpty
        assertThat(expression.moreThan()).isEmpty
        assertThat(expression.moreThanOrEqual()).isEmpty
        assertThat(expression.numberEquals()).isEmpty
        assertThat(expression.stringEquals()).isEmpty
        assertThat(expression.isPipelineStageClosed()).isEmpty
        assertThat(expression.not()).isEmpty
        assertThat(expression.date()).isEmpty
        assertThat(expression.month()).isEmpty
        assertThat(expression.year()).isEmpty
        assertThat(expression.now()).isEmpty
        assertThat(expression.timeBetween()).isEmpty
        assertThat(expression.periodToMonths()).isEmpty
        assertThat(expression.periodToWeeks()).isEmpty
        assertThat(expression.and()).isEmpty
        assertThat(expression.or()).contains(or)
        assertThat(expression.xor()).isEmpty
        assertThat(expression.ifString()).isEmpty
        assertThat(expression.ifNumber()).isEmpty
        assertThat(expression.ifBoolean()).isEmpty
        assertThat(expression.isPresent()).isEmpty
        assertThat(expression.hasEmailReply()).isEmpty
        assertThat(expression.hasPlainTextEmailReply()).isEmpty
        assertThat(expression.extractMostRecentEmailReplyHtml()).isEmpty
        assertThat(expression.extractMostRecentEmailReplyText()).isEmpty
        assertThat(expression.extractMostRecentPlainTextEmailReply()).isEmpty
        assertThat(expression.setContainsString()).isEmpty
        assertThat(expression.isEngagementType()).isEmpty
        assertThat(expression.formatFullName()).isEmpty
        assertThat(expression.absoluteValue()).isEmpty
        assertThat(expression.squareRoot()).isEmpty
        assertThat(expression.power()).isEmpty
        assertThat(expression.substring()).isEmpty
        assertThat(expression.euler()).isEmpty
        assertThat(expression.stringLength()).isEmpty
        assertThat(expression.addTime()).isEmpty
        assertThat(expression.subtractTime()).isEmpty
    }

    @Test
    fun ofOrRoundtrip() {
        val jsonMapper = jsonMapper()
        val expression =
            Expression.ofOr(
                Or.builder()
                    .enclosedInParentheses(true)
                    .operator(Or.Operator.OR)
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
            )

        val roundtrippedExpression =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(expression),
                jacksonTypeRef<Expression>(),
            )

        assertThat(roundtrippedExpression).isEqualTo(expression)
    }

    @Test
    fun ofXor() {
        val xor =
            Xor.builder()
                .enclosedInParentheses(true)
                .operator(Xor.Operator.XOR)
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

        val expression = Expression.ofXor(xor)

        assertThat(expression.constantBoolean()).isEmpty
        assertThat(expression.constantNumber()).isEmpty
        assertThat(expression.constantString()).isEmpty
        assertThat(expression.booleanPropertyVariable()).isEmpty
        assertThat(expression.stringPropertyVariable()).isEmpty
        assertThat(expression.numberPropertyVariable()).isEmpty
        assertThat(expression.timestampOfPropertyVariable()).isEmpty
        assertThat(expression.booleanTargetPropertyVariable()).isEmpty
        assertThat(expression.stringTargetPropertyVariable()).isEmpty
        assertThat(expression.numberTargetPropertyVariable()).isEmpty
        assertThat(expression.timestampOfTargetPropertyVariable()).isEmpty
        assertThat(expression.addNumbers()).isEmpty
        assertThat(expression.subtractNumbers()).isEmpty
        assertThat(expression.multiplyNumbers()).isEmpty
        assertThat(expression.divideNumbers()).isEmpty
        assertThat(expression.roundDownNumbers()).isEmpty
        assertThat(expression.roundUpNumbers()).isEmpty
        assertThat(expression.roundNearestNumbers()).isEmpty
        assertThat(expression.upperCase()).isEmpty
        assertThat(expression.lowerCase()).isEmpty
        assertThat(expression.concatStrings()).isEmpty
        assertThat(expression.contains()).isEmpty
        assertThat(expression.beginsWith()).isEmpty
        assertThat(expression.numberToString()).isEmpty
        assertThat(expression.parseNumber()).isEmpty
        assertThat(expression.fetchExchangeRate()).isEmpty
        assertThat(expression.fetchCurrencyDecimalPlaces()).isEmpty
        assertThat(expression.fetchSingleCurrencyPortalCurrency()).isEmpty
        assertThat(expression.datedExchangeRate()).isEmpty
        assertThat(expression.pipelineProbability()).isEmpty
        assertThat(expression.maxNumbers()).isEmpty
        assertThat(expression.minNumbers()).isEmpty
        assertThat(expression.lessThan()).isEmpty
        assertThat(expression.lessThanOrEqual()).isEmpty
        assertThat(expression.moreThan()).isEmpty
        assertThat(expression.moreThanOrEqual()).isEmpty
        assertThat(expression.numberEquals()).isEmpty
        assertThat(expression.stringEquals()).isEmpty
        assertThat(expression.isPipelineStageClosed()).isEmpty
        assertThat(expression.not()).isEmpty
        assertThat(expression.date()).isEmpty
        assertThat(expression.month()).isEmpty
        assertThat(expression.year()).isEmpty
        assertThat(expression.now()).isEmpty
        assertThat(expression.timeBetween()).isEmpty
        assertThat(expression.periodToMonths()).isEmpty
        assertThat(expression.periodToWeeks()).isEmpty
        assertThat(expression.and()).isEmpty
        assertThat(expression.or()).isEmpty
        assertThat(expression.xor()).contains(xor)
        assertThat(expression.ifString()).isEmpty
        assertThat(expression.ifNumber()).isEmpty
        assertThat(expression.ifBoolean()).isEmpty
        assertThat(expression.isPresent()).isEmpty
        assertThat(expression.hasEmailReply()).isEmpty
        assertThat(expression.hasPlainTextEmailReply()).isEmpty
        assertThat(expression.extractMostRecentEmailReplyHtml()).isEmpty
        assertThat(expression.extractMostRecentEmailReplyText()).isEmpty
        assertThat(expression.extractMostRecentPlainTextEmailReply()).isEmpty
        assertThat(expression.setContainsString()).isEmpty
        assertThat(expression.isEngagementType()).isEmpty
        assertThat(expression.formatFullName()).isEmpty
        assertThat(expression.absoluteValue()).isEmpty
        assertThat(expression.squareRoot()).isEmpty
        assertThat(expression.power()).isEmpty
        assertThat(expression.substring()).isEmpty
        assertThat(expression.euler()).isEmpty
        assertThat(expression.stringLength()).isEmpty
        assertThat(expression.addTime()).isEmpty
        assertThat(expression.subtractTime()).isEmpty
    }

    @Test
    fun ofXorRoundtrip() {
        val jsonMapper = jsonMapper()
        val expression =
            Expression.ofXor(
                Xor.builder()
                    .enclosedInParentheses(true)
                    .operator(Xor.Operator.XOR)
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
            )

        val roundtrippedExpression =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(expression),
                jacksonTypeRef<Expression>(),
            )

        assertThat(roundtrippedExpression).isEqualTo(expression)
    }

    @Test
    fun ofIfString() {
        val ifString =
            IfString.builder()
                .enclosedInParentheses(true)
                .ifExpression(
                    ConstantBoolean.builder()
                        .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                        .inputs(listOf())
                        .propertyName("propertyName")
                        .value(true)
                        .build()
                )
                .operator(IfString.Operator.IF_STRING)
                .elseExpression(
                    ConstantNumber.builder()
                        .operator(ConstantNumber.Operator.CONSTANT_NUMBER)
                        .inputs(listOf())
                        .propertyName("propertyName")
                        .value(0.0)
                        .build()
                )
                .inputs(listOf())
                .propertyName("propertyName")
                .value("value")
                .build()

        val expression = Expression.ofIfString(ifString)

        assertThat(expression.constantBoolean()).isEmpty
        assertThat(expression.constantNumber()).isEmpty
        assertThat(expression.constantString()).isEmpty
        assertThat(expression.booleanPropertyVariable()).isEmpty
        assertThat(expression.stringPropertyVariable()).isEmpty
        assertThat(expression.numberPropertyVariable()).isEmpty
        assertThat(expression.timestampOfPropertyVariable()).isEmpty
        assertThat(expression.booleanTargetPropertyVariable()).isEmpty
        assertThat(expression.stringTargetPropertyVariable()).isEmpty
        assertThat(expression.numberTargetPropertyVariable()).isEmpty
        assertThat(expression.timestampOfTargetPropertyVariable()).isEmpty
        assertThat(expression.addNumbers()).isEmpty
        assertThat(expression.subtractNumbers()).isEmpty
        assertThat(expression.multiplyNumbers()).isEmpty
        assertThat(expression.divideNumbers()).isEmpty
        assertThat(expression.roundDownNumbers()).isEmpty
        assertThat(expression.roundUpNumbers()).isEmpty
        assertThat(expression.roundNearestNumbers()).isEmpty
        assertThat(expression.upperCase()).isEmpty
        assertThat(expression.lowerCase()).isEmpty
        assertThat(expression.concatStrings()).isEmpty
        assertThat(expression.contains()).isEmpty
        assertThat(expression.beginsWith()).isEmpty
        assertThat(expression.numberToString()).isEmpty
        assertThat(expression.parseNumber()).isEmpty
        assertThat(expression.fetchExchangeRate()).isEmpty
        assertThat(expression.fetchCurrencyDecimalPlaces()).isEmpty
        assertThat(expression.fetchSingleCurrencyPortalCurrency()).isEmpty
        assertThat(expression.datedExchangeRate()).isEmpty
        assertThat(expression.pipelineProbability()).isEmpty
        assertThat(expression.maxNumbers()).isEmpty
        assertThat(expression.minNumbers()).isEmpty
        assertThat(expression.lessThan()).isEmpty
        assertThat(expression.lessThanOrEqual()).isEmpty
        assertThat(expression.moreThan()).isEmpty
        assertThat(expression.moreThanOrEqual()).isEmpty
        assertThat(expression.numberEquals()).isEmpty
        assertThat(expression.stringEquals()).isEmpty
        assertThat(expression.isPipelineStageClosed()).isEmpty
        assertThat(expression.not()).isEmpty
        assertThat(expression.date()).isEmpty
        assertThat(expression.month()).isEmpty
        assertThat(expression.year()).isEmpty
        assertThat(expression.now()).isEmpty
        assertThat(expression.timeBetween()).isEmpty
        assertThat(expression.periodToMonths()).isEmpty
        assertThat(expression.periodToWeeks()).isEmpty
        assertThat(expression.and()).isEmpty
        assertThat(expression.or()).isEmpty
        assertThat(expression.xor()).isEmpty
        assertThat(expression.ifString()).contains(ifString)
        assertThat(expression.ifNumber()).isEmpty
        assertThat(expression.ifBoolean()).isEmpty
        assertThat(expression.isPresent()).isEmpty
        assertThat(expression.hasEmailReply()).isEmpty
        assertThat(expression.hasPlainTextEmailReply()).isEmpty
        assertThat(expression.extractMostRecentEmailReplyHtml()).isEmpty
        assertThat(expression.extractMostRecentEmailReplyText()).isEmpty
        assertThat(expression.extractMostRecentPlainTextEmailReply()).isEmpty
        assertThat(expression.setContainsString()).isEmpty
        assertThat(expression.isEngagementType()).isEmpty
        assertThat(expression.formatFullName()).isEmpty
        assertThat(expression.absoluteValue()).isEmpty
        assertThat(expression.squareRoot()).isEmpty
        assertThat(expression.power()).isEmpty
        assertThat(expression.substring()).isEmpty
        assertThat(expression.euler()).isEmpty
        assertThat(expression.stringLength()).isEmpty
        assertThat(expression.addTime()).isEmpty
        assertThat(expression.subtractTime()).isEmpty
    }

    @Test
    fun ofIfStringRoundtrip() {
        val jsonMapper = jsonMapper()
        val expression =
            Expression.ofIfString(
                IfString.builder()
                    .enclosedInParentheses(true)
                    .ifExpression(
                        ConstantBoolean.builder()
                            .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                            .inputs(listOf())
                            .propertyName("propertyName")
                            .value(true)
                            .build()
                    )
                    .operator(IfString.Operator.IF_STRING)
                    .elseExpression(
                        ConstantNumber.builder()
                            .operator(ConstantNumber.Operator.CONSTANT_NUMBER)
                            .inputs(listOf())
                            .propertyName("propertyName")
                            .value(0.0)
                            .build()
                    )
                    .inputs(listOf())
                    .propertyName("propertyName")
                    .value("value")
                    .build()
            )

        val roundtrippedExpression =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(expression),
                jacksonTypeRef<Expression>(),
            )

        assertThat(roundtrippedExpression).isEqualTo(expression)
    }

    @Test
    fun ofIfNumber() {
        val ifNumber =
            IfNumber.builder()
                .enclosedInParentheses(true)
                .ifExpression(
                    ConstantBoolean.builder()
                        .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                        .inputs(listOf())
                        .propertyName("propertyName")
                        .value(true)
                        .build()
                )
                .operator(IfNumber.Operator.IF_NUMBER)
                .elseExpression(
                    ConstantNumber.builder()
                        .operator(ConstantNumber.Operator.CONSTANT_NUMBER)
                        .inputs(listOf())
                        .propertyName("propertyName")
                        .value(0.0)
                        .build()
                )
                .inputs(listOf())
                .propertyName("propertyName")
                .value(0.0)
                .build()

        val expression = Expression.ofIfNumber(ifNumber)

        assertThat(expression.constantBoolean()).isEmpty
        assertThat(expression.constantNumber()).isEmpty
        assertThat(expression.constantString()).isEmpty
        assertThat(expression.booleanPropertyVariable()).isEmpty
        assertThat(expression.stringPropertyVariable()).isEmpty
        assertThat(expression.numberPropertyVariable()).isEmpty
        assertThat(expression.timestampOfPropertyVariable()).isEmpty
        assertThat(expression.booleanTargetPropertyVariable()).isEmpty
        assertThat(expression.stringTargetPropertyVariable()).isEmpty
        assertThat(expression.numberTargetPropertyVariable()).isEmpty
        assertThat(expression.timestampOfTargetPropertyVariable()).isEmpty
        assertThat(expression.addNumbers()).isEmpty
        assertThat(expression.subtractNumbers()).isEmpty
        assertThat(expression.multiplyNumbers()).isEmpty
        assertThat(expression.divideNumbers()).isEmpty
        assertThat(expression.roundDownNumbers()).isEmpty
        assertThat(expression.roundUpNumbers()).isEmpty
        assertThat(expression.roundNearestNumbers()).isEmpty
        assertThat(expression.upperCase()).isEmpty
        assertThat(expression.lowerCase()).isEmpty
        assertThat(expression.concatStrings()).isEmpty
        assertThat(expression.contains()).isEmpty
        assertThat(expression.beginsWith()).isEmpty
        assertThat(expression.numberToString()).isEmpty
        assertThat(expression.parseNumber()).isEmpty
        assertThat(expression.fetchExchangeRate()).isEmpty
        assertThat(expression.fetchCurrencyDecimalPlaces()).isEmpty
        assertThat(expression.fetchSingleCurrencyPortalCurrency()).isEmpty
        assertThat(expression.datedExchangeRate()).isEmpty
        assertThat(expression.pipelineProbability()).isEmpty
        assertThat(expression.maxNumbers()).isEmpty
        assertThat(expression.minNumbers()).isEmpty
        assertThat(expression.lessThan()).isEmpty
        assertThat(expression.lessThanOrEqual()).isEmpty
        assertThat(expression.moreThan()).isEmpty
        assertThat(expression.moreThanOrEqual()).isEmpty
        assertThat(expression.numberEquals()).isEmpty
        assertThat(expression.stringEquals()).isEmpty
        assertThat(expression.isPipelineStageClosed()).isEmpty
        assertThat(expression.not()).isEmpty
        assertThat(expression.date()).isEmpty
        assertThat(expression.month()).isEmpty
        assertThat(expression.year()).isEmpty
        assertThat(expression.now()).isEmpty
        assertThat(expression.timeBetween()).isEmpty
        assertThat(expression.periodToMonths()).isEmpty
        assertThat(expression.periodToWeeks()).isEmpty
        assertThat(expression.and()).isEmpty
        assertThat(expression.or()).isEmpty
        assertThat(expression.xor()).isEmpty
        assertThat(expression.ifString()).isEmpty
        assertThat(expression.ifNumber()).contains(ifNumber)
        assertThat(expression.ifBoolean()).isEmpty
        assertThat(expression.isPresent()).isEmpty
        assertThat(expression.hasEmailReply()).isEmpty
        assertThat(expression.hasPlainTextEmailReply()).isEmpty
        assertThat(expression.extractMostRecentEmailReplyHtml()).isEmpty
        assertThat(expression.extractMostRecentEmailReplyText()).isEmpty
        assertThat(expression.extractMostRecentPlainTextEmailReply()).isEmpty
        assertThat(expression.setContainsString()).isEmpty
        assertThat(expression.isEngagementType()).isEmpty
        assertThat(expression.formatFullName()).isEmpty
        assertThat(expression.absoluteValue()).isEmpty
        assertThat(expression.squareRoot()).isEmpty
        assertThat(expression.power()).isEmpty
        assertThat(expression.substring()).isEmpty
        assertThat(expression.euler()).isEmpty
        assertThat(expression.stringLength()).isEmpty
        assertThat(expression.addTime()).isEmpty
        assertThat(expression.subtractTime()).isEmpty
    }

    @Test
    fun ofIfNumberRoundtrip() {
        val jsonMapper = jsonMapper()
        val expression =
            Expression.ofIfNumber(
                IfNumber.builder()
                    .enclosedInParentheses(true)
                    .ifExpression(
                        ConstantBoolean.builder()
                            .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                            .inputs(listOf())
                            .propertyName("propertyName")
                            .value(true)
                            .build()
                    )
                    .operator(IfNumber.Operator.IF_NUMBER)
                    .elseExpression(
                        ConstantNumber.builder()
                            .operator(ConstantNumber.Operator.CONSTANT_NUMBER)
                            .inputs(listOf())
                            .propertyName("propertyName")
                            .value(0.0)
                            .build()
                    )
                    .inputs(listOf())
                    .propertyName("propertyName")
                    .value(0.0)
                    .build()
            )

        val roundtrippedExpression =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(expression),
                jacksonTypeRef<Expression>(),
            )

        assertThat(roundtrippedExpression).isEqualTo(expression)
    }

    @Test
    fun ofIfBoolean() {
        val ifBoolean =
            IfBoolean.builder()
                .enclosedInParentheses(true)
                .ifExpression(
                    ConstantBoolean.builder()
                        .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                        .inputs(listOf())
                        .propertyName("propertyName")
                        .value(true)
                        .build()
                )
                .operator(IfBoolean.Operator.IF_BOOLEAN)
                .elseExpression(
                    ConstantNumber.builder()
                        .operator(ConstantNumber.Operator.CONSTANT_NUMBER)
                        .inputs(listOf())
                        .propertyName("propertyName")
                        .value(0.0)
                        .build()
                )
                .inputs(listOf())
                .propertyName("propertyName")
                .value(true)
                .build()

        val expression = Expression.ofIfBoolean(ifBoolean)

        assertThat(expression.constantBoolean()).isEmpty
        assertThat(expression.constantNumber()).isEmpty
        assertThat(expression.constantString()).isEmpty
        assertThat(expression.booleanPropertyVariable()).isEmpty
        assertThat(expression.stringPropertyVariable()).isEmpty
        assertThat(expression.numberPropertyVariable()).isEmpty
        assertThat(expression.timestampOfPropertyVariable()).isEmpty
        assertThat(expression.booleanTargetPropertyVariable()).isEmpty
        assertThat(expression.stringTargetPropertyVariable()).isEmpty
        assertThat(expression.numberTargetPropertyVariable()).isEmpty
        assertThat(expression.timestampOfTargetPropertyVariable()).isEmpty
        assertThat(expression.addNumbers()).isEmpty
        assertThat(expression.subtractNumbers()).isEmpty
        assertThat(expression.multiplyNumbers()).isEmpty
        assertThat(expression.divideNumbers()).isEmpty
        assertThat(expression.roundDownNumbers()).isEmpty
        assertThat(expression.roundUpNumbers()).isEmpty
        assertThat(expression.roundNearestNumbers()).isEmpty
        assertThat(expression.upperCase()).isEmpty
        assertThat(expression.lowerCase()).isEmpty
        assertThat(expression.concatStrings()).isEmpty
        assertThat(expression.contains()).isEmpty
        assertThat(expression.beginsWith()).isEmpty
        assertThat(expression.numberToString()).isEmpty
        assertThat(expression.parseNumber()).isEmpty
        assertThat(expression.fetchExchangeRate()).isEmpty
        assertThat(expression.fetchCurrencyDecimalPlaces()).isEmpty
        assertThat(expression.fetchSingleCurrencyPortalCurrency()).isEmpty
        assertThat(expression.datedExchangeRate()).isEmpty
        assertThat(expression.pipelineProbability()).isEmpty
        assertThat(expression.maxNumbers()).isEmpty
        assertThat(expression.minNumbers()).isEmpty
        assertThat(expression.lessThan()).isEmpty
        assertThat(expression.lessThanOrEqual()).isEmpty
        assertThat(expression.moreThan()).isEmpty
        assertThat(expression.moreThanOrEqual()).isEmpty
        assertThat(expression.numberEquals()).isEmpty
        assertThat(expression.stringEquals()).isEmpty
        assertThat(expression.isPipelineStageClosed()).isEmpty
        assertThat(expression.not()).isEmpty
        assertThat(expression.date()).isEmpty
        assertThat(expression.month()).isEmpty
        assertThat(expression.year()).isEmpty
        assertThat(expression.now()).isEmpty
        assertThat(expression.timeBetween()).isEmpty
        assertThat(expression.periodToMonths()).isEmpty
        assertThat(expression.periodToWeeks()).isEmpty
        assertThat(expression.and()).isEmpty
        assertThat(expression.or()).isEmpty
        assertThat(expression.xor()).isEmpty
        assertThat(expression.ifString()).isEmpty
        assertThat(expression.ifNumber()).isEmpty
        assertThat(expression.ifBoolean()).contains(ifBoolean)
        assertThat(expression.isPresent()).isEmpty
        assertThat(expression.hasEmailReply()).isEmpty
        assertThat(expression.hasPlainTextEmailReply()).isEmpty
        assertThat(expression.extractMostRecentEmailReplyHtml()).isEmpty
        assertThat(expression.extractMostRecentEmailReplyText()).isEmpty
        assertThat(expression.extractMostRecentPlainTextEmailReply()).isEmpty
        assertThat(expression.setContainsString()).isEmpty
        assertThat(expression.isEngagementType()).isEmpty
        assertThat(expression.formatFullName()).isEmpty
        assertThat(expression.absoluteValue()).isEmpty
        assertThat(expression.squareRoot()).isEmpty
        assertThat(expression.power()).isEmpty
        assertThat(expression.substring()).isEmpty
        assertThat(expression.euler()).isEmpty
        assertThat(expression.stringLength()).isEmpty
        assertThat(expression.addTime()).isEmpty
        assertThat(expression.subtractTime()).isEmpty
    }

    @Test
    fun ofIfBooleanRoundtrip() {
        val jsonMapper = jsonMapper()
        val expression =
            Expression.ofIfBoolean(
                IfBoolean.builder()
                    .enclosedInParentheses(true)
                    .ifExpression(
                        ConstantBoolean.builder()
                            .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                            .inputs(listOf())
                            .propertyName("propertyName")
                            .value(true)
                            .build()
                    )
                    .operator(IfBoolean.Operator.IF_BOOLEAN)
                    .elseExpression(
                        ConstantNumber.builder()
                            .operator(ConstantNumber.Operator.CONSTANT_NUMBER)
                            .inputs(listOf())
                            .propertyName("propertyName")
                            .value(0.0)
                            .build()
                    )
                    .inputs(listOf())
                    .propertyName("propertyName")
                    .value(true)
                    .build()
            )

        val roundtrippedExpression =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(expression),
                jacksonTypeRef<Expression>(),
            )

        assertThat(roundtrippedExpression).isEqualTo(expression)
    }

    @Test
    fun ofIsPresent() {
        val isPresent =
            IsPresent.builder()
                .expressionToEvaluate(
                    ConstantBoolean.builder()
                        .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                        .inputs(listOf())
                        .propertyName("propertyName")
                        .value(true)
                        .build()
                )
                .operator(IsPresent.Operator.IS_PRESENT)
                .inputs(listOf())
                .propertyName("propertyName")
                .value(true)
                .build()

        val expression = Expression.ofIsPresent(isPresent)

        assertThat(expression.constantBoolean()).isEmpty
        assertThat(expression.constantNumber()).isEmpty
        assertThat(expression.constantString()).isEmpty
        assertThat(expression.booleanPropertyVariable()).isEmpty
        assertThat(expression.stringPropertyVariable()).isEmpty
        assertThat(expression.numberPropertyVariable()).isEmpty
        assertThat(expression.timestampOfPropertyVariable()).isEmpty
        assertThat(expression.booleanTargetPropertyVariable()).isEmpty
        assertThat(expression.stringTargetPropertyVariable()).isEmpty
        assertThat(expression.numberTargetPropertyVariable()).isEmpty
        assertThat(expression.timestampOfTargetPropertyVariable()).isEmpty
        assertThat(expression.addNumbers()).isEmpty
        assertThat(expression.subtractNumbers()).isEmpty
        assertThat(expression.multiplyNumbers()).isEmpty
        assertThat(expression.divideNumbers()).isEmpty
        assertThat(expression.roundDownNumbers()).isEmpty
        assertThat(expression.roundUpNumbers()).isEmpty
        assertThat(expression.roundNearestNumbers()).isEmpty
        assertThat(expression.upperCase()).isEmpty
        assertThat(expression.lowerCase()).isEmpty
        assertThat(expression.concatStrings()).isEmpty
        assertThat(expression.contains()).isEmpty
        assertThat(expression.beginsWith()).isEmpty
        assertThat(expression.numberToString()).isEmpty
        assertThat(expression.parseNumber()).isEmpty
        assertThat(expression.fetchExchangeRate()).isEmpty
        assertThat(expression.fetchCurrencyDecimalPlaces()).isEmpty
        assertThat(expression.fetchSingleCurrencyPortalCurrency()).isEmpty
        assertThat(expression.datedExchangeRate()).isEmpty
        assertThat(expression.pipelineProbability()).isEmpty
        assertThat(expression.maxNumbers()).isEmpty
        assertThat(expression.minNumbers()).isEmpty
        assertThat(expression.lessThan()).isEmpty
        assertThat(expression.lessThanOrEqual()).isEmpty
        assertThat(expression.moreThan()).isEmpty
        assertThat(expression.moreThanOrEqual()).isEmpty
        assertThat(expression.numberEquals()).isEmpty
        assertThat(expression.stringEquals()).isEmpty
        assertThat(expression.isPipelineStageClosed()).isEmpty
        assertThat(expression.not()).isEmpty
        assertThat(expression.date()).isEmpty
        assertThat(expression.month()).isEmpty
        assertThat(expression.year()).isEmpty
        assertThat(expression.now()).isEmpty
        assertThat(expression.timeBetween()).isEmpty
        assertThat(expression.periodToMonths()).isEmpty
        assertThat(expression.periodToWeeks()).isEmpty
        assertThat(expression.and()).isEmpty
        assertThat(expression.or()).isEmpty
        assertThat(expression.xor()).isEmpty
        assertThat(expression.ifString()).isEmpty
        assertThat(expression.ifNumber()).isEmpty
        assertThat(expression.ifBoolean()).isEmpty
        assertThat(expression.isPresent()).contains(isPresent)
        assertThat(expression.hasEmailReply()).isEmpty
        assertThat(expression.hasPlainTextEmailReply()).isEmpty
        assertThat(expression.extractMostRecentEmailReplyHtml()).isEmpty
        assertThat(expression.extractMostRecentEmailReplyText()).isEmpty
        assertThat(expression.extractMostRecentPlainTextEmailReply()).isEmpty
        assertThat(expression.setContainsString()).isEmpty
        assertThat(expression.isEngagementType()).isEmpty
        assertThat(expression.formatFullName()).isEmpty
        assertThat(expression.absoluteValue()).isEmpty
        assertThat(expression.squareRoot()).isEmpty
        assertThat(expression.power()).isEmpty
        assertThat(expression.substring()).isEmpty
        assertThat(expression.euler()).isEmpty
        assertThat(expression.stringLength()).isEmpty
        assertThat(expression.addTime()).isEmpty
        assertThat(expression.subtractTime()).isEmpty
    }

    @Test
    fun ofIsPresentRoundtrip() {
        val jsonMapper = jsonMapper()
        val expression =
            Expression.ofIsPresent(
                IsPresent.builder()
                    .expressionToEvaluate(
                        ConstantBoolean.builder()
                            .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                            .inputs(listOf())
                            .propertyName("propertyName")
                            .value(true)
                            .build()
                    )
                    .operator(IsPresent.Operator.IS_PRESENT)
                    .inputs(listOf())
                    .propertyName("propertyName")
                    .value(true)
                    .build()
            )

        val roundtrippedExpression =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(expression),
                jacksonTypeRef<Expression>(),
            )

        assertThat(roundtrippedExpression).isEqualTo(expression)
    }

    @Test
    fun ofHasEmailReply() {
        val hasEmailReply =
            HasEmailReply.builder()
                .operator(HasEmailReply.Operator.HAS_EMAIL_REPLY)
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

        val expression = Expression.ofHasEmailReply(hasEmailReply)

        assertThat(expression.constantBoolean()).isEmpty
        assertThat(expression.constantNumber()).isEmpty
        assertThat(expression.constantString()).isEmpty
        assertThat(expression.booleanPropertyVariable()).isEmpty
        assertThat(expression.stringPropertyVariable()).isEmpty
        assertThat(expression.numberPropertyVariable()).isEmpty
        assertThat(expression.timestampOfPropertyVariable()).isEmpty
        assertThat(expression.booleanTargetPropertyVariable()).isEmpty
        assertThat(expression.stringTargetPropertyVariable()).isEmpty
        assertThat(expression.numberTargetPropertyVariable()).isEmpty
        assertThat(expression.timestampOfTargetPropertyVariable()).isEmpty
        assertThat(expression.addNumbers()).isEmpty
        assertThat(expression.subtractNumbers()).isEmpty
        assertThat(expression.multiplyNumbers()).isEmpty
        assertThat(expression.divideNumbers()).isEmpty
        assertThat(expression.roundDownNumbers()).isEmpty
        assertThat(expression.roundUpNumbers()).isEmpty
        assertThat(expression.roundNearestNumbers()).isEmpty
        assertThat(expression.upperCase()).isEmpty
        assertThat(expression.lowerCase()).isEmpty
        assertThat(expression.concatStrings()).isEmpty
        assertThat(expression.contains()).isEmpty
        assertThat(expression.beginsWith()).isEmpty
        assertThat(expression.numberToString()).isEmpty
        assertThat(expression.parseNumber()).isEmpty
        assertThat(expression.fetchExchangeRate()).isEmpty
        assertThat(expression.fetchCurrencyDecimalPlaces()).isEmpty
        assertThat(expression.fetchSingleCurrencyPortalCurrency()).isEmpty
        assertThat(expression.datedExchangeRate()).isEmpty
        assertThat(expression.pipelineProbability()).isEmpty
        assertThat(expression.maxNumbers()).isEmpty
        assertThat(expression.minNumbers()).isEmpty
        assertThat(expression.lessThan()).isEmpty
        assertThat(expression.lessThanOrEqual()).isEmpty
        assertThat(expression.moreThan()).isEmpty
        assertThat(expression.moreThanOrEqual()).isEmpty
        assertThat(expression.numberEquals()).isEmpty
        assertThat(expression.stringEquals()).isEmpty
        assertThat(expression.isPipelineStageClosed()).isEmpty
        assertThat(expression.not()).isEmpty
        assertThat(expression.date()).isEmpty
        assertThat(expression.month()).isEmpty
        assertThat(expression.year()).isEmpty
        assertThat(expression.now()).isEmpty
        assertThat(expression.timeBetween()).isEmpty
        assertThat(expression.periodToMonths()).isEmpty
        assertThat(expression.periodToWeeks()).isEmpty
        assertThat(expression.and()).isEmpty
        assertThat(expression.or()).isEmpty
        assertThat(expression.xor()).isEmpty
        assertThat(expression.ifString()).isEmpty
        assertThat(expression.ifNumber()).isEmpty
        assertThat(expression.ifBoolean()).isEmpty
        assertThat(expression.isPresent()).isEmpty
        assertThat(expression.hasEmailReply()).contains(hasEmailReply)
        assertThat(expression.hasPlainTextEmailReply()).isEmpty
        assertThat(expression.extractMostRecentEmailReplyHtml()).isEmpty
        assertThat(expression.extractMostRecentEmailReplyText()).isEmpty
        assertThat(expression.extractMostRecentPlainTextEmailReply()).isEmpty
        assertThat(expression.setContainsString()).isEmpty
        assertThat(expression.isEngagementType()).isEmpty
        assertThat(expression.formatFullName()).isEmpty
        assertThat(expression.absoluteValue()).isEmpty
        assertThat(expression.squareRoot()).isEmpty
        assertThat(expression.power()).isEmpty
        assertThat(expression.substring()).isEmpty
        assertThat(expression.euler()).isEmpty
        assertThat(expression.stringLength()).isEmpty
        assertThat(expression.addTime()).isEmpty
        assertThat(expression.subtractTime()).isEmpty
    }

    @Test
    fun ofHasEmailReplyRoundtrip() {
        val jsonMapper = jsonMapper()
        val expression =
            Expression.ofHasEmailReply(
                HasEmailReply.builder()
                    .operator(HasEmailReply.Operator.HAS_EMAIL_REPLY)
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
            )

        val roundtrippedExpression =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(expression),
                jacksonTypeRef<Expression>(),
            )

        assertThat(roundtrippedExpression).isEqualTo(expression)
    }

    @Test
    fun ofHasPlainTextEmailReply() {
        val hasPlainTextEmailReply =
            HasPlainTextEmailReply.builder()
                .operator(HasPlainTextEmailReply.Operator.HAS_PLAIN_TEXT_EMAIL_REPLY)
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

        val expression = Expression.ofHasPlainTextEmailReply(hasPlainTextEmailReply)

        assertThat(expression.constantBoolean()).isEmpty
        assertThat(expression.constantNumber()).isEmpty
        assertThat(expression.constantString()).isEmpty
        assertThat(expression.booleanPropertyVariable()).isEmpty
        assertThat(expression.stringPropertyVariable()).isEmpty
        assertThat(expression.numberPropertyVariable()).isEmpty
        assertThat(expression.timestampOfPropertyVariable()).isEmpty
        assertThat(expression.booleanTargetPropertyVariable()).isEmpty
        assertThat(expression.stringTargetPropertyVariable()).isEmpty
        assertThat(expression.numberTargetPropertyVariable()).isEmpty
        assertThat(expression.timestampOfTargetPropertyVariable()).isEmpty
        assertThat(expression.addNumbers()).isEmpty
        assertThat(expression.subtractNumbers()).isEmpty
        assertThat(expression.multiplyNumbers()).isEmpty
        assertThat(expression.divideNumbers()).isEmpty
        assertThat(expression.roundDownNumbers()).isEmpty
        assertThat(expression.roundUpNumbers()).isEmpty
        assertThat(expression.roundNearestNumbers()).isEmpty
        assertThat(expression.upperCase()).isEmpty
        assertThat(expression.lowerCase()).isEmpty
        assertThat(expression.concatStrings()).isEmpty
        assertThat(expression.contains()).isEmpty
        assertThat(expression.beginsWith()).isEmpty
        assertThat(expression.numberToString()).isEmpty
        assertThat(expression.parseNumber()).isEmpty
        assertThat(expression.fetchExchangeRate()).isEmpty
        assertThat(expression.fetchCurrencyDecimalPlaces()).isEmpty
        assertThat(expression.fetchSingleCurrencyPortalCurrency()).isEmpty
        assertThat(expression.datedExchangeRate()).isEmpty
        assertThat(expression.pipelineProbability()).isEmpty
        assertThat(expression.maxNumbers()).isEmpty
        assertThat(expression.minNumbers()).isEmpty
        assertThat(expression.lessThan()).isEmpty
        assertThat(expression.lessThanOrEqual()).isEmpty
        assertThat(expression.moreThan()).isEmpty
        assertThat(expression.moreThanOrEqual()).isEmpty
        assertThat(expression.numberEquals()).isEmpty
        assertThat(expression.stringEquals()).isEmpty
        assertThat(expression.isPipelineStageClosed()).isEmpty
        assertThat(expression.not()).isEmpty
        assertThat(expression.date()).isEmpty
        assertThat(expression.month()).isEmpty
        assertThat(expression.year()).isEmpty
        assertThat(expression.now()).isEmpty
        assertThat(expression.timeBetween()).isEmpty
        assertThat(expression.periodToMonths()).isEmpty
        assertThat(expression.periodToWeeks()).isEmpty
        assertThat(expression.and()).isEmpty
        assertThat(expression.or()).isEmpty
        assertThat(expression.xor()).isEmpty
        assertThat(expression.ifString()).isEmpty
        assertThat(expression.ifNumber()).isEmpty
        assertThat(expression.ifBoolean()).isEmpty
        assertThat(expression.isPresent()).isEmpty
        assertThat(expression.hasEmailReply()).isEmpty
        assertThat(expression.hasPlainTextEmailReply()).contains(hasPlainTextEmailReply)
        assertThat(expression.extractMostRecentEmailReplyHtml()).isEmpty
        assertThat(expression.extractMostRecentEmailReplyText()).isEmpty
        assertThat(expression.extractMostRecentPlainTextEmailReply()).isEmpty
        assertThat(expression.setContainsString()).isEmpty
        assertThat(expression.isEngagementType()).isEmpty
        assertThat(expression.formatFullName()).isEmpty
        assertThat(expression.absoluteValue()).isEmpty
        assertThat(expression.squareRoot()).isEmpty
        assertThat(expression.power()).isEmpty
        assertThat(expression.substring()).isEmpty
        assertThat(expression.euler()).isEmpty
        assertThat(expression.stringLength()).isEmpty
        assertThat(expression.addTime()).isEmpty
        assertThat(expression.subtractTime()).isEmpty
    }

    @Test
    fun ofHasPlainTextEmailReplyRoundtrip() {
        val jsonMapper = jsonMapper()
        val expression =
            Expression.ofHasPlainTextEmailReply(
                HasPlainTextEmailReply.builder()
                    .operator(HasPlainTextEmailReply.Operator.HAS_PLAIN_TEXT_EMAIL_REPLY)
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
            )

        val roundtrippedExpression =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(expression),
                jacksonTypeRef<Expression>(),
            )

        assertThat(roundtrippedExpression).isEqualTo(expression)
    }

    @Test
    fun ofExtractMostRecentEmailReplyHtml() {
        val extractMostRecentEmailReplyHtml =
            ExtractMostRecentEmailReplyHtml.builder()
                .operator(
                    ExtractMostRecentEmailReplyHtml.Operator.EXTRACT_MOST_RECENT_EMAIL_REPLY_HTML
                )
                .addInput(
                    ConstantBoolean.builder()
                        .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                        .inputs(listOf())
                        .propertyName("propertyName")
                        .value(true)
                        .build()
                )
                .propertyName("propertyName")
                .value("value")
                .build()

        val expression =
            Expression.ofExtractMostRecentEmailReplyHtml(extractMostRecentEmailReplyHtml)

        assertThat(expression.constantBoolean()).isEmpty
        assertThat(expression.constantNumber()).isEmpty
        assertThat(expression.constantString()).isEmpty
        assertThat(expression.booleanPropertyVariable()).isEmpty
        assertThat(expression.stringPropertyVariable()).isEmpty
        assertThat(expression.numberPropertyVariable()).isEmpty
        assertThat(expression.timestampOfPropertyVariable()).isEmpty
        assertThat(expression.booleanTargetPropertyVariable()).isEmpty
        assertThat(expression.stringTargetPropertyVariable()).isEmpty
        assertThat(expression.numberTargetPropertyVariable()).isEmpty
        assertThat(expression.timestampOfTargetPropertyVariable()).isEmpty
        assertThat(expression.addNumbers()).isEmpty
        assertThat(expression.subtractNumbers()).isEmpty
        assertThat(expression.multiplyNumbers()).isEmpty
        assertThat(expression.divideNumbers()).isEmpty
        assertThat(expression.roundDownNumbers()).isEmpty
        assertThat(expression.roundUpNumbers()).isEmpty
        assertThat(expression.roundNearestNumbers()).isEmpty
        assertThat(expression.upperCase()).isEmpty
        assertThat(expression.lowerCase()).isEmpty
        assertThat(expression.concatStrings()).isEmpty
        assertThat(expression.contains()).isEmpty
        assertThat(expression.beginsWith()).isEmpty
        assertThat(expression.numberToString()).isEmpty
        assertThat(expression.parseNumber()).isEmpty
        assertThat(expression.fetchExchangeRate()).isEmpty
        assertThat(expression.fetchCurrencyDecimalPlaces()).isEmpty
        assertThat(expression.fetchSingleCurrencyPortalCurrency()).isEmpty
        assertThat(expression.datedExchangeRate()).isEmpty
        assertThat(expression.pipelineProbability()).isEmpty
        assertThat(expression.maxNumbers()).isEmpty
        assertThat(expression.minNumbers()).isEmpty
        assertThat(expression.lessThan()).isEmpty
        assertThat(expression.lessThanOrEqual()).isEmpty
        assertThat(expression.moreThan()).isEmpty
        assertThat(expression.moreThanOrEqual()).isEmpty
        assertThat(expression.numberEquals()).isEmpty
        assertThat(expression.stringEquals()).isEmpty
        assertThat(expression.isPipelineStageClosed()).isEmpty
        assertThat(expression.not()).isEmpty
        assertThat(expression.date()).isEmpty
        assertThat(expression.month()).isEmpty
        assertThat(expression.year()).isEmpty
        assertThat(expression.now()).isEmpty
        assertThat(expression.timeBetween()).isEmpty
        assertThat(expression.periodToMonths()).isEmpty
        assertThat(expression.periodToWeeks()).isEmpty
        assertThat(expression.and()).isEmpty
        assertThat(expression.or()).isEmpty
        assertThat(expression.xor()).isEmpty
        assertThat(expression.ifString()).isEmpty
        assertThat(expression.ifNumber()).isEmpty
        assertThat(expression.ifBoolean()).isEmpty
        assertThat(expression.isPresent()).isEmpty
        assertThat(expression.hasEmailReply()).isEmpty
        assertThat(expression.hasPlainTextEmailReply()).isEmpty
        assertThat(expression.extractMostRecentEmailReplyHtml())
            .contains(extractMostRecentEmailReplyHtml)
        assertThat(expression.extractMostRecentEmailReplyText()).isEmpty
        assertThat(expression.extractMostRecentPlainTextEmailReply()).isEmpty
        assertThat(expression.setContainsString()).isEmpty
        assertThat(expression.isEngagementType()).isEmpty
        assertThat(expression.formatFullName()).isEmpty
        assertThat(expression.absoluteValue()).isEmpty
        assertThat(expression.squareRoot()).isEmpty
        assertThat(expression.power()).isEmpty
        assertThat(expression.substring()).isEmpty
        assertThat(expression.euler()).isEmpty
        assertThat(expression.stringLength()).isEmpty
        assertThat(expression.addTime()).isEmpty
        assertThat(expression.subtractTime()).isEmpty
    }

    @Test
    fun ofExtractMostRecentEmailReplyHtmlRoundtrip() {
        val jsonMapper = jsonMapper()
        val expression =
            Expression.ofExtractMostRecentEmailReplyHtml(
                ExtractMostRecentEmailReplyHtml.builder()
                    .operator(
                        ExtractMostRecentEmailReplyHtml.Operator
                            .EXTRACT_MOST_RECENT_EMAIL_REPLY_HTML
                    )
                    .addInput(
                        ConstantBoolean.builder()
                            .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                            .inputs(listOf())
                            .propertyName("propertyName")
                            .value(true)
                            .build()
                    )
                    .propertyName("propertyName")
                    .value("value")
                    .build()
            )

        val roundtrippedExpression =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(expression),
                jacksonTypeRef<Expression>(),
            )

        assertThat(roundtrippedExpression).isEqualTo(expression)
    }

    @Test
    fun ofExtractMostRecentEmailReplyText() {
        val extractMostRecentEmailReplyText =
            ExtractMostRecentEmailReplyText.builder()
                .operator(
                    ExtractMostRecentEmailReplyText.Operator.EXTRACT_MOST_RECENT_EMAIL_REPLY_TEXT
                )
                .addInput(
                    ConstantBoolean.builder()
                        .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                        .inputs(listOf())
                        .propertyName("propertyName")
                        .value(true)
                        .build()
                )
                .propertyName("propertyName")
                .value("value")
                .build()

        val expression =
            Expression.ofExtractMostRecentEmailReplyText(extractMostRecentEmailReplyText)

        assertThat(expression.constantBoolean()).isEmpty
        assertThat(expression.constantNumber()).isEmpty
        assertThat(expression.constantString()).isEmpty
        assertThat(expression.booleanPropertyVariable()).isEmpty
        assertThat(expression.stringPropertyVariable()).isEmpty
        assertThat(expression.numberPropertyVariable()).isEmpty
        assertThat(expression.timestampOfPropertyVariable()).isEmpty
        assertThat(expression.booleanTargetPropertyVariable()).isEmpty
        assertThat(expression.stringTargetPropertyVariable()).isEmpty
        assertThat(expression.numberTargetPropertyVariable()).isEmpty
        assertThat(expression.timestampOfTargetPropertyVariable()).isEmpty
        assertThat(expression.addNumbers()).isEmpty
        assertThat(expression.subtractNumbers()).isEmpty
        assertThat(expression.multiplyNumbers()).isEmpty
        assertThat(expression.divideNumbers()).isEmpty
        assertThat(expression.roundDownNumbers()).isEmpty
        assertThat(expression.roundUpNumbers()).isEmpty
        assertThat(expression.roundNearestNumbers()).isEmpty
        assertThat(expression.upperCase()).isEmpty
        assertThat(expression.lowerCase()).isEmpty
        assertThat(expression.concatStrings()).isEmpty
        assertThat(expression.contains()).isEmpty
        assertThat(expression.beginsWith()).isEmpty
        assertThat(expression.numberToString()).isEmpty
        assertThat(expression.parseNumber()).isEmpty
        assertThat(expression.fetchExchangeRate()).isEmpty
        assertThat(expression.fetchCurrencyDecimalPlaces()).isEmpty
        assertThat(expression.fetchSingleCurrencyPortalCurrency()).isEmpty
        assertThat(expression.datedExchangeRate()).isEmpty
        assertThat(expression.pipelineProbability()).isEmpty
        assertThat(expression.maxNumbers()).isEmpty
        assertThat(expression.minNumbers()).isEmpty
        assertThat(expression.lessThan()).isEmpty
        assertThat(expression.lessThanOrEqual()).isEmpty
        assertThat(expression.moreThan()).isEmpty
        assertThat(expression.moreThanOrEqual()).isEmpty
        assertThat(expression.numberEquals()).isEmpty
        assertThat(expression.stringEquals()).isEmpty
        assertThat(expression.isPipelineStageClosed()).isEmpty
        assertThat(expression.not()).isEmpty
        assertThat(expression.date()).isEmpty
        assertThat(expression.month()).isEmpty
        assertThat(expression.year()).isEmpty
        assertThat(expression.now()).isEmpty
        assertThat(expression.timeBetween()).isEmpty
        assertThat(expression.periodToMonths()).isEmpty
        assertThat(expression.periodToWeeks()).isEmpty
        assertThat(expression.and()).isEmpty
        assertThat(expression.or()).isEmpty
        assertThat(expression.xor()).isEmpty
        assertThat(expression.ifString()).isEmpty
        assertThat(expression.ifNumber()).isEmpty
        assertThat(expression.ifBoolean()).isEmpty
        assertThat(expression.isPresent()).isEmpty
        assertThat(expression.hasEmailReply()).isEmpty
        assertThat(expression.hasPlainTextEmailReply()).isEmpty
        assertThat(expression.extractMostRecentEmailReplyHtml()).isEmpty
        assertThat(expression.extractMostRecentEmailReplyText())
            .contains(extractMostRecentEmailReplyText)
        assertThat(expression.extractMostRecentPlainTextEmailReply()).isEmpty
        assertThat(expression.setContainsString()).isEmpty
        assertThat(expression.isEngagementType()).isEmpty
        assertThat(expression.formatFullName()).isEmpty
        assertThat(expression.absoluteValue()).isEmpty
        assertThat(expression.squareRoot()).isEmpty
        assertThat(expression.power()).isEmpty
        assertThat(expression.substring()).isEmpty
        assertThat(expression.euler()).isEmpty
        assertThat(expression.stringLength()).isEmpty
        assertThat(expression.addTime()).isEmpty
        assertThat(expression.subtractTime()).isEmpty
    }

    @Test
    fun ofExtractMostRecentEmailReplyTextRoundtrip() {
        val jsonMapper = jsonMapper()
        val expression =
            Expression.ofExtractMostRecentEmailReplyText(
                ExtractMostRecentEmailReplyText.builder()
                    .operator(
                        ExtractMostRecentEmailReplyText.Operator
                            .EXTRACT_MOST_RECENT_EMAIL_REPLY_TEXT
                    )
                    .addInput(
                        ConstantBoolean.builder()
                            .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                            .inputs(listOf())
                            .propertyName("propertyName")
                            .value(true)
                            .build()
                    )
                    .propertyName("propertyName")
                    .value("value")
                    .build()
            )

        val roundtrippedExpression =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(expression),
                jacksonTypeRef<Expression>(),
            )

        assertThat(roundtrippedExpression).isEqualTo(expression)
    }

    @Test
    fun ofExtractMostRecentPlainTextEmailReply() {
        val extractMostRecentPlainTextEmailReply =
            ExtractMostRecentPlainTextEmailReply.builder()
                .operator(
                    ExtractMostRecentPlainTextEmailReply.Operator
                        .EXTRACT_MOST_RECENT_PLAIN_TEXT_EMAIL_REPLY
                )
                .addInput(
                    ConstantBoolean.builder()
                        .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                        .inputs(listOf())
                        .propertyName("propertyName")
                        .value(true)
                        .build()
                )
                .propertyName("propertyName")
                .value("value")
                .build()

        val expression =
            Expression.ofExtractMostRecentPlainTextEmailReply(extractMostRecentPlainTextEmailReply)

        assertThat(expression.constantBoolean()).isEmpty
        assertThat(expression.constantNumber()).isEmpty
        assertThat(expression.constantString()).isEmpty
        assertThat(expression.booleanPropertyVariable()).isEmpty
        assertThat(expression.stringPropertyVariable()).isEmpty
        assertThat(expression.numberPropertyVariable()).isEmpty
        assertThat(expression.timestampOfPropertyVariable()).isEmpty
        assertThat(expression.booleanTargetPropertyVariable()).isEmpty
        assertThat(expression.stringTargetPropertyVariable()).isEmpty
        assertThat(expression.numberTargetPropertyVariable()).isEmpty
        assertThat(expression.timestampOfTargetPropertyVariable()).isEmpty
        assertThat(expression.addNumbers()).isEmpty
        assertThat(expression.subtractNumbers()).isEmpty
        assertThat(expression.multiplyNumbers()).isEmpty
        assertThat(expression.divideNumbers()).isEmpty
        assertThat(expression.roundDownNumbers()).isEmpty
        assertThat(expression.roundUpNumbers()).isEmpty
        assertThat(expression.roundNearestNumbers()).isEmpty
        assertThat(expression.upperCase()).isEmpty
        assertThat(expression.lowerCase()).isEmpty
        assertThat(expression.concatStrings()).isEmpty
        assertThat(expression.contains()).isEmpty
        assertThat(expression.beginsWith()).isEmpty
        assertThat(expression.numberToString()).isEmpty
        assertThat(expression.parseNumber()).isEmpty
        assertThat(expression.fetchExchangeRate()).isEmpty
        assertThat(expression.fetchCurrencyDecimalPlaces()).isEmpty
        assertThat(expression.fetchSingleCurrencyPortalCurrency()).isEmpty
        assertThat(expression.datedExchangeRate()).isEmpty
        assertThat(expression.pipelineProbability()).isEmpty
        assertThat(expression.maxNumbers()).isEmpty
        assertThat(expression.minNumbers()).isEmpty
        assertThat(expression.lessThan()).isEmpty
        assertThat(expression.lessThanOrEqual()).isEmpty
        assertThat(expression.moreThan()).isEmpty
        assertThat(expression.moreThanOrEqual()).isEmpty
        assertThat(expression.numberEquals()).isEmpty
        assertThat(expression.stringEquals()).isEmpty
        assertThat(expression.isPipelineStageClosed()).isEmpty
        assertThat(expression.not()).isEmpty
        assertThat(expression.date()).isEmpty
        assertThat(expression.month()).isEmpty
        assertThat(expression.year()).isEmpty
        assertThat(expression.now()).isEmpty
        assertThat(expression.timeBetween()).isEmpty
        assertThat(expression.periodToMonths()).isEmpty
        assertThat(expression.periodToWeeks()).isEmpty
        assertThat(expression.and()).isEmpty
        assertThat(expression.or()).isEmpty
        assertThat(expression.xor()).isEmpty
        assertThat(expression.ifString()).isEmpty
        assertThat(expression.ifNumber()).isEmpty
        assertThat(expression.ifBoolean()).isEmpty
        assertThat(expression.isPresent()).isEmpty
        assertThat(expression.hasEmailReply()).isEmpty
        assertThat(expression.hasPlainTextEmailReply()).isEmpty
        assertThat(expression.extractMostRecentEmailReplyHtml()).isEmpty
        assertThat(expression.extractMostRecentEmailReplyText()).isEmpty
        assertThat(expression.extractMostRecentPlainTextEmailReply())
            .contains(extractMostRecentPlainTextEmailReply)
        assertThat(expression.setContainsString()).isEmpty
        assertThat(expression.isEngagementType()).isEmpty
        assertThat(expression.formatFullName()).isEmpty
        assertThat(expression.absoluteValue()).isEmpty
        assertThat(expression.squareRoot()).isEmpty
        assertThat(expression.power()).isEmpty
        assertThat(expression.substring()).isEmpty
        assertThat(expression.euler()).isEmpty
        assertThat(expression.stringLength()).isEmpty
        assertThat(expression.addTime()).isEmpty
        assertThat(expression.subtractTime()).isEmpty
    }

    @Test
    fun ofExtractMostRecentPlainTextEmailReplyRoundtrip() {
        val jsonMapper = jsonMapper()
        val expression =
            Expression.ofExtractMostRecentPlainTextEmailReply(
                ExtractMostRecentPlainTextEmailReply.builder()
                    .operator(
                        ExtractMostRecentPlainTextEmailReply.Operator
                            .EXTRACT_MOST_RECENT_PLAIN_TEXT_EMAIL_REPLY
                    )
                    .addInput(
                        ConstantBoolean.builder()
                            .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                            .inputs(listOf())
                            .propertyName("propertyName")
                            .value(true)
                            .build()
                    )
                    .propertyName("propertyName")
                    .value("value")
                    .build()
            )

        val roundtrippedExpression =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(expression),
                jacksonTypeRef<Expression>(),
            )

        assertThat(roundtrippedExpression).isEqualTo(expression)
    }

    @Test
    fun ofSetContainsString() {
        val setContainsString =
            SetContainsString.builder()
                .operator(SetContainsString.Operator.SET_CONTAINS_STRING)
                .stringToCheck(
                    ConstantBoolean.builder()
                        .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                        .inputs(listOf())
                        .propertyName("propertyName")
                        .value(true)
                        .build()
                )
                .inputs(listOf())
                .propertyName("propertyName")
                .value(true)
                .build()

        val expression = Expression.ofSetContainsString(setContainsString)

        assertThat(expression.constantBoolean()).isEmpty
        assertThat(expression.constantNumber()).isEmpty
        assertThat(expression.constantString()).isEmpty
        assertThat(expression.booleanPropertyVariable()).isEmpty
        assertThat(expression.stringPropertyVariable()).isEmpty
        assertThat(expression.numberPropertyVariable()).isEmpty
        assertThat(expression.timestampOfPropertyVariable()).isEmpty
        assertThat(expression.booleanTargetPropertyVariable()).isEmpty
        assertThat(expression.stringTargetPropertyVariable()).isEmpty
        assertThat(expression.numberTargetPropertyVariable()).isEmpty
        assertThat(expression.timestampOfTargetPropertyVariable()).isEmpty
        assertThat(expression.addNumbers()).isEmpty
        assertThat(expression.subtractNumbers()).isEmpty
        assertThat(expression.multiplyNumbers()).isEmpty
        assertThat(expression.divideNumbers()).isEmpty
        assertThat(expression.roundDownNumbers()).isEmpty
        assertThat(expression.roundUpNumbers()).isEmpty
        assertThat(expression.roundNearestNumbers()).isEmpty
        assertThat(expression.upperCase()).isEmpty
        assertThat(expression.lowerCase()).isEmpty
        assertThat(expression.concatStrings()).isEmpty
        assertThat(expression.contains()).isEmpty
        assertThat(expression.beginsWith()).isEmpty
        assertThat(expression.numberToString()).isEmpty
        assertThat(expression.parseNumber()).isEmpty
        assertThat(expression.fetchExchangeRate()).isEmpty
        assertThat(expression.fetchCurrencyDecimalPlaces()).isEmpty
        assertThat(expression.fetchSingleCurrencyPortalCurrency()).isEmpty
        assertThat(expression.datedExchangeRate()).isEmpty
        assertThat(expression.pipelineProbability()).isEmpty
        assertThat(expression.maxNumbers()).isEmpty
        assertThat(expression.minNumbers()).isEmpty
        assertThat(expression.lessThan()).isEmpty
        assertThat(expression.lessThanOrEqual()).isEmpty
        assertThat(expression.moreThan()).isEmpty
        assertThat(expression.moreThanOrEqual()).isEmpty
        assertThat(expression.numberEquals()).isEmpty
        assertThat(expression.stringEquals()).isEmpty
        assertThat(expression.isPipelineStageClosed()).isEmpty
        assertThat(expression.not()).isEmpty
        assertThat(expression.date()).isEmpty
        assertThat(expression.month()).isEmpty
        assertThat(expression.year()).isEmpty
        assertThat(expression.now()).isEmpty
        assertThat(expression.timeBetween()).isEmpty
        assertThat(expression.periodToMonths()).isEmpty
        assertThat(expression.periodToWeeks()).isEmpty
        assertThat(expression.and()).isEmpty
        assertThat(expression.or()).isEmpty
        assertThat(expression.xor()).isEmpty
        assertThat(expression.ifString()).isEmpty
        assertThat(expression.ifNumber()).isEmpty
        assertThat(expression.ifBoolean()).isEmpty
        assertThat(expression.isPresent()).isEmpty
        assertThat(expression.hasEmailReply()).isEmpty
        assertThat(expression.hasPlainTextEmailReply()).isEmpty
        assertThat(expression.extractMostRecentEmailReplyHtml()).isEmpty
        assertThat(expression.extractMostRecentEmailReplyText()).isEmpty
        assertThat(expression.extractMostRecentPlainTextEmailReply()).isEmpty
        assertThat(expression.setContainsString()).contains(setContainsString)
        assertThat(expression.isEngagementType()).isEmpty
        assertThat(expression.formatFullName()).isEmpty
        assertThat(expression.absoluteValue()).isEmpty
        assertThat(expression.squareRoot()).isEmpty
        assertThat(expression.power()).isEmpty
        assertThat(expression.substring()).isEmpty
        assertThat(expression.euler()).isEmpty
        assertThat(expression.stringLength()).isEmpty
        assertThat(expression.addTime()).isEmpty
        assertThat(expression.subtractTime()).isEmpty
    }

    @Test
    fun ofSetContainsStringRoundtrip() {
        val jsonMapper = jsonMapper()
        val expression =
            Expression.ofSetContainsString(
                SetContainsString.builder()
                    .operator(SetContainsString.Operator.SET_CONTAINS_STRING)
                    .stringToCheck(
                        ConstantBoolean.builder()
                            .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                            .inputs(listOf())
                            .propertyName("propertyName")
                            .value(true)
                            .build()
                    )
                    .inputs(listOf())
                    .propertyName("propertyName")
                    .value(true)
                    .build()
            )

        val roundtrippedExpression =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(expression),
                jacksonTypeRef<Expression>(),
            )

        assertThat(roundtrippedExpression).isEqualTo(expression)
    }

    @Test
    fun ofIsEngagementType() {
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

        val expression = Expression.ofIsEngagementType(isEngagementType)

        assertThat(expression.constantBoolean()).isEmpty
        assertThat(expression.constantNumber()).isEmpty
        assertThat(expression.constantString()).isEmpty
        assertThat(expression.booleanPropertyVariable()).isEmpty
        assertThat(expression.stringPropertyVariable()).isEmpty
        assertThat(expression.numberPropertyVariable()).isEmpty
        assertThat(expression.timestampOfPropertyVariable()).isEmpty
        assertThat(expression.booleanTargetPropertyVariable()).isEmpty
        assertThat(expression.stringTargetPropertyVariable()).isEmpty
        assertThat(expression.numberTargetPropertyVariable()).isEmpty
        assertThat(expression.timestampOfTargetPropertyVariable()).isEmpty
        assertThat(expression.addNumbers()).isEmpty
        assertThat(expression.subtractNumbers()).isEmpty
        assertThat(expression.multiplyNumbers()).isEmpty
        assertThat(expression.divideNumbers()).isEmpty
        assertThat(expression.roundDownNumbers()).isEmpty
        assertThat(expression.roundUpNumbers()).isEmpty
        assertThat(expression.roundNearestNumbers()).isEmpty
        assertThat(expression.upperCase()).isEmpty
        assertThat(expression.lowerCase()).isEmpty
        assertThat(expression.concatStrings()).isEmpty
        assertThat(expression.contains()).isEmpty
        assertThat(expression.beginsWith()).isEmpty
        assertThat(expression.numberToString()).isEmpty
        assertThat(expression.parseNumber()).isEmpty
        assertThat(expression.fetchExchangeRate()).isEmpty
        assertThat(expression.fetchCurrencyDecimalPlaces()).isEmpty
        assertThat(expression.fetchSingleCurrencyPortalCurrency()).isEmpty
        assertThat(expression.datedExchangeRate()).isEmpty
        assertThat(expression.pipelineProbability()).isEmpty
        assertThat(expression.maxNumbers()).isEmpty
        assertThat(expression.minNumbers()).isEmpty
        assertThat(expression.lessThan()).isEmpty
        assertThat(expression.lessThanOrEqual()).isEmpty
        assertThat(expression.moreThan()).isEmpty
        assertThat(expression.moreThanOrEqual()).isEmpty
        assertThat(expression.numberEquals()).isEmpty
        assertThat(expression.stringEquals()).isEmpty
        assertThat(expression.isPipelineStageClosed()).isEmpty
        assertThat(expression.not()).isEmpty
        assertThat(expression.date()).isEmpty
        assertThat(expression.month()).isEmpty
        assertThat(expression.year()).isEmpty
        assertThat(expression.now()).isEmpty
        assertThat(expression.timeBetween()).isEmpty
        assertThat(expression.periodToMonths()).isEmpty
        assertThat(expression.periodToWeeks()).isEmpty
        assertThat(expression.and()).isEmpty
        assertThat(expression.or()).isEmpty
        assertThat(expression.xor()).isEmpty
        assertThat(expression.ifString()).isEmpty
        assertThat(expression.ifNumber()).isEmpty
        assertThat(expression.ifBoolean()).isEmpty
        assertThat(expression.isPresent()).isEmpty
        assertThat(expression.hasEmailReply()).isEmpty
        assertThat(expression.hasPlainTextEmailReply()).isEmpty
        assertThat(expression.extractMostRecentEmailReplyHtml()).isEmpty
        assertThat(expression.extractMostRecentEmailReplyText()).isEmpty
        assertThat(expression.extractMostRecentPlainTextEmailReply()).isEmpty
        assertThat(expression.setContainsString()).isEmpty
        assertThat(expression.isEngagementType()).contains(isEngagementType)
        assertThat(expression.formatFullName()).isEmpty
        assertThat(expression.absoluteValue()).isEmpty
        assertThat(expression.squareRoot()).isEmpty
        assertThat(expression.power()).isEmpty
        assertThat(expression.substring()).isEmpty
        assertThat(expression.euler()).isEmpty
        assertThat(expression.stringLength()).isEmpty
        assertThat(expression.addTime()).isEmpty
        assertThat(expression.subtractTime()).isEmpty
    }

    @Test
    fun ofIsEngagementTypeRoundtrip() {
        val jsonMapper = jsonMapper()
        val expression =
            Expression.ofIsEngagementType(
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
            )

        val roundtrippedExpression =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(expression),
                jacksonTypeRef<Expression>(),
            )

        assertThat(roundtrippedExpression).isEqualTo(expression)
    }

    @Test
    fun ofFormatFullName() {
        val formatFullName =
            FormatFullName.builder()
                .operator(FormatFullName.Operator.FORMAT_FULL_NAME)
                .addInput(
                    ConstantBoolean.builder()
                        .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                        .inputs(listOf())
                        .propertyName("propertyName")
                        .value(true)
                        .build()
                )
                .propertyName("propertyName")
                .value("value")
                .build()

        val expression = Expression.ofFormatFullName(formatFullName)

        assertThat(expression.constantBoolean()).isEmpty
        assertThat(expression.constantNumber()).isEmpty
        assertThat(expression.constantString()).isEmpty
        assertThat(expression.booleanPropertyVariable()).isEmpty
        assertThat(expression.stringPropertyVariable()).isEmpty
        assertThat(expression.numberPropertyVariable()).isEmpty
        assertThat(expression.timestampOfPropertyVariable()).isEmpty
        assertThat(expression.booleanTargetPropertyVariable()).isEmpty
        assertThat(expression.stringTargetPropertyVariable()).isEmpty
        assertThat(expression.numberTargetPropertyVariable()).isEmpty
        assertThat(expression.timestampOfTargetPropertyVariable()).isEmpty
        assertThat(expression.addNumbers()).isEmpty
        assertThat(expression.subtractNumbers()).isEmpty
        assertThat(expression.multiplyNumbers()).isEmpty
        assertThat(expression.divideNumbers()).isEmpty
        assertThat(expression.roundDownNumbers()).isEmpty
        assertThat(expression.roundUpNumbers()).isEmpty
        assertThat(expression.roundNearestNumbers()).isEmpty
        assertThat(expression.upperCase()).isEmpty
        assertThat(expression.lowerCase()).isEmpty
        assertThat(expression.concatStrings()).isEmpty
        assertThat(expression.contains()).isEmpty
        assertThat(expression.beginsWith()).isEmpty
        assertThat(expression.numberToString()).isEmpty
        assertThat(expression.parseNumber()).isEmpty
        assertThat(expression.fetchExchangeRate()).isEmpty
        assertThat(expression.fetchCurrencyDecimalPlaces()).isEmpty
        assertThat(expression.fetchSingleCurrencyPortalCurrency()).isEmpty
        assertThat(expression.datedExchangeRate()).isEmpty
        assertThat(expression.pipelineProbability()).isEmpty
        assertThat(expression.maxNumbers()).isEmpty
        assertThat(expression.minNumbers()).isEmpty
        assertThat(expression.lessThan()).isEmpty
        assertThat(expression.lessThanOrEqual()).isEmpty
        assertThat(expression.moreThan()).isEmpty
        assertThat(expression.moreThanOrEqual()).isEmpty
        assertThat(expression.numberEquals()).isEmpty
        assertThat(expression.stringEquals()).isEmpty
        assertThat(expression.isPipelineStageClosed()).isEmpty
        assertThat(expression.not()).isEmpty
        assertThat(expression.date()).isEmpty
        assertThat(expression.month()).isEmpty
        assertThat(expression.year()).isEmpty
        assertThat(expression.now()).isEmpty
        assertThat(expression.timeBetween()).isEmpty
        assertThat(expression.periodToMonths()).isEmpty
        assertThat(expression.periodToWeeks()).isEmpty
        assertThat(expression.and()).isEmpty
        assertThat(expression.or()).isEmpty
        assertThat(expression.xor()).isEmpty
        assertThat(expression.ifString()).isEmpty
        assertThat(expression.ifNumber()).isEmpty
        assertThat(expression.ifBoolean()).isEmpty
        assertThat(expression.isPresent()).isEmpty
        assertThat(expression.hasEmailReply()).isEmpty
        assertThat(expression.hasPlainTextEmailReply()).isEmpty
        assertThat(expression.extractMostRecentEmailReplyHtml()).isEmpty
        assertThat(expression.extractMostRecentEmailReplyText()).isEmpty
        assertThat(expression.extractMostRecentPlainTextEmailReply()).isEmpty
        assertThat(expression.setContainsString()).isEmpty
        assertThat(expression.isEngagementType()).isEmpty
        assertThat(expression.formatFullName()).contains(formatFullName)
        assertThat(expression.absoluteValue()).isEmpty
        assertThat(expression.squareRoot()).isEmpty
        assertThat(expression.power()).isEmpty
        assertThat(expression.substring()).isEmpty
        assertThat(expression.euler()).isEmpty
        assertThat(expression.stringLength()).isEmpty
        assertThat(expression.addTime()).isEmpty
        assertThat(expression.subtractTime()).isEmpty
    }

    @Test
    fun ofFormatFullNameRoundtrip() {
        val jsonMapper = jsonMapper()
        val expression =
            Expression.ofFormatFullName(
                FormatFullName.builder()
                    .operator(FormatFullName.Operator.FORMAT_FULL_NAME)
                    .addInput(
                        ConstantBoolean.builder()
                            .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                            .inputs(listOf())
                            .propertyName("propertyName")
                            .value(true)
                            .build()
                    )
                    .propertyName("propertyName")
                    .value("value")
                    .build()
            )

        val roundtrippedExpression =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(expression),
                jacksonTypeRef<Expression>(),
            )

        assertThat(roundtrippedExpression).isEqualTo(expression)
    }

    @Test
    fun ofAbsoluteValue() {
        val absoluteValue =
            AbsoluteValue.builder()
                .operator(AbsoluteValue.Operator.ABSOLUTE_VALUE)
                .addInput(
                    ConstantBoolean.builder()
                        .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                        .inputs(listOf())
                        .propertyName("propertyName")
                        .value(true)
                        .build()
                )
                .propertyName("propertyName")
                .value(0.0)
                .build()

        val expression = Expression.ofAbsoluteValue(absoluteValue)

        assertThat(expression.constantBoolean()).isEmpty
        assertThat(expression.constantNumber()).isEmpty
        assertThat(expression.constantString()).isEmpty
        assertThat(expression.booleanPropertyVariable()).isEmpty
        assertThat(expression.stringPropertyVariable()).isEmpty
        assertThat(expression.numberPropertyVariable()).isEmpty
        assertThat(expression.timestampOfPropertyVariable()).isEmpty
        assertThat(expression.booleanTargetPropertyVariable()).isEmpty
        assertThat(expression.stringTargetPropertyVariable()).isEmpty
        assertThat(expression.numberTargetPropertyVariable()).isEmpty
        assertThat(expression.timestampOfTargetPropertyVariable()).isEmpty
        assertThat(expression.addNumbers()).isEmpty
        assertThat(expression.subtractNumbers()).isEmpty
        assertThat(expression.multiplyNumbers()).isEmpty
        assertThat(expression.divideNumbers()).isEmpty
        assertThat(expression.roundDownNumbers()).isEmpty
        assertThat(expression.roundUpNumbers()).isEmpty
        assertThat(expression.roundNearestNumbers()).isEmpty
        assertThat(expression.upperCase()).isEmpty
        assertThat(expression.lowerCase()).isEmpty
        assertThat(expression.concatStrings()).isEmpty
        assertThat(expression.contains()).isEmpty
        assertThat(expression.beginsWith()).isEmpty
        assertThat(expression.numberToString()).isEmpty
        assertThat(expression.parseNumber()).isEmpty
        assertThat(expression.fetchExchangeRate()).isEmpty
        assertThat(expression.fetchCurrencyDecimalPlaces()).isEmpty
        assertThat(expression.fetchSingleCurrencyPortalCurrency()).isEmpty
        assertThat(expression.datedExchangeRate()).isEmpty
        assertThat(expression.pipelineProbability()).isEmpty
        assertThat(expression.maxNumbers()).isEmpty
        assertThat(expression.minNumbers()).isEmpty
        assertThat(expression.lessThan()).isEmpty
        assertThat(expression.lessThanOrEqual()).isEmpty
        assertThat(expression.moreThan()).isEmpty
        assertThat(expression.moreThanOrEqual()).isEmpty
        assertThat(expression.numberEquals()).isEmpty
        assertThat(expression.stringEquals()).isEmpty
        assertThat(expression.isPipelineStageClosed()).isEmpty
        assertThat(expression.not()).isEmpty
        assertThat(expression.date()).isEmpty
        assertThat(expression.month()).isEmpty
        assertThat(expression.year()).isEmpty
        assertThat(expression.now()).isEmpty
        assertThat(expression.timeBetween()).isEmpty
        assertThat(expression.periodToMonths()).isEmpty
        assertThat(expression.periodToWeeks()).isEmpty
        assertThat(expression.and()).isEmpty
        assertThat(expression.or()).isEmpty
        assertThat(expression.xor()).isEmpty
        assertThat(expression.ifString()).isEmpty
        assertThat(expression.ifNumber()).isEmpty
        assertThat(expression.ifBoolean()).isEmpty
        assertThat(expression.isPresent()).isEmpty
        assertThat(expression.hasEmailReply()).isEmpty
        assertThat(expression.hasPlainTextEmailReply()).isEmpty
        assertThat(expression.extractMostRecentEmailReplyHtml()).isEmpty
        assertThat(expression.extractMostRecentEmailReplyText()).isEmpty
        assertThat(expression.extractMostRecentPlainTextEmailReply()).isEmpty
        assertThat(expression.setContainsString()).isEmpty
        assertThat(expression.isEngagementType()).isEmpty
        assertThat(expression.formatFullName()).isEmpty
        assertThat(expression.absoluteValue()).contains(absoluteValue)
        assertThat(expression.squareRoot()).isEmpty
        assertThat(expression.power()).isEmpty
        assertThat(expression.substring()).isEmpty
        assertThat(expression.euler()).isEmpty
        assertThat(expression.stringLength()).isEmpty
        assertThat(expression.addTime()).isEmpty
        assertThat(expression.subtractTime()).isEmpty
    }

    @Test
    fun ofAbsoluteValueRoundtrip() {
        val jsonMapper = jsonMapper()
        val expression =
            Expression.ofAbsoluteValue(
                AbsoluteValue.builder()
                    .operator(AbsoluteValue.Operator.ABSOLUTE_VALUE)
                    .addInput(
                        ConstantBoolean.builder()
                            .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                            .inputs(listOf())
                            .propertyName("propertyName")
                            .value(true)
                            .build()
                    )
                    .propertyName("propertyName")
                    .value(0.0)
                    .build()
            )

        val roundtrippedExpression =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(expression),
                jacksonTypeRef<Expression>(),
            )

        assertThat(roundtrippedExpression).isEqualTo(expression)
    }

    @Test
    fun ofSquareRoot() {
        val squareRoot =
            SquareRoot.builder()
                .operator(SquareRoot.Operator.SQUARE_ROOT)
                .addInput(
                    ConstantBoolean.builder()
                        .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                        .inputs(listOf())
                        .propertyName("propertyName")
                        .value(true)
                        .build()
                )
                .propertyName("propertyName")
                .value(0.0)
                .build()

        val expression = Expression.ofSquareRoot(squareRoot)

        assertThat(expression.constantBoolean()).isEmpty
        assertThat(expression.constantNumber()).isEmpty
        assertThat(expression.constantString()).isEmpty
        assertThat(expression.booleanPropertyVariable()).isEmpty
        assertThat(expression.stringPropertyVariable()).isEmpty
        assertThat(expression.numberPropertyVariable()).isEmpty
        assertThat(expression.timestampOfPropertyVariable()).isEmpty
        assertThat(expression.booleanTargetPropertyVariable()).isEmpty
        assertThat(expression.stringTargetPropertyVariable()).isEmpty
        assertThat(expression.numberTargetPropertyVariable()).isEmpty
        assertThat(expression.timestampOfTargetPropertyVariable()).isEmpty
        assertThat(expression.addNumbers()).isEmpty
        assertThat(expression.subtractNumbers()).isEmpty
        assertThat(expression.multiplyNumbers()).isEmpty
        assertThat(expression.divideNumbers()).isEmpty
        assertThat(expression.roundDownNumbers()).isEmpty
        assertThat(expression.roundUpNumbers()).isEmpty
        assertThat(expression.roundNearestNumbers()).isEmpty
        assertThat(expression.upperCase()).isEmpty
        assertThat(expression.lowerCase()).isEmpty
        assertThat(expression.concatStrings()).isEmpty
        assertThat(expression.contains()).isEmpty
        assertThat(expression.beginsWith()).isEmpty
        assertThat(expression.numberToString()).isEmpty
        assertThat(expression.parseNumber()).isEmpty
        assertThat(expression.fetchExchangeRate()).isEmpty
        assertThat(expression.fetchCurrencyDecimalPlaces()).isEmpty
        assertThat(expression.fetchSingleCurrencyPortalCurrency()).isEmpty
        assertThat(expression.datedExchangeRate()).isEmpty
        assertThat(expression.pipelineProbability()).isEmpty
        assertThat(expression.maxNumbers()).isEmpty
        assertThat(expression.minNumbers()).isEmpty
        assertThat(expression.lessThan()).isEmpty
        assertThat(expression.lessThanOrEqual()).isEmpty
        assertThat(expression.moreThan()).isEmpty
        assertThat(expression.moreThanOrEqual()).isEmpty
        assertThat(expression.numberEquals()).isEmpty
        assertThat(expression.stringEquals()).isEmpty
        assertThat(expression.isPipelineStageClosed()).isEmpty
        assertThat(expression.not()).isEmpty
        assertThat(expression.date()).isEmpty
        assertThat(expression.month()).isEmpty
        assertThat(expression.year()).isEmpty
        assertThat(expression.now()).isEmpty
        assertThat(expression.timeBetween()).isEmpty
        assertThat(expression.periodToMonths()).isEmpty
        assertThat(expression.periodToWeeks()).isEmpty
        assertThat(expression.and()).isEmpty
        assertThat(expression.or()).isEmpty
        assertThat(expression.xor()).isEmpty
        assertThat(expression.ifString()).isEmpty
        assertThat(expression.ifNumber()).isEmpty
        assertThat(expression.ifBoolean()).isEmpty
        assertThat(expression.isPresent()).isEmpty
        assertThat(expression.hasEmailReply()).isEmpty
        assertThat(expression.hasPlainTextEmailReply()).isEmpty
        assertThat(expression.extractMostRecentEmailReplyHtml()).isEmpty
        assertThat(expression.extractMostRecentEmailReplyText()).isEmpty
        assertThat(expression.extractMostRecentPlainTextEmailReply()).isEmpty
        assertThat(expression.setContainsString()).isEmpty
        assertThat(expression.isEngagementType()).isEmpty
        assertThat(expression.formatFullName()).isEmpty
        assertThat(expression.absoluteValue()).isEmpty
        assertThat(expression.squareRoot()).contains(squareRoot)
        assertThat(expression.power()).isEmpty
        assertThat(expression.substring()).isEmpty
        assertThat(expression.euler()).isEmpty
        assertThat(expression.stringLength()).isEmpty
        assertThat(expression.addTime()).isEmpty
        assertThat(expression.subtractTime()).isEmpty
    }

    @Test
    fun ofSquareRootRoundtrip() {
        val jsonMapper = jsonMapper()
        val expression =
            Expression.ofSquareRoot(
                SquareRoot.builder()
                    .operator(SquareRoot.Operator.SQUARE_ROOT)
                    .addInput(
                        ConstantBoolean.builder()
                            .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                            .inputs(listOf())
                            .propertyName("propertyName")
                            .value(true)
                            .build()
                    )
                    .propertyName("propertyName")
                    .value(0.0)
                    .build()
            )

        val roundtrippedExpression =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(expression),
                jacksonTypeRef<Expression>(),
            )

        assertThat(roundtrippedExpression).isEqualTo(expression)
    }

    @Test
    fun ofPower() {
        val power =
            Power.builder()
                .operator(Power.Operator.POWER)
                .addInput(
                    ConstantBoolean.builder()
                        .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                        .inputs(listOf())
                        .propertyName("propertyName")
                        .value(true)
                        .build()
                )
                .propertyName("propertyName")
                .value(0.0)
                .build()

        val expression = Expression.ofPower(power)

        assertThat(expression.constantBoolean()).isEmpty
        assertThat(expression.constantNumber()).isEmpty
        assertThat(expression.constantString()).isEmpty
        assertThat(expression.booleanPropertyVariable()).isEmpty
        assertThat(expression.stringPropertyVariable()).isEmpty
        assertThat(expression.numberPropertyVariable()).isEmpty
        assertThat(expression.timestampOfPropertyVariable()).isEmpty
        assertThat(expression.booleanTargetPropertyVariable()).isEmpty
        assertThat(expression.stringTargetPropertyVariable()).isEmpty
        assertThat(expression.numberTargetPropertyVariable()).isEmpty
        assertThat(expression.timestampOfTargetPropertyVariable()).isEmpty
        assertThat(expression.addNumbers()).isEmpty
        assertThat(expression.subtractNumbers()).isEmpty
        assertThat(expression.multiplyNumbers()).isEmpty
        assertThat(expression.divideNumbers()).isEmpty
        assertThat(expression.roundDownNumbers()).isEmpty
        assertThat(expression.roundUpNumbers()).isEmpty
        assertThat(expression.roundNearestNumbers()).isEmpty
        assertThat(expression.upperCase()).isEmpty
        assertThat(expression.lowerCase()).isEmpty
        assertThat(expression.concatStrings()).isEmpty
        assertThat(expression.contains()).isEmpty
        assertThat(expression.beginsWith()).isEmpty
        assertThat(expression.numberToString()).isEmpty
        assertThat(expression.parseNumber()).isEmpty
        assertThat(expression.fetchExchangeRate()).isEmpty
        assertThat(expression.fetchCurrencyDecimalPlaces()).isEmpty
        assertThat(expression.fetchSingleCurrencyPortalCurrency()).isEmpty
        assertThat(expression.datedExchangeRate()).isEmpty
        assertThat(expression.pipelineProbability()).isEmpty
        assertThat(expression.maxNumbers()).isEmpty
        assertThat(expression.minNumbers()).isEmpty
        assertThat(expression.lessThan()).isEmpty
        assertThat(expression.lessThanOrEqual()).isEmpty
        assertThat(expression.moreThan()).isEmpty
        assertThat(expression.moreThanOrEqual()).isEmpty
        assertThat(expression.numberEquals()).isEmpty
        assertThat(expression.stringEquals()).isEmpty
        assertThat(expression.isPipelineStageClosed()).isEmpty
        assertThat(expression.not()).isEmpty
        assertThat(expression.date()).isEmpty
        assertThat(expression.month()).isEmpty
        assertThat(expression.year()).isEmpty
        assertThat(expression.now()).isEmpty
        assertThat(expression.timeBetween()).isEmpty
        assertThat(expression.periodToMonths()).isEmpty
        assertThat(expression.periodToWeeks()).isEmpty
        assertThat(expression.and()).isEmpty
        assertThat(expression.or()).isEmpty
        assertThat(expression.xor()).isEmpty
        assertThat(expression.ifString()).isEmpty
        assertThat(expression.ifNumber()).isEmpty
        assertThat(expression.ifBoolean()).isEmpty
        assertThat(expression.isPresent()).isEmpty
        assertThat(expression.hasEmailReply()).isEmpty
        assertThat(expression.hasPlainTextEmailReply()).isEmpty
        assertThat(expression.extractMostRecentEmailReplyHtml()).isEmpty
        assertThat(expression.extractMostRecentEmailReplyText()).isEmpty
        assertThat(expression.extractMostRecentPlainTextEmailReply()).isEmpty
        assertThat(expression.setContainsString()).isEmpty
        assertThat(expression.isEngagementType()).isEmpty
        assertThat(expression.formatFullName()).isEmpty
        assertThat(expression.absoluteValue()).isEmpty
        assertThat(expression.squareRoot()).isEmpty
        assertThat(expression.power()).contains(power)
        assertThat(expression.substring()).isEmpty
        assertThat(expression.euler()).isEmpty
        assertThat(expression.stringLength()).isEmpty
        assertThat(expression.addTime()).isEmpty
        assertThat(expression.subtractTime()).isEmpty
    }

    @Test
    fun ofPowerRoundtrip() {
        val jsonMapper = jsonMapper()
        val expression =
            Expression.ofPower(
                Power.builder()
                    .operator(Power.Operator.POWER)
                    .addInput(
                        ConstantBoolean.builder()
                            .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                            .inputs(listOf())
                            .propertyName("propertyName")
                            .value(true)
                            .build()
                    )
                    .propertyName("propertyName")
                    .value(0.0)
                    .build()
            )

        val roundtrippedExpression =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(expression),
                jacksonTypeRef<Expression>(),
            )

        assertThat(roundtrippedExpression).isEqualTo(expression)
    }

    @Test
    fun ofSubstring() {
        val substring =
            Substring.builder()
                .operator(Substring.Operator.SUBSTRING)
                .stringToCheck(
                    ConstantBoolean.builder()
                        .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                        .inputs(listOf())
                        .propertyName("propertyName")
                        .value(true)
                        .build()
                )
                .inputs(listOf())
                .propertyName("propertyName")
                .value("value")
                .build()

        val expression = Expression.ofSubstring(substring)

        assertThat(expression.constantBoolean()).isEmpty
        assertThat(expression.constantNumber()).isEmpty
        assertThat(expression.constantString()).isEmpty
        assertThat(expression.booleanPropertyVariable()).isEmpty
        assertThat(expression.stringPropertyVariable()).isEmpty
        assertThat(expression.numberPropertyVariable()).isEmpty
        assertThat(expression.timestampOfPropertyVariable()).isEmpty
        assertThat(expression.booleanTargetPropertyVariable()).isEmpty
        assertThat(expression.stringTargetPropertyVariable()).isEmpty
        assertThat(expression.numberTargetPropertyVariable()).isEmpty
        assertThat(expression.timestampOfTargetPropertyVariable()).isEmpty
        assertThat(expression.addNumbers()).isEmpty
        assertThat(expression.subtractNumbers()).isEmpty
        assertThat(expression.multiplyNumbers()).isEmpty
        assertThat(expression.divideNumbers()).isEmpty
        assertThat(expression.roundDownNumbers()).isEmpty
        assertThat(expression.roundUpNumbers()).isEmpty
        assertThat(expression.roundNearestNumbers()).isEmpty
        assertThat(expression.upperCase()).isEmpty
        assertThat(expression.lowerCase()).isEmpty
        assertThat(expression.concatStrings()).isEmpty
        assertThat(expression.contains()).isEmpty
        assertThat(expression.beginsWith()).isEmpty
        assertThat(expression.numberToString()).isEmpty
        assertThat(expression.parseNumber()).isEmpty
        assertThat(expression.fetchExchangeRate()).isEmpty
        assertThat(expression.fetchCurrencyDecimalPlaces()).isEmpty
        assertThat(expression.fetchSingleCurrencyPortalCurrency()).isEmpty
        assertThat(expression.datedExchangeRate()).isEmpty
        assertThat(expression.pipelineProbability()).isEmpty
        assertThat(expression.maxNumbers()).isEmpty
        assertThat(expression.minNumbers()).isEmpty
        assertThat(expression.lessThan()).isEmpty
        assertThat(expression.lessThanOrEqual()).isEmpty
        assertThat(expression.moreThan()).isEmpty
        assertThat(expression.moreThanOrEqual()).isEmpty
        assertThat(expression.numberEquals()).isEmpty
        assertThat(expression.stringEquals()).isEmpty
        assertThat(expression.isPipelineStageClosed()).isEmpty
        assertThat(expression.not()).isEmpty
        assertThat(expression.date()).isEmpty
        assertThat(expression.month()).isEmpty
        assertThat(expression.year()).isEmpty
        assertThat(expression.now()).isEmpty
        assertThat(expression.timeBetween()).isEmpty
        assertThat(expression.periodToMonths()).isEmpty
        assertThat(expression.periodToWeeks()).isEmpty
        assertThat(expression.and()).isEmpty
        assertThat(expression.or()).isEmpty
        assertThat(expression.xor()).isEmpty
        assertThat(expression.ifString()).isEmpty
        assertThat(expression.ifNumber()).isEmpty
        assertThat(expression.ifBoolean()).isEmpty
        assertThat(expression.isPresent()).isEmpty
        assertThat(expression.hasEmailReply()).isEmpty
        assertThat(expression.hasPlainTextEmailReply()).isEmpty
        assertThat(expression.extractMostRecentEmailReplyHtml()).isEmpty
        assertThat(expression.extractMostRecentEmailReplyText()).isEmpty
        assertThat(expression.extractMostRecentPlainTextEmailReply()).isEmpty
        assertThat(expression.setContainsString()).isEmpty
        assertThat(expression.isEngagementType()).isEmpty
        assertThat(expression.formatFullName()).isEmpty
        assertThat(expression.absoluteValue()).isEmpty
        assertThat(expression.squareRoot()).isEmpty
        assertThat(expression.power()).isEmpty
        assertThat(expression.substring()).contains(substring)
        assertThat(expression.euler()).isEmpty
        assertThat(expression.stringLength()).isEmpty
        assertThat(expression.addTime()).isEmpty
        assertThat(expression.subtractTime()).isEmpty
    }

    @Test
    fun ofSubstringRoundtrip() {
        val jsonMapper = jsonMapper()
        val expression =
            Expression.ofSubstring(
                Substring.builder()
                    .operator(Substring.Operator.SUBSTRING)
                    .stringToCheck(
                        ConstantBoolean.builder()
                            .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                            .inputs(listOf())
                            .propertyName("propertyName")
                            .value(true)
                            .build()
                    )
                    .inputs(listOf())
                    .propertyName("propertyName")
                    .value("value")
                    .build()
            )

        val roundtrippedExpression =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(expression),
                jacksonTypeRef<Expression>(),
            )

        assertThat(roundtrippedExpression).isEqualTo(expression)
    }

    @Test
    fun ofEuler() {
        val euler =
            Euler.builder()
                .operator(Euler.Operator.EULER)
                .addInput(
                    ConstantBoolean.builder()
                        .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                        .inputs(listOf())
                        .propertyName("propertyName")
                        .value(true)
                        .build()
                )
                .propertyName("propertyName")
                .value(0.0)
                .build()

        val expression = Expression.ofEuler(euler)

        assertThat(expression.constantBoolean()).isEmpty
        assertThat(expression.constantNumber()).isEmpty
        assertThat(expression.constantString()).isEmpty
        assertThat(expression.booleanPropertyVariable()).isEmpty
        assertThat(expression.stringPropertyVariable()).isEmpty
        assertThat(expression.numberPropertyVariable()).isEmpty
        assertThat(expression.timestampOfPropertyVariable()).isEmpty
        assertThat(expression.booleanTargetPropertyVariable()).isEmpty
        assertThat(expression.stringTargetPropertyVariable()).isEmpty
        assertThat(expression.numberTargetPropertyVariable()).isEmpty
        assertThat(expression.timestampOfTargetPropertyVariable()).isEmpty
        assertThat(expression.addNumbers()).isEmpty
        assertThat(expression.subtractNumbers()).isEmpty
        assertThat(expression.multiplyNumbers()).isEmpty
        assertThat(expression.divideNumbers()).isEmpty
        assertThat(expression.roundDownNumbers()).isEmpty
        assertThat(expression.roundUpNumbers()).isEmpty
        assertThat(expression.roundNearestNumbers()).isEmpty
        assertThat(expression.upperCase()).isEmpty
        assertThat(expression.lowerCase()).isEmpty
        assertThat(expression.concatStrings()).isEmpty
        assertThat(expression.contains()).isEmpty
        assertThat(expression.beginsWith()).isEmpty
        assertThat(expression.numberToString()).isEmpty
        assertThat(expression.parseNumber()).isEmpty
        assertThat(expression.fetchExchangeRate()).isEmpty
        assertThat(expression.fetchCurrencyDecimalPlaces()).isEmpty
        assertThat(expression.fetchSingleCurrencyPortalCurrency()).isEmpty
        assertThat(expression.datedExchangeRate()).isEmpty
        assertThat(expression.pipelineProbability()).isEmpty
        assertThat(expression.maxNumbers()).isEmpty
        assertThat(expression.minNumbers()).isEmpty
        assertThat(expression.lessThan()).isEmpty
        assertThat(expression.lessThanOrEqual()).isEmpty
        assertThat(expression.moreThan()).isEmpty
        assertThat(expression.moreThanOrEqual()).isEmpty
        assertThat(expression.numberEquals()).isEmpty
        assertThat(expression.stringEquals()).isEmpty
        assertThat(expression.isPipelineStageClosed()).isEmpty
        assertThat(expression.not()).isEmpty
        assertThat(expression.date()).isEmpty
        assertThat(expression.month()).isEmpty
        assertThat(expression.year()).isEmpty
        assertThat(expression.now()).isEmpty
        assertThat(expression.timeBetween()).isEmpty
        assertThat(expression.periodToMonths()).isEmpty
        assertThat(expression.periodToWeeks()).isEmpty
        assertThat(expression.and()).isEmpty
        assertThat(expression.or()).isEmpty
        assertThat(expression.xor()).isEmpty
        assertThat(expression.ifString()).isEmpty
        assertThat(expression.ifNumber()).isEmpty
        assertThat(expression.ifBoolean()).isEmpty
        assertThat(expression.isPresent()).isEmpty
        assertThat(expression.hasEmailReply()).isEmpty
        assertThat(expression.hasPlainTextEmailReply()).isEmpty
        assertThat(expression.extractMostRecentEmailReplyHtml()).isEmpty
        assertThat(expression.extractMostRecentEmailReplyText()).isEmpty
        assertThat(expression.extractMostRecentPlainTextEmailReply()).isEmpty
        assertThat(expression.setContainsString()).isEmpty
        assertThat(expression.isEngagementType()).isEmpty
        assertThat(expression.formatFullName()).isEmpty
        assertThat(expression.absoluteValue()).isEmpty
        assertThat(expression.squareRoot()).isEmpty
        assertThat(expression.power()).isEmpty
        assertThat(expression.substring()).isEmpty
        assertThat(expression.euler()).contains(euler)
        assertThat(expression.stringLength()).isEmpty
        assertThat(expression.addTime()).isEmpty
        assertThat(expression.subtractTime()).isEmpty
    }

    @Test
    fun ofEulerRoundtrip() {
        val jsonMapper = jsonMapper()
        val expression =
            Expression.ofEuler(
                Euler.builder()
                    .operator(Euler.Operator.EULER)
                    .addInput(
                        ConstantBoolean.builder()
                            .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                            .inputs(listOf())
                            .propertyName("propertyName")
                            .value(true)
                            .build()
                    )
                    .propertyName("propertyName")
                    .value(0.0)
                    .build()
            )

        val roundtrippedExpression =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(expression),
                jacksonTypeRef<Expression>(),
            )

        assertThat(roundtrippedExpression).isEqualTo(expression)
    }

    @Test
    fun ofStringLength() {
        val stringLength =
            StringLength.builder()
                .operator(StringLength.Operator.STRING_LENGTH)
                .addInput(
                    ConstantBoolean.builder()
                        .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                        .inputs(listOf())
                        .propertyName("propertyName")
                        .value(true)
                        .build()
                )
                .propertyName("propertyName")
                .value(0.0)
                .build()

        val expression = Expression.ofStringLength(stringLength)

        assertThat(expression.constantBoolean()).isEmpty
        assertThat(expression.constantNumber()).isEmpty
        assertThat(expression.constantString()).isEmpty
        assertThat(expression.booleanPropertyVariable()).isEmpty
        assertThat(expression.stringPropertyVariable()).isEmpty
        assertThat(expression.numberPropertyVariable()).isEmpty
        assertThat(expression.timestampOfPropertyVariable()).isEmpty
        assertThat(expression.booleanTargetPropertyVariable()).isEmpty
        assertThat(expression.stringTargetPropertyVariable()).isEmpty
        assertThat(expression.numberTargetPropertyVariable()).isEmpty
        assertThat(expression.timestampOfTargetPropertyVariable()).isEmpty
        assertThat(expression.addNumbers()).isEmpty
        assertThat(expression.subtractNumbers()).isEmpty
        assertThat(expression.multiplyNumbers()).isEmpty
        assertThat(expression.divideNumbers()).isEmpty
        assertThat(expression.roundDownNumbers()).isEmpty
        assertThat(expression.roundUpNumbers()).isEmpty
        assertThat(expression.roundNearestNumbers()).isEmpty
        assertThat(expression.upperCase()).isEmpty
        assertThat(expression.lowerCase()).isEmpty
        assertThat(expression.concatStrings()).isEmpty
        assertThat(expression.contains()).isEmpty
        assertThat(expression.beginsWith()).isEmpty
        assertThat(expression.numberToString()).isEmpty
        assertThat(expression.parseNumber()).isEmpty
        assertThat(expression.fetchExchangeRate()).isEmpty
        assertThat(expression.fetchCurrencyDecimalPlaces()).isEmpty
        assertThat(expression.fetchSingleCurrencyPortalCurrency()).isEmpty
        assertThat(expression.datedExchangeRate()).isEmpty
        assertThat(expression.pipelineProbability()).isEmpty
        assertThat(expression.maxNumbers()).isEmpty
        assertThat(expression.minNumbers()).isEmpty
        assertThat(expression.lessThan()).isEmpty
        assertThat(expression.lessThanOrEqual()).isEmpty
        assertThat(expression.moreThan()).isEmpty
        assertThat(expression.moreThanOrEqual()).isEmpty
        assertThat(expression.numberEquals()).isEmpty
        assertThat(expression.stringEquals()).isEmpty
        assertThat(expression.isPipelineStageClosed()).isEmpty
        assertThat(expression.not()).isEmpty
        assertThat(expression.date()).isEmpty
        assertThat(expression.month()).isEmpty
        assertThat(expression.year()).isEmpty
        assertThat(expression.now()).isEmpty
        assertThat(expression.timeBetween()).isEmpty
        assertThat(expression.periodToMonths()).isEmpty
        assertThat(expression.periodToWeeks()).isEmpty
        assertThat(expression.and()).isEmpty
        assertThat(expression.or()).isEmpty
        assertThat(expression.xor()).isEmpty
        assertThat(expression.ifString()).isEmpty
        assertThat(expression.ifNumber()).isEmpty
        assertThat(expression.ifBoolean()).isEmpty
        assertThat(expression.isPresent()).isEmpty
        assertThat(expression.hasEmailReply()).isEmpty
        assertThat(expression.hasPlainTextEmailReply()).isEmpty
        assertThat(expression.extractMostRecentEmailReplyHtml()).isEmpty
        assertThat(expression.extractMostRecentEmailReplyText()).isEmpty
        assertThat(expression.extractMostRecentPlainTextEmailReply()).isEmpty
        assertThat(expression.setContainsString()).isEmpty
        assertThat(expression.isEngagementType()).isEmpty
        assertThat(expression.formatFullName()).isEmpty
        assertThat(expression.absoluteValue()).isEmpty
        assertThat(expression.squareRoot()).isEmpty
        assertThat(expression.power()).isEmpty
        assertThat(expression.substring()).isEmpty
        assertThat(expression.euler()).isEmpty
        assertThat(expression.stringLength()).contains(stringLength)
        assertThat(expression.addTime()).isEmpty
        assertThat(expression.subtractTime()).isEmpty
    }

    @Test
    fun ofStringLengthRoundtrip() {
        val jsonMapper = jsonMapper()
        val expression =
            Expression.ofStringLength(
                StringLength.builder()
                    .operator(StringLength.Operator.STRING_LENGTH)
                    .addInput(
                        ConstantBoolean.builder()
                            .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                            .inputs(listOf())
                            .propertyName("propertyName")
                            .value(true)
                            .build()
                    )
                    .propertyName("propertyName")
                    .value(0.0)
                    .build()
            )

        val roundtrippedExpression =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(expression),
                jacksonTypeRef<Expression>(),
            )

        assertThat(roundtrippedExpression).isEqualTo(expression)
    }

    @Test
    fun ofAddTime() {
        val addTime =
            AddTime.builder()
                .operator(AddTime.Operator.ADD_TIME)
                .stringToCheck(
                    ConstantBoolean.builder()
                        .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                        .inputs(listOf())
                        .propertyName("propertyName")
                        .value(true)
                        .build()
                )
                .inputs(listOf())
                .propertyName("propertyName")
                .value(0.0)
                .build()

        val expression = Expression.ofAddTime(addTime)

        assertThat(expression.constantBoolean()).isEmpty
        assertThat(expression.constantNumber()).isEmpty
        assertThat(expression.constantString()).isEmpty
        assertThat(expression.booleanPropertyVariable()).isEmpty
        assertThat(expression.stringPropertyVariable()).isEmpty
        assertThat(expression.numberPropertyVariable()).isEmpty
        assertThat(expression.timestampOfPropertyVariable()).isEmpty
        assertThat(expression.booleanTargetPropertyVariable()).isEmpty
        assertThat(expression.stringTargetPropertyVariable()).isEmpty
        assertThat(expression.numberTargetPropertyVariable()).isEmpty
        assertThat(expression.timestampOfTargetPropertyVariable()).isEmpty
        assertThat(expression.addNumbers()).isEmpty
        assertThat(expression.subtractNumbers()).isEmpty
        assertThat(expression.multiplyNumbers()).isEmpty
        assertThat(expression.divideNumbers()).isEmpty
        assertThat(expression.roundDownNumbers()).isEmpty
        assertThat(expression.roundUpNumbers()).isEmpty
        assertThat(expression.roundNearestNumbers()).isEmpty
        assertThat(expression.upperCase()).isEmpty
        assertThat(expression.lowerCase()).isEmpty
        assertThat(expression.concatStrings()).isEmpty
        assertThat(expression.contains()).isEmpty
        assertThat(expression.beginsWith()).isEmpty
        assertThat(expression.numberToString()).isEmpty
        assertThat(expression.parseNumber()).isEmpty
        assertThat(expression.fetchExchangeRate()).isEmpty
        assertThat(expression.fetchCurrencyDecimalPlaces()).isEmpty
        assertThat(expression.fetchSingleCurrencyPortalCurrency()).isEmpty
        assertThat(expression.datedExchangeRate()).isEmpty
        assertThat(expression.pipelineProbability()).isEmpty
        assertThat(expression.maxNumbers()).isEmpty
        assertThat(expression.minNumbers()).isEmpty
        assertThat(expression.lessThan()).isEmpty
        assertThat(expression.lessThanOrEqual()).isEmpty
        assertThat(expression.moreThan()).isEmpty
        assertThat(expression.moreThanOrEqual()).isEmpty
        assertThat(expression.numberEquals()).isEmpty
        assertThat(expression.stringEquals()).isEmpty
        assertThat(expression.isPipelineStageClosed()).isEmpty
        assertThat(expression.not()).isEmpty
        assertThat(expression.date()).isEmpty
        assertThat(expression.month()).isEmpty
        assertThat(expression.year()).isEmpty
        assertThat(expression.now()).isEmpty
        assertThat(expression.timeBetween()).isEmpty
        assertThat(expression.periodToMonths()).isEmpty
        assertThat(expression.periodToWeeks()).isEmpty
        assertThat(expression.and()).isEmpty
        assertThat(expression.or()).isEmpty
        assertThat(expression.xor()).isEmpty
        assertThat(expression.ifString()).isEmpty
        assertThat(expression.ifNumber()).isEmpty
        assertThat(expression.ifBoolean()).isEmpty
        assertThat(expression.isPresent()).isEmpty
        assertThat(expression.hasEmailReply()).isEmpty
        assertThat(expression.hasPlainTextEmailReply()).isEmpty
        assertThat(expression.extractMostRecentEmailReplyHtml()).isEmpty
        assertThat(expression.extractMostRecentEmailReplyText()).isEmpty
        assertThat(expression.extractMostRecentPlainTextEmailReply()).isEmpty
        assertThat(expression.setContainsString()).isEmpty
        assertThat(expression.isEngagementType()).isEmpty
        assertThat(expression.formatFullName()).isEmpty
        assertThat(expression.absoluteValue()).isEmpty
        assertThat(expression.squareRoot()).isEmpty
        assertThat(expression.power()).isEmpty
        assertThat(expression.substring()).isEmpty
        assertThat(expression.euler()).isEmpty
        assertThat(expression.stringLength()).isEmpty
        assertThat(expression.addTime()).contains(addTime)
        assertThat(expression.subtractTime()).isEmpty
    }

    @Test
    fun ofAddTimeRoundtrip() {
        val jsonMapper = jsonMapper()
        val expression =
            Expression.ofAddTime(
                AddTime.builder()
                    .operator(AddTime.Operator.ADD_TIME)
                    .stringToCheck(
                        ConstantBoolean.builder()
                            .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                            .inputs(listOf())
                            .propertyName("propertyName")
                            .value(true)
                            .build()
                    )
                    .inputs(listOf())
                    .propertyName("propertyName")
                    .value(0.0)
                    .build()
            )

        val roundtrippedExpression =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(expression),
                jacksonTypeRef<Expression>(),
            )

        assertThat(roundtrippedExpression).isEqualTo(expression)
    }

    @Test
    fun ofSubtractTime() {
        val subtractTime =
            SubtractTime.builder()
                .operator(SubtractTime.Operator.SUBTRACT_TIME)
                .stringToCheck(
                    ConstantBoolean.builder()
                        .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                        .inputs(listOf())
                        .propertyName("propertyName")
                        .value(true)
                        .build()
                )
                .inputs(listOf())
                .propertyName("propertyName")
                .value(0.0)
                .build()

        val expression = Expression.ofSubtractTime(subtractTime)

        assertThat(expression.constantBoolean()).isEmpty
        assertThat(expression.constantNumber()).isEmpty
        assertThat(expression.constantString()).isEmpty
        assertThat(expression.booleanPropertyVariable()).isEmpty
        assertThat(expression.stringPropertyVariable()).isEmpty
        assertThat(expression.numberPropertyVariable()).isEmpty
        assertThat(expression.timestampOfPropertyVariable()).isEmpty
        assertThat(expression.booleanTargetPropertyVariable()).isEmpty
        assertThat(expression.stringTargetPropertyVariable()).isEmpty
        assertThat(expression.numberTargetPropertyVariable()).isEmpty
        assertThat(expression.timestampOfTargetPropertyVariable()).isEmpty
        assertThat(expression.addNumbers()).isEmpty
        assertThat(expression.subtractNumbers()).isEmpty
        assertThat(expression.multiplyNumbers()).isEmpty
        assertThat(expression.divideNumbers()).isEmpty
        assertThat(expression.roundDownNumbers()).isEmpty
        assertThat(expression.roundUpNumbers()).isEmpty
        assertThat(expression.roundNearestNumbers()).isEmpty
        assertThat(expression.upperCase()).isEmpty
        assertThat(expression.lowerCase()).isEmpty
        assertThat(expression.concatStrings()).isEmpty
        assertThat(expression.contains()).isEmpty
        assertThat(expression.beginsWith()).isEmpty
        assertThat(expression.numberToString()).isEmpty
        assertThat(expression.parseNumber()).isEmpty
        assertThat(expression.fetchExchangeRate()).isEmpty
        assertThat(expression.fetchCurrencyDecimalPlaces()).isEmpty
        assertThat(expression.fetchSingleCurrencyPortalCurrency()).isEmpty
        assertThat(expression.datedExchangeRate()).isEmpty
        assertThat(expression.pipelineProbability()).isEmpty
        assertThat(expression.maxNumbers()).isEmpty
        assertThat(expression.minNumbers()).isEmpty
        assertThat(expression.lessThan()).isEmpty
        assertThat(expression.lessThanOrEqual()).isEmpty
        assertThat(expression.moreThan()).isEmpty
        assertThat(expression.moreThanOrEqual()).isEmpty
        assertThat(expression.numberEquals()).isEmpty
        assertThat(expression.stringEquals()).isEmpty
        assertThat(expression.isPipelineStageClosed()).isEmpty
        assertThat(expression.not()).isEmpty
        assertThat(expression.date()).isEmpty
        assertThat(expression.month()).isEmpty
        assertThat(expression.year()).isEmpty
        assertThat(expression.now()).isEmpty
        assertThat(expression.timeBetween()).isEmpty
        assertThat(expression.periodToMonths()).isEmpty
        assertThat(expression.periodToWeeks()).isEmpty
        assertThat(expression.and()).isEmpty
        assertThat(expression.or()).isEmpty
        assertThat(expression.xor()).isEmpty
        assertThat(expression.ifString()).isEmpty
        assertThat(expression.ifNumber()).isEmpty
        assertThat(expression.ifBoolean()).isEmpty
        assertThat(expression.isPresent()).isEmpty
        assertThat(expression.hasEmailReply()).isEmpty
        assertThat(expression.hasPlainTextEmailReply()).isEmpty
        assertThat(expression.extractMostRecentEmailReplyHtml()).isEmpty
        assertThat(expression.extractMostRecentEmailReplyText()).isEmpty
        assertThat(expression.extractMostRecentPlainTextEmailReply()).isEmpty
        assertThat(expression.setContainsString()).isEmpty
        assertThat(expression.isEngagementType()).isEmpty
        assertThat(expression.formatFullName()).isEmpty
        assertThat(expression.absoluteValue()).isEmpty
        assertThat(expression.squareRoot()).isEmpty
        assertThat(expression.power()).isEmpty
        assertThat(expression.substring()).isEmpty
        assertThat(expression.euler()).isEmpty
        assertThat(expression.stringLength()).isEmpty
        assertThat(expression.addTime()).isEmpty
        assertThat(expression.subtractTime()).contains(subtractTime)
    }

    @Test
    fun ofSubtractTimeRoundtrip() {
        val jsonMapper = jsonMapper()
        val expression =
            Expression.ofSubtractTime(
                SubtractTime.builder()
                    .operator(SubtractTime.Operator.SUBTRACT_TIME)
                    .stringToCheck(
                        ConstantBoolean.builder()
                            .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                            .inputs(listOf())
                            .propertyName("propertyName")
                            .value(true)
                            .build()
                    )
                    .inputs(listOf())
                    .propertyName("propertyName")
                    .value(0.0)
                    .build()
            )

        val roundtrippedExpression =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(expression),
                jacksonTypeRef<Expression>(),
            )

        assertThat(roundtrippedExpression).isEqualTo(expression)
    }

    enum class IncompatibleJsonShapeTestCase(val value: JsonValue) {
        BOOLEAN(JsonValue.from(false)),
        STRING(JsonValue.from("invalid")),
        INTEGER(JsonValue.from(-1)),
        FLOAT(JsonValue.from(3.14)),
        ARRAY(JsonValue.from(listOf("invalid", "array"))),
    }

    @ParameterizedTest
    @EnumSource
    fun incompatibleJsonShapeDeserializesToUnknown(testCase: IncompatibleJsonShapeTestCase) {
        val expression = jsonMapper().convertValue(testCase.value, jacksonTypeRef<Expression>())

        val e = assertThrows<HubspotInvalidDataException> { expression.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
