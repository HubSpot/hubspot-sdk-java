// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm.objects

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.crm.SimplePublicObject
import com.hubspot_sdk.api.models.crm.objects.CollectionResponseWithTotalSimplePublicObject
import com.hubspot_sdk.api.models.crm.objects.PublicMergeInput
import com.hubspot_sdk.api.models.crm.objects.PublicObjectSearchRequest
import com.hubspot_sdk.api.models.crm.objects.SimplePublicObjectInputForCreate
import com.hubspot_sdk.api.models.crm.objects.SimplePublicObjectWithAssociations
import com.hubspot_sdk.api.models.crm.objects.companies.CompanyCreateParams
import com.hubspot_sdk.api.models.crm.objects.companies.CompanyDeleteParams
import com.hubspot_sdk.api.models.crm.objects.companies.CompanyGetParams
import com.hubspot_sdk.api.models.crm.objects.companies.CompanyListPage
import com.hubspot_sdk.api.models.crm.objects.companies.CompanyListParams
import com.hubspot_sdk.api.models.crm.objects.companies.CompanyMergeParams
import com.hubspot_sdk.api.models.crm.objects.companies.CompanySearchParams
import com.hubspot_sdk.api.models.crm.objects.companies.CompanyUpdateParams
import com.hubspot_sdk.api.services.blocking.crm.objects.companies.BatchService
import java.util.function.Consumer

