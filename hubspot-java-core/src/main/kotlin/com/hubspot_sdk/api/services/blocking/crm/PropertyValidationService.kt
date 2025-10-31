// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.crm.propertyvalidations.PropertyValidationGetParams
import com.hubspot_sdk.api.models.crm.propertyvalidations.PropertyValidationGetResponse
import com.hubspot_sdk.api.models.crm.propertyvalidations.PropertyValidationListParams
import com.hubspot_sdk.api.models.crm.propertyvalidations.PropertyValidationListResponse
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
    fun list(objectTypeId: String): PropertyValidationListResponse =
        list(objectTypeId, PropertyValidationListParams.none())

    /** @see list */
    fun list(
        objectTypeId: String,
        params: PropertyValidationListParams = PropertyValidationListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PropertyValidationListResponse =
        list(params.toBuilder().objectTypeId(objectTypeId).build(), requestOptions)

    /** @see list */
    fun list(
        objectTypeId: String,
        params: PropertyValidationListParams = PropertyValidationListParams.none(),
    ): PropertyValidationListResponse = list(objectTypeId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: PropertyValidationListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PropertyValidationListResponse

    /** @see list */
    fun list(params: PropertyValidationListParams): PropertyValidationListResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(objectTypeId: String, requestOptions: RequestOptions): PropertyValidationListResponse =
        list(objectTypeId, PropertyValidationListParams.none(), requestOptions)

    /** Read a property's validation rules identified by {propertyName}. */
    fun get(
        propertyName: String,
        params: PropertyValidationGetParams,
    ): PropertyValidationGetResponse = get(propertyName, params, RequestOptions.none())

    /** @see get */
    fun get(
        propertyName: String,
        params: PropertyValidationGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PropertyValidationGetResponse =
        get(params.toBuilder().propertyName(propertyName).build(), requestOptions)

    /** @see get */
    fun get(params: PropertyValidationGetParams): PropertyValidationGetResponse =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(
        params: PropertyValidationGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PropertyValidationGetResponse

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
        fun list(objectTypeId: String): HttpResponseFor<PropertyValidationListResponse> =
            list(objectTypeId, PropertyValidationListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            objectTypeId: String,
            params: PropertyValidationListParams = PropertyValidationListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PropertyValidationListResponse> =
            list(params.toBuilder().objectTypeId(objectTypeId).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            objectTypeId: String,
            params: PropertyValidationListParams = PropertyValidationListParams.none(),
        ): HttpResponseFor<PropertyValidationListResponse> =
            list(objectTypeId, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: PropertyValidationListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PropertyValidationListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: PropertyValidationListParams
        ): HttpResponseFor<PropertyValidationListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            objectTypeId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PropertyValidationListResponse> =
            list(objectTypeId, PropertyValidationListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /crm/v3/property-validations/{objectTypeId}/{propertyName}`, but is otherwise the same as
         * [PropertyValidationService.get].
         */
        @MustBeClosed
        fun get(
            propertyName: String,
            params: PropertyValidationGetParams,
        ): HttpResponseFor<PropertyValidationGetResponse> =
            get(propertyName, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            propertyName: String,
            params: PropertyValidationGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PropertyValidationGetResponse> =
            get(params.toBuilder().propertyName(propertyName).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            params: PropertyValidationGetParams
        ): HttpResponseFor<PropertyValidationGetResponse> = get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: PropertyValidationGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PropertyValidationGetResponse>
    }
}
