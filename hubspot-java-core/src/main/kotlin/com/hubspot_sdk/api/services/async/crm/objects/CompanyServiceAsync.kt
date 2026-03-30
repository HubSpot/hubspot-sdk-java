// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm.objects

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.crm.CollectionResponseWithTotalSimplePublicObject
import com.hubspot_sdk.api.models.crm.PublicObjectSearchRequest
import com.hubspot_sdk.api.models.crm.SimplePublicObject
import com.hubspot_sdk.api.models.crm.objects.PublicMergeInput
import com.hubspot_sdk.api.models.crm.objects.SimplePublicObjectInputForCreate
import com.hubspot_sdk.api.models.crm.objects.SimplePublicObjectWithAssociations
import com.hubspot_sdk.api.models.crm.objects.companies.CompanyCreateParams
import com.hubspot_sdk.api.models.crm.objects.companies.CompanyDeleteParams
import com.hubspot_sdk.api.models.crm.objects.companies.CompanyGetParams
import com.hubspot_sdk.api.models.crm.objects.companies.CompanyListPageAsync
import com.hubspot_sdk.api.models.crm.objects.companies.CompanyListParams
import com.hubspot_sdk.api.models.crm.objects.companies.CompanyMergeParams
import com.hubspot_sdk.api.models.crm.objects.companies.CompanySearchParams
import com.hubspot_sdk.api.models.crm.objects.companies.CompanyUpdateParams
import com.hubspot_sdk.api.services.async.crm.objects.companies.BatchServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface CompanyServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CompanyServiceAsync

    fun batch(): BatchServiceAsync

    /**
     * Create a single company. Include a `properties` object to define
     * [property values](https://developers.hubspot.com/docs/guides/api/crm/properties) for the
     * company, along with an `associations` array to define
     * [associations](https://developers.hubspot.com/docs/guides/api/crm/associations/associations-v4)
     * with other CRM records.
     */
    fun create(params: CompanyCreateParams): CompletableFuture<SimplePublicObject> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: CompanyCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObject>

    /** @see create */
    fun create(
        simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObject> =
        create(
            CompanyCreateParams.builder()
                .simplePublicObjectInputForCreate(simplePublicObjectInputForCreate)
                .build(),
            requestOptions,
        )

    /** @see create */
    fun create(
        simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate
    ): CompletableFuture<SimplePublicObject> =
        create(simplePublicObjectInputForCreate, RequestOptions.none())

    /**
     * Update a company by ID (`companyId`) or unique property value (`idProperty`). Provided
     * property values will be overwritten. Read-only and non-existent properties will result in an
     * error. Properties values can be cleared by passing an empty string.
     */
    fun update(
        companyId: String,
        params: CompanyUpdateParams,
    ): CompletableFuture<SimplePublicObject> = update(companyId, params, RequestOptions.none())

    /** @see update */
    fun update(
        companyId: String,
        params: CompanyUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObject> =
        update(params.toBuilder().companyId(companyId).build(), requestOptions)

    /** @see update */
    fun update(params: CompanyUpdateParams): CompletableFuture<SimplePublicObject> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: CompanyUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObject>

    /**
     * Retrieve all companies, using query parameters to control the information that gets returned.
     */
    fun list(): CompletableFuture<CompanyListPageAsync> = list(CompanyListParams.none())

    /** @see list */
    fun list(
        params: CompanyListParams = CompanyListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CompanyListPageAsync>

    /** @see list */
    fun list(
        params: CompanyListParams = CompanyListParams.none()
    ): CompletableFuture<CompanyListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<CompanyListPageAsync> =
        list(CompanyListParams.none(), requestOptions)

    /**
     * Delete a company by ID. Deleted companies can be restored within 90 days of deletion. Learn
     * more about
     * [restoring records](https://knowledge.hubspot.com/records/restore-deleted-records).
     */
    fun delete(companyId: String): CompletableFuture<Void?> =
        delete(companyId, CompanyDeleteParams.none())

    /** @see delete */
    fun delete(
        companyId: String,
        params: CompanyDeleteParams = CompanyDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().companyId(companyId).build(), requestOptions)

    /** @see delete */
    fun delete(
        companyId: String,
        params: CompanyDeleteParams = CompanyDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(companyId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: CompanyDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: CompanyDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(companyId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(companyId, CompanyDeleteParams.none(), requestOptions)

    /**
     * Retrieve a company by its ID (`companyId`) or by a unique property (`idProperty`). You can
     * specify what is returned using the `properties` query parameter.
     */
    fun get(companyId: String): CompletableFuture<SimplePublicObjectWithAssociations> =
        get(companyId, CompanyGetParams.none())

    /** @see get */
    fun get(
        companyId: String,
        params: CompanyGetParams = CompanyGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObjectWithAssociations> =
        get(params.toBuilder().companyId(companyId).build(), requestOptions)

    /** @see get */
    fun get(
        companyId: String,
        params: CompanyGetParams = CompanyGetParams.none(),
    ): CompletableFuture<SimplePublicObjectWithAssociations> =
        get(companyId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: CompanyGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObjectWithAssociations>

    /** @see get */
    fun get(params: CompanyGetParams): CompletableFuture<SimplePublicObjectWithAssociations> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(
        companyId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<SimplePublicObjectWithAssociations> =
        get(companyId, CompanyGetParams.none(), requestOptions)

    /**
     * Merge two company records. Learn more about
     * [merging records](https://knowledge.hubspot.com/records/merge-records).
     */
    fun merge(params: CompanyMergeParams): CompletableFuture<SimplePublicObject> =
        merge(params, RequestOptions.none())

    /** @see merge */
    fun merge(
        params: CompanyMergeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObject>

    /** @see merge */
    fun merge(
        publicMergeInput: PublicMergeInput,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObject> =
        merge(
            CompanyMergeParams.builder().publicMergeInput(publicMergeInput).build(),
            requestOptions,
        )

    /** @see merge */
    fun merge(publicMergeInput: PublicMergeInput): CompletableFuture<SimplePublicObject> =
        merge(publicMergeInput, RequestOptions.none())

    /**
     * Search for companies by filtering on properties, searching through associations, and sorting
     * results. Learn more about
     * [CRM search](https://developers.hubspot.com/docs/guides/api/crm/search#make-a-search-request).
     */
    fun search(
        params: CompanySearchParams
    ): CompletableFuture<CollectionResponseWithTotalSimplePublicObject> =
        search(params, RequestOptions.none())

    /** @see search */
    fun search(
        params: CompanySearchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponseWithTotalSimplePublicObject>

    /** @see search */
    fun search(
        publicObjectSearchRequest: PublicObjectSearchRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponseWithTotalSimplePublicObject> =
        search(
            CompanySearchParams.builder()
                .publicObjectSearchRequest(publicObjectSearchRequest)
                .build(),
            requestOptions,
        )

    /** @see search */
    fun search(
        publicObjectSearchRequest: PublicObjectSearchRequest
    ): CompletableFuture<CollectionResponseWithTotalSimplePublicObject> =
        search(publicObjectSearchRequest, RequestOptions.none())

    /**
     * A view of [CompanyServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CompanyServiceAsync.WithRawResponse

        fun batch(): BatchServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /crm/objects/2026-03/companies`, but is otherwise
         * the same as [CompanyServiceAsync.create].
         */
        fun create(
            params: CompanyCreateParams
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: CompanyCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>>

        /** @see create */
        fun create(
            simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            create(
                CompanyCreateParams.builder()
                    .simplePublicObjectInputForCreate(simplePublicObjectInputForCreate)
                    .build(),
                requestOptions,
            )

        /** @see create */
        fun create(
            simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            create(simplePublicObjectInputForCreate, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `patch /crm/objects/2026-03/companies/{companyId}`, but
         * is otherwise the same as [CompanyServiceAsync.update].
         */
        fun update(
            companyId: String,
            params: CompanyUpdateParams,
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            update(companyId, params, RequestOptions.none())

        /** @see update */
        fun update(
            companyId: String,
            params: CompanyUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            update(params.toBuilder().companyId(companyId).build(), requestOptions)

        /** @see update */
        fun update(
            params: CompanyUpdateParams
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: CompanyUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>>

        /**
         * Returns a raw HTTP response for `get /crm/objects/2026-03/companies`, but is otherwise
         * the same as [CompanyServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<CompanyListPageAsync>> =
            list(CompanyListParams.none())

        /** @see list */
        fun list(
            params: CompanyListParams = CompanyListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CompanyListPageAsync>>

        /** @see list */
        fun list(
            params: CompanyListParams = CompanyListParams.none()
        ): CompletableFuture<HttpResponseFor<CompanyListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<CompanyListPageAsync>> =
            list(CompanyListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /crm/objects/2026-03/companies/{companyId}`, but
         * is otherwise the same as [CompanyServiceAsync.delete].
         */
        fun delete(companyId: String): CompletableFuture<HttpResponse> =
            delete(companyId, CompanyDeleteParams.none())

        /** @see delete */
        fun delete(
            companyId: String,
            params: CompanyDeleteParams = CompanyDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().companyId(companyId).build(), requestOptions)

        /** @see delete */
        fun delete(
            companyId: String,
            params: CompanyDeleteParams = CompanyDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(companyId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: CompanyDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: CompanyDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            companyId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            delete(companyId, CompanyDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /crm/objects/2026-03/companies/{companyId}`, but is
         * otherwise the same as [CompanyServiceAsync.get].
         */
        fun get(
            companyId: String
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(companyId, CompanyGetParams.none())

        /** @see get */
        fun get(
            companyId: String,
            params: CompanyGetParams = CompanyGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(params.toBuilder().companyId(companyId).build(), requestOptions)

        /** @see get */
        fun get(
            companyId: String,
            params: CompanyGetParams = CompanyGetParams.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(companyId, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: CompanyGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>>

        /** @see get */
        fun get(
            params: CompanyGetParams
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            companyId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(companyId, CompanyGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /crm/objects/2026-03/companies/merge`, but is
         * otherwise the same as [CompanyServiceAsync.merge].
         */
        fun merge(
            params: CompanyMergeParams
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            merge(params, RequestOptions.none())

        /** @see merge */
        fun merge(
            params: CompanyMergeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>>

        /** @see merge */
        fun merge(
            publicMergeInput: PublicMergeInput,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            merge(
                CompanyMergeParams.builder().publicMergeInput(publicMergeInput).build(),
                requestOptions,
            )

        /** @see merge */
        fun merge(
            publicMergeInput: PublicMergeInput
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            merge(publicMergeInput, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /crm/objects/2026-03/companies/search`, but is
         * otherwise the same as [CompanyServiceAsync.search].
         */
        fun search(
            params: CompanySearchParams
        ): CompletableFuture<HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>> =
            search(params, RequestOptions.none())

        /** @see search */
        fun search(
            params: CompanySearchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>>

        /** @see search */
        fun search(
            publicObjectSearchRequest: PublicObjectSearchRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>> =
            search(
                CompanySearchParams.builder()
                    .publicObjectSearchRequest(publicObjectSearchRequest)
                    .build(),
                requestOptions,
            )

        /** @see search */
        fun search(
            publicObjectSearchRequest: PublicObjectSearchRequest
        ): CompletableFuture<HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>> =
            search(publicObjectSearchRequest, RequestOptions.none())
    }
}
