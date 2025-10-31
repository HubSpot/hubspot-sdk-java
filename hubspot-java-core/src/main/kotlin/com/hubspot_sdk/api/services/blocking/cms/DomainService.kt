// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.cms

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.cms.domains.Domain
import com.hubspot_sdk.api.models.cms.domains.DomainGetParams
import com.hubspot_sdk.api.models.cms.domains.DomainListPage
import com.hubspot_sdk.api.models.cms.domains.DomainListParams
import java.util.function.Consumer

interface DomainService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DomainService

    /**
     * Returns all existing domains that have been created. Results can be limited and filtered by
     * creation or updated date.
     */
    fun list(): DomainListPage = list(DomainListParams.none())

    /** @see list */
    fun list(
        params: DomainListParams = DomainListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DomainListPage

    /** @see list */
    fun list(params: DomainListParams = DomainListParams.none()): DomainListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): DomainListPage =
        list(DomainListParams.none(), requestOptions)

    /** Returns a single domains with the id specified. */
    fun get(domainId: String): Domain = get(domainId, DomainGetParams.none())

    /** @see get */
    fun get(
        domainId: String,
        params: DomainGetParams = DomainGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Domain = get(params.toBuilder().domainId(domainId).build(), requestOptions)

    /** @see get */
    fun get(domainId: String, params: DomainGetParams = DomainGetParams.none()): Domain =
        get(domainId, params, RequestOptions.none())

    /** @see get */
    fun get(params: DomainGetParams, requestOptions: RequestOptions = RequestOptions.none()): Domain

    /** @see get */
    fun get(params: DomainGetParams): Domain = get(params, RequestOptions.none())

    /** @see get */
    fun get(domainId: String, requestOptions: RequestOptions): Domain =
        get(domainId, DomainGetParams.none(), requestOptions)

    /** A view of [DomainService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): DomainService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /cms/v3/domains/`, but is otherwise the same as
         * [DomainService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<DomainListPage> = list(DomainListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: DomainListParams = DomainListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DomainListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: DomainListParams = DomainListParams.none()
        ): HttpResponseFor<DomainListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<DomainListPage> =
            list(DomainListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /cms/v3/domains/{domainId}`, but is otherwise the
         * same as [DomainService.get].
         */
        @MustBeClosed
        fun get(domainId: String): HttpResponseFor<Domain> = get(domainId, DomainGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            domainId: String,
            params: DomainGetParams = DomainGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Domain> =
            get(params.toBuilder().domainId(domainId).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            domainId: String,
            params: DomainGetParams = DomainGetParams.none(),
        ): HttpResponseFor<Domain> = get(domainId, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: DomainGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Domain>

        /** @see get */
        @MustBeClosed
        fun get(params: DomainGetParams): HttpResponseFor<Domain> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(domainId: String, requestOptions: RequestOptions): HttpResponseFor<Domain> =
            get(domainId, DomainGetParams.none(), requestOptions)
    }
}