interface CompanyService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CompanyService

    fun batch(): BatchService

    /**
     * Create a single company. Include a `properties` object to define
     * [property values](https://developers.hubspot.com/docs/guides/api/crm/properties) for the
     * company, along with an `associations` array to define
     * [associations](https://developers.hubspot.com/docs/guides/api/crm/associations/associations-v4)
     * with other CRM records.
     */
    fun create(params: CompanyCreateParams): SimplePublicObject =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: CompanyCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObject

    /** @see create */
    fun create(
        simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObject =
        create(
            CompanyCreateParams.builder()
                .simplePublicObjectInputForCreate(simplePublicObjectInputForCreate)
                .build(),
            requestOptions,
        )

    /** @see create */
    fun create(
        simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate
    ): SimplePublicObject = create(simplePublicObjectInputForCreate, RequestOptions.none())

    /**
     * Update a company by ID (`companyId`) or unique property value (`idProperty`). Provided
     * property values will be overwritten. Read-only and non-existent properties will result in an
     * error. Properties values can be cleared by passing an empty string.
     */
    fun update(companyId: String, params: CompanyUpdateParams): SimplePublicObject =
        update(companyId, params, RequestOptions.none())

    /** @see update */
    fun update(
        companyId: String,
        params: CompanyUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObject = update(params.toBuilder().companyId(companyId).build(), requestOptions)

    /** @see update */
    fun update(params: CompanyUpdateParams): SimplePublicObject =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: CompanyUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObject

    /**
     * Retrieve all companies, using query parameters to control the information that gets returned.
     */
    fun list(): CompanyListPage = list(CompanyListParams.none())

    /** @see list */
    fun list(
        params: CompanyListParams = CompanyListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompanyListPage

    /** @see list */
    fun list(params: CompanyListParams = CompanyListParams.none()): CompanyListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompanyListPage =
        list(CompanyListParams.none(), requestOptions)

    /**
     * Delete a company by ID. Deleted companies can be restored within 90 days of deletion. Learn
     * more about
     * [restoring records](https://knowledge.hubspot.com/records/restore-deleted-records).
     */
    fun delete(companyId: String) = delete(companyId, CompanyDeleteParams.none())

    /** @see delete */
    fun delete(
        companyId: String,
        params: CompanyDeleteParams = CompanyDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().companyId(companyId).build(), requestOptions)

    /** @see delete */
    fun delete(companyId: String, params: CompanyDeleteParams = CompanyDeleteParams.none()) =
        delete(companyId, params, RequestOptions.none())

    /** @see delete */
    fun delete(params: CompanyDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: CompanyDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(companyId: String, requestOptions: RequestOptions) =
        delete(companyId, CompanyDeleteParams.none(), requestOptions)

    /**
     * Retrieve a company by its ID (`companyId`) or by a unique property (`idProperty`). You can
     * specify what is returned using the `properties` query parameter.
     */
    fun get(companyId: String): SimplePublicObjectWithAssociations =
        get(companyId, CompanyGetParams.none())

    /** @see get */
    fun get(
        companyId: String,
        params: CompanyGetParams = CompanyGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObjectWithAssociations =
        get(params.toBuilder().companyId(companyId).build(), requestOptions)

    /** @see get */
    fun get(
        companyId: String,
        params: CompanyGetParams = CompanyGetParams.none(),
    ): SimplePublicObjectWithAssociations = get(companyId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: CompanyGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObjectWithAssociations

    /** @see get */
    fun get(params: CompanyGetParams): SimplePublicObjectWithAssociations =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(companyId: String, requestOptions: RequestOptions): SimplePublicObjectWithAssociations =
        get(companyId, CompanyGetParams.none(), requestOptions)

    /**
     * Merge two company records. Learn more about
     * [merging records](https://knowledge.hubspot.com/records/merge-records).
     */
    fun merge(params: CompanyMergeParams): SimplePublicObject = merge(params, RequestOptions.none())

    /** @see merge */
    fun merge(
        params: CompanyMergeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObject

    /** @see merge */
    fun merge(
        publicMergeInput: PublicMergeInput,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObject =
        merge(
            CompanyMergeParams.builder().publicMergeInput(publicMergeInput).build(),
            requestOptions,
        )

    /** @see merge */
    fun merge(publicMergeInput: PublicMergeInput): SimplePublicObject =
        merge(publicMergeInput, RequestOptions.none())

    /**
     * Search for companies by filtering on properties, searching through associations, and sorting
     * results. Learn more about
     * [CRM search](https://developers.hubspot.com/docs/guides/api/crm/search#make-a-search-request).
     */
    fun search(params: CompanySearchParams): CollectionResponseWithTotalSimplePublicObject =
        search(params, RequestOptions.none())

    /** @see search */
    fun search(
        params: CompanySearchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponseWithTotalSimplePublicObject

    /** @see search */
    fun search(
        publicObjectSearchRequest: PublicObjectSearchRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponseWithTotalSimplePublicObject =
        search(
            CompanySearchParams.builder()
                .publicObjectSearchRequest(publicObjectSearchRequest)
                .build(),
            requestOptions,
        )

    /** @see search */
    fun search(
        publicObjectSearchRequest: PublicObjectSearchRequest
    ): CollectionResponseWithTotalSimplePublicObject =
        search(publicObjectSearchRequest, RequestOptions.none())

    /** A view of [CompanyService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): CompanyService.WithRawResponse

        fun batch(): BatchService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /crm/objects/2026-03/companies`, but is otherwise
         * the same as [CompanyService.create].
         */
        @MustBeClosed
        fun create(params: CompanyCreateParams): HttpResponseFor<SimplePublicObject> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: CompanyCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObject>

        /** @see create */
        @MustBeClosed
        fun create(
            simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObject> =
            create(
                CompanyCreateParams.builder()
                    .simplePublicObjectInputForCreate(simplePublicObjectInputForCreate)
                    .build(),
                requestOptions,
            )

        /** @see create */
        @MustBeClosed
        fun create(
            simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate
        ): HttpResponseFor<SimplePublicObject> =
            create(simplePublicObjectInputForCreate, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `patch /crm/objects/2026-03/companies/{companyId}`, but
         * is otherwise the same as [CompanyService.update].
         */
        @MustBeClosed
        fun update(
            companyId: String,
            params: CompanyUpdateParams,
        ): HttpResponseFor<SimplePublicObject> = update(companyId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            companyId: String,
            params: CompanyUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObject> =
            update(params.toBuilder().companyId(companyId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: CompanyUpdateParams): HttpResponseFor<SimplePublicObject> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: CompanyUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObject>

        /**
         * Returns a raw HTTP response for `get /crm/objects/2026-03/companies`, but is otherwise
         * the same as [CompanyService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<CompanyListPage> = list(CompanyListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: CompanyListParams = CompanyListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CompanyListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: CompanyListParams = CompanyListParams.none()
        ): HttpResponseFor<CompanyListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<CompanyListPage> =
            list(CompanyListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /crm/objects/2026-03/companies/{companyId}`, but
         * is otherwise the same as [CompanyService.delete].
         */
        @MustBeClosed
        fun delete(companyId: String): HttpResponse = delete(companyId, CompanyDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            companyId: String,
            params: CompanyDeleteParams = CompanyDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().companyId(companyId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            companyId: String,
            params: CompanyDeleteParams = CompanyDeleteParams.none(),
        ): HttpResponse = delete(companyId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: CompanyDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: CompanyDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(companyId: String, requestOptions: RequestOptions): HttpResponse =
            delete(companyId, CompanyDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /crm/objects/2026-03/companies/{companyId}`, but is
         * otherwise the same as [CompanyService.get].
         */
        @MustBeClosed
        fun get(companyId: String): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(companyId, CompanyGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            companyId: String,
            params: CompanyGetParams = CompanyGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(params.toBuilder().companyId(companyId).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            companyId: String,
            params: CompanyGetParams = CompanyGetParams.none(),
        ): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(companyId, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: CompanyGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObjectWithAssociations>

        /** @see get */
        @MustBeClosed
        fun get(params: CompanyGetParams): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            companyId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(companyId, CompanyGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /crm/objects/2026-03/companies/merge`, but is
         * otherwise the same as [CompanyService.merge].
         */
        @MustBeClosed
        fun merge(params: CompanyMergeParams): HttpResponseFor<SimplePublicObject> =
            merge(params, RequestOptions.none())

        /** @see merge */
        @MustBeClosed
        fun merge(
            params: CompanyMergeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObject>

        /** @see merge */
        @MustBeClosed
        fun merge(
            publicMergeInput: PublicMergeInput,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObject> =
            merge(
                CompanyMergeParams.builder().publicMergeInput(publicMergeInput).build(),
                requestOptions,
            )

        /** @see merge */
        @MustBeClosed
        fun merge(publicMergeInput: PublicMergeInput): HttpResponseFor<SimplePublicObject> =
            merge(publicMergeInput, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /crm/objects/2026-03/companies/search`, but is
         * otherwise the same as [CompanyService.search].
         */
        @MustBeClosed
        fun search(
            params: CompanySearchParams
        ): HttpResponseFor<CollectionResponseWithTotalSimplePublicObject> =
            search(params, RequestOptions.none())

        /** @see search */
        @MustBeClosed
        fun search(
            params: CompanySearchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>

        /** @see search */
        @MustBeClosed
        fun search(
            publicObjectSearchRequest: PublicObjectSearchRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponseWithTotalSimplePublicObject> =
            search(
                CompanySearchParams.builder()
                    .publicObjectSearchRequest(publicObjectSearchRequest)
                    .build(),
                requestOptions,
            )

        /** @see search */
        @MustBeClosed
        fun search(
            publicObjectSearchRequest: PublicObjectSearchRequest
        ): HttpResponseFor<CollectionResponseWithTotalSimplePublicObject> =
            search(publicObjectSearchRequest, RequestOptions.none())
    }
}
