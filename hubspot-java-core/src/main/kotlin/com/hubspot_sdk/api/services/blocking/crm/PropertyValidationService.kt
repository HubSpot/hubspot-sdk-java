// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.crm.propertyvalidations.CollectionResponsePublicPropertyValidationRuleMapNoPaging
import com.hubspot_sdk.api.models.crm.propertyvalidations.CollectionResponsePublicPropertyValidationRuleNoPaging
import com.hubspot_sdk.api.models.crm.propertyvalidations.PropertyValidationCrmV3PropertyValidationsObjectTypeIdPropertyNameRuleTypeRuleTypeParams
import com.hubspot_sdk.api.models.crm.propertyvalidations.PropertyValidationGetParams
import com.hubspot_sdk.api.models.crm.propertyvalidations.PropertyValidationListParams
import java.util.function.Consumer

interface PropertyValidationService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PropertyValidationService

    /** Read all properties with validation rules for a given object. */
    fun list(objectTypeId: String): CollectionResponsePublicPropertyValidationRuleMapNoPaging =
        list(objectTypeId, PropertyValidationListParams.none())

    /** @see list */
    fun list(
        objectTypeId: String,
        params: PropertyValidationListParams = PropertyValidationListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponsePublicPropertyValidationRuleMapNoPaging =
        list(params.toBuilder().objectTypeId(objectTypeId).build(), requestOptions)

    /** @see list */
    fun list(
        objectTypeId: String,
        params: PropertyValidationListParams = PropertyValidationListParams.none(),
    ): CollectionResponsePublicPropertyValidationRuleMapNoPaging =
        list(objectTypeId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: PropertyValidationListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponsePublicPropertyValidationRuleMapNoPaging

    /** @see list */
    fun list(
        params: PropertyValidationListParams
    ): CollectionResponsePublicPropertyValidationRuleMapNoPaging =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        objectTypeId: String,
        requestOptions: RequestOptions,
    ): CollectionResponsePublicPropertyValidationRuleMapNoPaging =
        list(objectTypeId, PropertyValidationListParams.none(), requestOptions)

    fun crmV3PropertyValidationsObjectTypeIdPropertyNameRuleTypeRuleType(
        ruleType:
            PropertyValidationCrmV3PropertyValidationsObjectTypeIdPropertyNameRuleTypeRuleTypeParams.RuleType,
        params:
            PropertyValidationCrmV3PropertyValidationsObjectTypeIdPropertyNameRuleTypeRuleTypeParams,
    ) =
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
    ) =
        crmV3PropertyValidationsObjectTypeIdPropertyNameRuleTypeRuleType(
            params.toBuilder().ruleType(ruleType).build(),
            requestOptions,
        )

    /** @see crmV3PropertyValidationsObjectTypeIdPropertyNameRuleTypeRuleType */
    fun crmV3PropertyValidationsObjectTypeIdPropertyNameRuleTypeRuleType(
        params:
            PropertyValidationCrmV3PropertyValidationsObjectTypeIdPropertyNameRuleTypeRuleTypeParams
    ) =
        crmV3PropertyValidationsObjectTypeIdPropertyNameRuleTypeRuleType(
            params,
            RequestOptions.none(),
        )

    /** @see crmV3PropertyValidationsObjectTypeIdPropertyNameRuleTypeRuleType */
    fun crmV3PropertyValidationsObjectTypeIdPropertyNameRuleTypeRuleType(
        params:
            PropertyValidationCrmV3PropertyValidationsObjectTypeIdPropertyNameRuleTypeRuleTypeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** Read a property's validation rules identified by {propertyName}. */
    fun get(
        propertyName: String,
        params: PropertyValidationGetParams,
    ): CollectionResponsePublicPropertyValidationRuleNoPaging =
        get(propertyName, params, RequestOptions.none())

    /** @see get */
    fun get(
        propertyName: String,
        params: PropertyValidationGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponsePublicPropertyValidationRuleNoPaging =
        get(params.toBuilder().propertyName(propertyName).build(), requestOptions)

    /** @see get */
    fun get(
        params: PropertyValidationGetParams
    ): CollectionResponsePublicPropertyValidationRuleNoPaging = get(params, RequestOptions.none())

    /** @see get */
    fun get(
        params: PropertyValidationGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponsePublicPropertyValidationRuleNoPaging

    /**
     * A view of [PropertyValidationService] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PropertyValidationService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /crm/v3/property-validations/{objectTypeId}`, but is
         * otherwise the same as [PropertyValidationService.list].
         */
        @MustBeClosed
        fun list(
            objectTypeId: String
        ): HttpResponseFor<CollectionResponsePublicPropertyValidationRuleMapNoPaging> =
            list(objectTypeId, PropertyValidationListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            objectTypeId: String,
            params: PropertyValidationListParams = PropertyValidationListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponsePublicPropertyValidationRuleMapNoPaging> =
            list(params.toBuilder().objectTypeId(objectTypeId).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            objectTypeId: String,
            params: PropertyValidationListParams = PropertyValidationListParams.none(),
        ): HttpResponseFor<CollectionResponsePublicPropertyValidationRuleMapNoPaging> =
            list(objectTypeId, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: PropertyValidationListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponsePublicPropertyValidationRuleMapNoPaging>

        /** @see list */
        @MustBeClosed
        fun list(
            params: PropertyValidationListParams
        ): HttpResponseFor<CollectionResponsePublicPropertyValidationRuleMapNoPaging> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            objectTypeId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CollectionResponsePublicPropertyValidationRuleMapNoPaging> =
            list(objectTypeId, PropertyValidationListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put
         * /crm/v3/property-validations/{objectTypeId}/{propertyName}/rule-type/{ruleType}`, but is
         * otherwise the same as
         * [PropertyValidationService.crmV3PropertyValidationsObjectTypeIdPropertyNameRuleTypeRuleType].
         */
        @MustBeClosed
        fun crmV3PropertyValidationsObjectTypeIdPropertyNameRuleTypeRuleType(
            ruleType:
                PropertyValidationCrmV3PropertyValidationsObjectTypeIdPropertyNameRuleTypeRuleTypeParams.RuleType,
            params:
                PropertyValidationCrmV3PropertyValidationsObjectTypeIdPropertyNameRuleTypeRuleTypeParams,
        ): HttpResponse =
            crmV3PropertyValidationsObjectTypeIdPropertyNameRuleTypeRuleType(
                ruleType,
                params,
                RequestOptions.none(),
            )

        /** @see crmV3PropertyValidationsObjectTypeIdPropertyNameRuleTypeRuleType */
        @MustBeClosed
        fun crmV3PropertyValidationsObjectTypeIdPropertyNameRuleTypeRuleType(
            ruleType:
                PropertyValidationCrmV3PropertyValidationsObjectTypeIdPropertyNameRuleTypeRuleTypeParams.RuleType,
            params:
                PropertyValidationCrmV3PropertyValidationsObjectTypeIdPropertyNameRuleTypeRuleTypeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            crmV3PropertyValidationsObjectTypeIdPropertyNameRuleTypeRuleType(
                params.toBuilder().ruleType(ruleType).build(),
                requestOptions,
            )

        /** @see crmV3PropertyValidationsObjectTypeIdPropertyNameRuleTypeRuleType */
        @MustBeClosed
        fun crmV3PropertyValidationsObjectTypeIdPropertyNameRuleTypeRuleType(
            params:
                PropertyValidationCrmV3PropertyValidationsObjectTypeIdPropertyNameRuleTypeRuleTypeParams
        ): HttpResponse =
            crmV3PropertyValidationsObjectTypeIdPropertyNameRuleTypeRuleType(
                params,
                RequestOptions.none(),
            )

        /** @see crmV3PropertyValidationsObjectTypeIdPropertyNameRuleTypeRuleType */
        @MustBeClosed
        fun crmV3PropertyValidationsObjectTypeIdPropertyNameRuleTypeRuleType(
            params:
                PropertyValidationCrmV3PropertyValidationsObjectTypeIdPropertyNameRuleTypeRuleTypeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get
         * /crm/v3/property-validations/{objectTypeId}/{propertyName}`, but is otherwise the same as
         * [PropertyValidationService.get].
         */
        @MustBeClosed
        fun get(
            propertyName: String,
            params: PropertyValidationGetParams,
        ): HttpResponseFor<CollectionResponsePublicPropertyValidationRuleNoPaging> =
            get(propertyName, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            propertyName: String,
            params: PropertyValidationGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponsePublicPropertyValidationRuleNoPaging> =
            get(params.toBuilder().propertyName(propertyName).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            params: PropertyValidationGetParams
        ): HttpResponseFor<CollectionResponsePublicPropertyValidationRuleNoPaging> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: PropertyValidationGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponsePublicPropertyValidationRuleNoPaging>
    }
}
