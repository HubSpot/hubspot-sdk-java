// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.crm.propertyvalidations.CollectionResponsePublicPropertyValidationRuleMapNoPaging
import com.hubspot_sdk.api.models.crm.propertyvalidations.CollectionResponsePublicPropertyValidationRuleNoPaging
import com.hubspot_sdk.api.models.crm.propertyvalidations.PropertyValidationCrmV3PropertyValidationsObjectTypeIdPropertyNameRuleTypeRuleTypeParams
import com.hubspot_sdk.api.models.crm.propertyvalidations.PropertyValidationGetParams
import com.hubspot_sdk.api.models.crm.propertyvalidations.PropertyValidationListParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface PropertyValidationServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PropertyValidationServiceAsync

    /** Read all properties with validation rules for a given object. */
    fun list(
        objectTypeId: String
    ): CompletableFuture<CollectionResponsePublicPropertyValidationRuleMapNoPaging> =
        list(objectTypeId, PropertyValidationListParams.none())

    /** @see list */
    fun list(
        objectTypeId: String,
        params: PropertyValidationListParams = PropertyValidationListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponsePublicPropertyValidationRuleMapNoPaging> =
        list(params.toBuilder().objectTypeId(objectTypeId).build(), requestOptions)

    /** @see list */
    fun list(
        objectTypeId: String,
        params: PropertyValidationListParams = PropertyValidationListParams.none(),
    ): CompletableFuture<CollectionResponsePublicPropertyValidationRuleMapNoPaging> =
        list(objectTypeId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: PropertyValidationListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponsePublicPropertyValidationRuleMapNoPaging>

    /** @see list */
    fun list(
        params: PropertyValidationListParams
    ): CompletableFuture<CollectionResponsePublicPropertyValidationRuleMapNoPaging> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        objectTypeId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<CollectionResponsePublicPropertyValidationRuleMapNoPaging> =
        list(objectTypeId, PropertyValidationListParams.none(), requestOptions)

    fun crmV3PropertyValidationsObjectTypeIdPropertyNameRuleTypeRuleType(
        ruleType:
            PropertyValidationCrmV3PropertyValidationsObjectTypeIdPropertyNameRuleTypeRuleTypeParams.RuleType,
        params:
            PropertyValidationCrmV3PropertyValidationsObjectTypeIdPropertyNameRuleTypeRuleTypeParams,
    ): CompletableFuture<Void?> =
        crmV3PropertyValidationsObjectTypeIdPropertyNameRuleTypeRuleType(
            ruleType,
            params,
            RequestOptions.none(),
        )

    /** @see crmV3PropertyValidationsObjectTypeIdPropertyNameRuleTypeRuleType */
    fun crmV3PropertyValidationsObjectTypeIdPropertyNameRuleTypeRuleType(
        ruleType:
            PropertyValidationCrmV3PropertyValidationsObjectTypeIdPropertyNameRuleTypeRuleTypeParams.RuleType,
        params:
            PropertyValidationCrmV3PropertyValidationsObjectTypeIdPropertyNameRuleTypeRuleTypeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        crmV3PropertyValidationsObjectTypeIdPropertyNameRuleTypeRuleType(
            params.toBuilder().ruleType(ruleType).build(),
            requestOptions,
        )

    /** @see crmV3PropertyValidationsObjectTypeIdPropertyNameRuleTypeRuleType */
    fun crmV3PropertyValidationsObjectTypeIdPropertyNameRuleTypeRuleType(
        params:
            PropertyValidationCrmV3PropertyValidationsObjectTypeIdPropertyNameRuleTypeRuleTypeParams
    ): CompletableFuture<Void?> =
        crmV3PropertyValidationsObjectTypeIdPropertyNameRuleTypeRuleType(
            params,
            RequestOptions.none(),
        )

    /** @see crmV3PropertyValidationsObjectTypeIdPropertyNameRuleTypeRuleType */
    fun crmV3PropertyValidationsObjectTypeIdPropertyNameRuleTypeRuleType(
        params:
            PropertyValidationCrmV3PropertyValidationsObjectTypeIdPropertyNameRuleTypeRuleTypeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** Read a property's validation rules identified by {propertyName}. */
    fun get(
        propertyName: String,
        params: PropertyValidationGetParams,
    ): CompletableFuture<CollectionResponsePublicPropertyValidationRuleNoPaging> =
        get(propertyName, params, RequestOptions.none())

    /** @see get */
    fun get(
        propertyName: String,
        params: PropertyValidationGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponsePublicPropertyValidationRuleNoPaging> =
        get(params.toBuilder().propertyName(propertyName).build(), requestOptions)

    /** @see get */
    fun get(
        params: PropertyValidationGetParams
    ): CompletableFuture<CollectionResponsePublicPropertyValidationRuleNoPaging> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(
        params: PropertyValidationGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponsePublicPropertyValidationRuleNoPaging>

    /**
     * A view of [PropertyValidationServiceAsync] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PropertyValidationServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /crm/v3/property-validations/{objectTypeId}`, but is
         * otherwise the same as [PropertyValidationServiceAsync.list].
         */
        fun list(
            objectTypeId: String
        ): CompletableFuture<
            HttpResponseFor<CollectionResponsePublicPropertyValidationRuleMapNoPaging>
        > = list(objectTypeId, PropertyValidationListParams.none())

        /** @see list */
        fun list(
            objectTypeId: String,
            params: PropertyValidationListParams = PropertyValidationListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<
            HttpResponseFor<CollectionResponsePublicPropertyValidationRuleMapNoPaging>
        > = list(params.toBuilder().objectTypeId(objectTypeId).build(), requestOptions)

        /** @see list */
        fun list(
            objectTypeId: String,
            params: PropertyValidationListParams = PropertyValidationListParams.none(),
        ): CompletableFuture<
            HttpResponseFor<CollectionResponsePublicPropertyValidationRuleMapNoPaging>
        > = list(objectTypeId, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: PropertyValidationListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<
            HttpResponseFor<CollectionResponsePublicPropertyValidationRuleMapNoPaging>
        >

        /** @see list */
        fun list(
            params: PropertyValidationListParams
        ): CompletableFuture<
            HttpResponseFor<CollectionResponsePublicPropertyValidationRuleMapNoPaging>
        > = list(params, RequestOptions.none())

        /** @see list */
        fun list(
            objectTypeId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<
            HttpResponseFor<CollectionResponsePublicPropertyValidationRuleMapNoPaging>
        > = list(objectTypeId, PropertyValidationListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put
         * /crm/v3/property-validations/{objectTypeId}/{propertyName}/rule-type/{ruleType}`, but is
         * otherwise the same as
         * [PropertyValidationServiceAsync.crmV3PropertyValidationsObjectTypeIdPropertyNameRuleTypeRuleType].
         */
        fun crmV3PropertyValidationsObjectTypeIdPropertyNameRuleTypeRuleType(
            ruleType:
                PropertyValidationCrmV3PropertyValidationsObjectTypeIdPropertyNameRuleTypeRuleTypeParams.RuleType,
            params:
                PropertyValidationCrmV3PropertyValidationsObjectTypeIdPropertyNameRuleTypeRuleTypeParams,
        ): CompletableFuture<HttpResponse> =
            crmV3PropertyValidationsObjectTypeIdPropertyNameRuleTypeRuleType(
                ruleType,
                params,
                RequestOptions.none(),
            )

        /** @see crmV3PropertyValidationsObjectTypeIdPropertyNameRuleTypeRuleType */
        fun crmV3PropertyValidationsObjectTypeIdPropertyNameRuleTypeRuleType(
            ruleType:
                PropertyValidationCrmV3PropertyValidationsObjectTypeIdPropertyNameRuleTypeRuleTypeParams.RuleType,
            params:
                PropertyValidationCrmV3PropertyValidationsObjectTypeIdPropertyNameRuleTypeRuleTypeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            crmV3PropertyValidationsObjectTypeIdPropertyNameRuleTypeRuleType(
                params.toBuilder().ruleType(ruleType).build(),
                requestOptions,
            )

        /** @see crmV3PropertyValidationsObjectTypeIdPropertyNameRuleTypeRuleType */
        fun crmV3PropertyValidationsObjectTypeIdPropertyNameRuleTypeRuleType(
            params:
                PropertyValidationCrmV3PropertyValidationsObjectTypeIdPropertyNameRuleTypeRuleTypeParams
        ): CompletableFuture<HttpResponse> =
            crmV3PropertyValidationsObjectTypeIdPropertyNameRuleTypeRuleType(
                params,
                RequestOptions.none(),
            )

        /** @see crmV3PropertyValidationsObjectTypeIdPropertyNameRuleTypeRuleType */
        fun crmV3PropertyValidationsObjectTypeIdPropertyNameRuleTypeRuleType(
            params:
                PropertyValidationCrmV3PropertyValidationsObjectTypeIdPropertyNameRuleTypeRuleTypeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get
         * /crm/v3/property-validations/{objectTypeId}/{propertyName}`, but is otherwise the same as
         * [PropertyValidationServiceAsync.get].
         */
        fun get(
            propertyName: String,
            params: PropertyValidationGetParams,
        ): CompletableFuture<
            HttpResponseFor<CollectionResponsePublicPropertyValidationRuleNoPaging>
        > = get(propertyName, params, RequestOptions.none())

        /** @see get */
        fun get(
            propertyName: String,
            params: PropertyValidationGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<
            HttpResponseFor<CollectionResponsePublicPropertyValidationRuleNoPaging>
        > = get(params.toBuilder().propertyName(propertyName).build(), requestOptions)

        /** @see get */
        fun get(
            params: PropertyValidationGetParams
        ): CompletableFuture<
            HttpResponseFor<CollectionResponsePublicPropertyValidationRuleNoPaging>
        > = get(params, RequestOptions.none())

        /** @see get */
        fun get(
            params: PropertyValidationGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<
            HttpResponseFor<CollectionResponsePublicPropertyValidationRuleNoPaging>
        >
    }
}
