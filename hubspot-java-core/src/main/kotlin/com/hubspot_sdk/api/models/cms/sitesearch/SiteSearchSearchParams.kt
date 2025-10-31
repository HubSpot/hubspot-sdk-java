// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.sitesearch

import com.fasterxml.jackson.annotation.JsonCreator
import com.hubspot_sdk.api.core.Enum
import com.hubspot_sdk.api.core.JsonField
import com.hubspot_sdk.api.core.Params
import com.hubspot_sdk.api.core.http.Headers
import com.hubspot_sdk.api.core.http.QueryParams
import com.hubspot_sdk.api.core.toImmutable
import com.hubspot_sdk.api.errors.HubspotInvalidDataException
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Returns any website content matching the given search criteria for a given HubSpot account.
 * Searches can be filtered by content type, domain, or URL path.
 */
class SiteSearchSearchParams
private constructor(
    private val autocomplete: Boolean?,
    private val boostLimit: Double?,
    private val boostRecent: String?,
    private val domain: List<String>?,
    private val groupId: List<Long>?,
    private val hubdbQuery: String?,
    private val language: Language?,
    private val length: Length?,
    private val limit: Int?,
    private val matchPrefix: Boolean?,
    private val offset: Int?,
    private val pathPrefix: List<String>?,
    private val popularityBoost: Double?,
    private val property: List<String>?,
    private val q: String?,
    private val tableId: Long?,
    private val type: List<Type>?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Specifies whether or not you are showing autocomplete results. Defaults to false. */
    fun autocomplete(): Optional<Boolean> = Optional.ofNullable(autocomplete)

    /**
     * Specifies the maximum amount a result will be boosted based on its view count. Defaults to
     * 5.0. Read more about elasticsearch boosting
     * [here](https://www.elastic.co/guide/en/elasticsearch/reference/current/mapping-boost.html).
     */
    fun boostLimit(): Optional<Double> = Optional.ofNullable(boostLimit)

    /**
     * Specifies a relative time window where scores of documents published outside this time window
     * decay. This can only be used for blog posts. For example, boostRecent=10d will boost
     * documents published within the last 10 days. Supported timeunits are ms (milliseconds), s
     * (seconds), m (minutes), h (hours), d (days).
     */
    fun boostRecent(): Optional<String> = Optional.ofNullable(boostRecent)

    /** A domain to match search results for. Multiple domains can be provided with &. */
    fun domain(): Optional<List<String>> = Optional.ofNullable(domain)

    /**
     * Specifies which blog(s) to be searched by blog ID. Can be used multiple times to search more
     * than one blog.
     */
    fun groupId(): Optional<List<Long>> = Optional.ofNullable(groupId)

    /** Specify a HubDB query to further filter the search results. */
    fun hubdbQuery(): Optional<String> = Optional.ofNullable(hubdbQuery)

    /**
     * Specifies the language of content to be searched. This value must be a valid
     * [ISO 639-1 language code](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) (e.g. `es`
     * for Spanish)
     */
    fun language(): Optional<Language> = Optional.ofNullable(language)

    /**
     * Specifies the length of the search results. Can be set to `LONG` or `SHORT`. `SHORT` will
     * return the first 128 characters of the content's meta description. `LONG` will build a more
     * detailed content snippet based on the html/content of the page.
     */
    fun length(): Optional<Length> = Optional.ofNullable(length)

    /**
     * Specifies the number of results to be returned in a single response. Defaults to `10`.
     * Maximum value is `100`.
     */
    fun limit(): Optional<Int> = Optional.ofNullable(limit)

    /** Inverts the behavior of the pathPrefix filter when set to `false`. Defaults to `true`. */
    fun matchPrefix(): Optional<Boolean> = Optional.ofNullable(matchPrefix)

    /**
     * Used to page through the results. If there are more results than specified by the `limit`
     * parameter, you will need to use the value of offset returned in the previous request to get
     * the next set of results.
     */
    fun offset(): Optional<Int> = Optional.ofNullable(offset)

    /**
     * Specifies a path prefix to filter search results. Will only return results with URL paths
     * that start with the specified parameter. Can be used multiple times.
     */
    fun pathPrefix(): Optional<List<String>> = Optional.ofNullable(pathPrefix)

    /** Specifies how strongly a result is boosted based on its view count. Defaults to 1.0. */
    fun popularityBoost(): Optional<Double> = Optional.ofNullable(popularityBoost)

    /**
     * Specifies which properties to include in the search. Options include `title`, `description`,
     * and `html`. All properties will be searched by default.
     */
    fun property(): Optional<List<String>> = Optional.ofNullable(property)

    /** The term to search for. */
    fun q(): Optional<String> = Optional.ofNullable(q)

    /**
     * Specifies a specific HubDB table to search. Only returns results from the specified table.
     * Can be used in tandem with the `hubdbQuery` parameter to further filter results.
     */
    fun tableId(): Optional<Long> = Optional.ofNullable(tableId)

    /**
     * Specifies the type of content to search. Can be one or more of SITE_PAGE, LANDING_PAGE,
     * BLOG_POST, LISTING_PAGE, and KNOWLEDGE_ARTICLE. Defaults to all content types except
     * LANDING_PAGE and KNOWLEDGE_ARTICLE
     */
    fun type(): Optional<List<Type>> = Optional.ofNullable(type)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): SiteSearchSearchParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [SiteSearchSearchParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SiteSearchSearchParams]. */
    class Builder internal constructor() {

        private var autocomplete: Boolean? = null
        private var boostLimit: Double? = null
        private var boostRecent: String? = null
        private var domain: MutableList<String>? = null
        private var groupId: MutableList<Long>? = null
        private var hubdbQuery: String? = null
        private var language: Language? = null
        private var length: Length? = null
        private var limit: Int? = null
        private var matchPrefix: Boolean? = null
        private var offset: Int? = null
        private var pathPrefix: MutableList<String>? = null
        private var popularityBoost: Double? = null
        private var property: MutableList<String>? = null
        private var q: String? = null
        private var tableId: Long? = null
        private var type: MutableList<Type>? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(siteSearchSearchParams: SiteSearchSearchParams) = apply {
            autocomplete = siteSearchSearchParams.autocomplete
            boostLimit = siteSearchSearchParams.boostLimit
            boostRecent = siteSearchSearchParams.boostRecent
            domain = siteSearchSearchParams.domain?.toMutableList()
            groupId = siteSearchSearchParams.groupId?.toMutableList()
            hubdbQuery = siteSearchSearchParams.hubdbQuery
            language = siteSearchSearchParams.language
            length = siteSearchSearchParams.length
            limit = siteSearchSearchParams.limit
            matchPrefix = siteSearchSearchParams.matchPrefix
            offset = siteSearchSearchParams.offset
            pathPrefix = siteSearchSearchParams.pathPrefix?.toMutableList()
            popularityBoost = siteSearchSearchParams.popularityBoost
            property = siteSearchSearchParams.property?.toMutableList()
            q = siteSearchSearchParams.q
            tableId = siteSearchSearchParams.tableId
            type = siteSearchSearchParams.type?.toMutableList()
            additionalHeaders = siteSearchSearchParams.additionalHeaders.toBuilder()
            additionalQueryParams = siteSearchSearchParams.additionalQueryParams.toBuilder()
        }

        /** Specifies whether or not you are showing autocomplete results. Defaults to false. */
        fun autocomplete(autocomplete: Boolean?) = apply { this.autocomplete = autocomplete }

        /**
         * Alias for [Builder.autocomplete].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun autocomplete(autocomplete: Boolean) = autocomplete(autocomplete as Boolean?)

        /** Alias for calling [Builder.autocomplete] with `autocomplete.orElse(null)`. */
        fun autocomplete(autocomplete: Optional<Boolean>) = autocomplete(autocomplete.getOrNull())

        /**
         * Specifies the maximum amount a result will be boosted based on its view count. Defaults
         * to 5.0. Read more about elasticsearch boosting
         * [here](https://www.elastic.co/guide/en/elasticsearch/reference/current/mapping-boost.html).
         */
        fun boostLimit(boostLimit: Double?) = apply { this.boostLimit = boostLimit }

        /**
         * Alias for [Builder.boostLimit].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun boostLimit(boostLimit: Double) = boostLimit(boostLimit as Double?)

        /** Alias for calling [Builder.boostLimit] with `boostLimit.orElse(null)`. */
        fun boostLimit(boostLimit: Optional<Double>) = boostLimit(boostLimit.getOrNull())

        /**
         * Specifies a relative time window where scores of documents published outside this time
         * window decay. This can only be used for blog posts. For example, boostRecent=10d will
         * boost documents published within the last 10 days. Supported timeunits are ms
         * (milliseconds), s (seconds), m (minutes), h (hours), d (days).
         */
        fun boostRecent(boostRecent: String?) = apply { this.boostRecent = boostRecent }

        /** Alias for calling [Builder.boostRecent] with `boostRecent.orElse(null)`. */
        fun boostRecent(boostRecent: Optional<String>) = boostRecent(boostRecent.getOrNull())

        /** A domain to match search results for. Multiple domains can be provided with &. */
        fun domain(domain: List<String>?) = apply { this.domain = domain?.toMutableList() }

        /** Alias for calling [Builder.domain] with `domain.orElse(null)`. */
        fun domain(domain: Optional<List<String>>) = domain(domain.getOrNull())

        /**
         * Adds a single [String] to [Builder.domain].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addDomain(domain: String) = apply {
            this.domain = (this.domain ?: mutableListOf()).apply { add(domain) }
        }

        /**
         * Specifies which blog(s) to be searched by blog ID. Can be used multiple times to search
         * more than one blog.
         */
        fun groupId(groupId: List<Long>?) = apply { this.groupId = groupId?.toMutableList() }

        /** Alias for calling [Builder.groupId] with `groupId.orElse(null)`. */
        fun groupId(groupId: Optional<List<Long>>) = groupId(groupId.getOrNull())

        /**
         * Adds a single [Long] to [Builder.groupId].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addGroupId(groupId: Long) = apply {
            this.groupId = (this.groupId ?: mutableListOf()).apply { add(groupId) }
        }

        /** Specify a HubDB query to further filter the search results. */
        fun hubdbQuery(hubdbQuery: String?) = apply { this.hubdbQuery = hubdbQuery }

        /** Alias for calling [Builder.hubdbQuery] with `hubdbQuery.orElse(null)`. */
        fun hubdbQuery(hubdbQuery: Optional<String>) = hubdbQuery(hubdbQuery.getOrNull())

        /**
         * Specifies the language of content to be searched. This value must be a valid
         * [ISO 639-1 language code](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) (e.g.
         * `es` for Spanish)
         */
        fun language(language: Language?) = apply { this.language = language }

        /** Alias for calling [Builder.language] with `language.orElse(null)`. */
        fun language(language: Optional<Language>) = language(language.getOrNull())

        /**
         * Specifies the length of the search results. Can be set to `LONG` or `SHORT`. `SHORT` will
         * return the first 128 characters of the content's meta description. `LONG` will build a
         * more detailed content snippet based on the html/content of the page.
         */
        fun length(length: Length?) = apply { this.length = length }

        /** Alias for calling [Builder.length] with `length.orElse(null)`. */
        fun length(length: Optional<Length>) = length(length.getOrNull())

        /**
         * Specifies the number of results to be returned in a single response. Defaults to `10`.
         * Maximum value is `100`.
         */
        fun limit(limit: Int?) = apply { this.limit = limit }

        /**
         * Alias for [Builder.limit].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun limit(limit: Int) = limit(limit as Int?)

        /** Alias for calling [Builder.limit] with `limit.orElse(null)`. */
        fun limit(limit: Optional<Int>) = limit(limit.getOrNull())

        /**
         * Inverts the behavior of the pathPrefix filter when set to `false`. Defaults to `true`.
         */
        fun matchPrefix(matchPrefix: Boolean?) = apply { this.matchPrefix = matchPrefix }

        /**
         * Alias for [Builder.matchPrefix].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun matchPrefix(matchPrefix: Boolean) = matchPrefix(matchPrefix as Boolean?)

        /** Alias for calling [Builder.matchPrefix] with `matchPrefix.orElse(null)`. */
        fun matchPrefix(matchPrefix: Optional<Boolean>) = matchPrefix(matchPrefix.getOrNull())

        /**
         * Used to page through the results. If there are more results than specified by the `limit`
         * parameter, you will need to use the value of offset returned in the previous request to
         * get the next set of results.
         */
        fun offset(offset: Int?) = apply { this.offset = offset }

        /**
         * Alias for [Builder.offset].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun offset(offset: Int) = offset(offset as Int?)

        /** Alias for calling [Builder.offset] with `offset.orElse(null)`. */
        fun offset(offset: Optional<Int>) = offset(offset.getOrNull())

        /**
         * Specifies a path prefix to filter search results. Will only return results with URL paths
         * that start with the specified parameter. Can be used multiple times.
         */
        fun pathPrefix(pathPrefix: List<String>?) = apply {
            this.pathPrefix = pathPrefix?.toMutableList()
        }

        /** Alias for calling [Builder.pathPrefix] with `pathPrefix.orElse(null)`. */
        fun pathPrefix(pathPrefix: Optional<List<String>>) = pathPrefix(pathPrefix.getOrNull())

        /**
         * Adds a single [String] to [Builder.pathPrefix].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPathPrefix(pathPrefix: String) = apply {
            this.pathPrefix = (this.pathPrefix ?: mutableListOf()).apply { add(pathPrefix) }
        }

        /** Specifies how strongly a result is boosted based on its view count. Defaults to 1.0. */
        fun popularityBoost(popularityBoost: Double?) = apply {
            this.popularityBoost = popularityBoost
        }

        /**
         * Alias for [Builder.popularityBoost].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun popularityBoost(popularityBoost: Double) = popularityBoost(popularityBoost as Double?)

        /** Alias for calling [Builder.popularityBoost] with `popularityBoost.orElse(null)`. */
        fun popularityBoost(popularityBoost: Optional<Double>) =
            popularityBoost(popularityBoost.getOrNull())

        /**
         * Specifies which properties to include in the search. Options include `title`,
         * `description`, and `html`. All properties will be searched by default.
         */
        fun property(property: List<String>?) = apply { this.property = property?.toMutableList() }

        /** Alias for calling [Builder.property] with `property.orElse(null)`. */
        fun property(property: Optional<List<String>>) = property(property.getOrNull())

        /**
         * Adds a single [String] to [Builder.property].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addProperty(property: String) = apply {
            this.property = (this.property ?: mutableListOf()).apply { add(property) }
        }

        /** The term to search for. */
        fun q(q: String?) = apply { this.q = q }

        /** Alias for calling [Builder.q] with `q.orElse(null)`. */
        fun q(q: Optional<String>) = q(q.getOrNull())

        /**
         * Specifies a specific HubDB table to search. Only returns results from the specified
         * table. Can be used in tandem with the `hubdbQuery` parameter to further filter results.
         */
        fun tableId(tableId: Long?) = apply { this.tableId = tableId }

        /**
         * Alias for [Builder.tableId].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun tableId(tableId: Long) = tableId(tableId as Long?)

        /** Alias for calling [Builder.tableId] with `tableId.orElse(null)`. */
        fun tableId(tableId: Optional<Long>) = tableId(tableId.getOrNull())

        /**
         * Specifies the type of content to search. Can be one or more of SITE_PAGE, LANDING_PAGE,
         * BLOG_POST, LISTING_PAGE, and KNOWLEDGE_ARTICLE. Defaults to all content types except
         * LANDING_PAGE and KNOWLEDGE_ARTICLE
         */
        fun type(type: List<Type>?) = apply { this.type = type?.toMutableList() }

        /** Alias for calling [Builder.type] with `type.orElse(null)`. */
        fun type(type: Optional<List<Type>>) = type(type.getOrNull())

        /**
         * Adds a single [Type] to [Builder.type].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addType(type: Type) = apply {
            this.type = (this.type ?: mutableListOf()).apply { add(type) }
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [SiteSearchSearchParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): SiteSearchSearchParams =
            SiteSearchSearchParams(
                autocomplete,
                boostLimit,
                boostRecent,
                domain?.toImmutable(),
                groupId?.toImmutable(),
                hubdbQuery,
                language,
                length,
                limit,
                matchPrefix,
                offset,
                pathPrefix?.toImmutable(),
                popularityBoost,
                property?.toImmutable(),
                q,
                tableId,
                type?.toImmutable(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                autocomplete?.let { put("autocomplete", it.toString()) }
                boostLimit?.let { put("boostLimit", it.toString()) }
                boostRecent?.let { put("boostRecent", it) }
                domain?.let { put("domain", it.joinToString(",")) }
                groupId?.let { put("groupId", it.joinToString(",") { it.toString() }) }
                hubdbQuery?.let { put("hubdbQuery", it) }
                language?.let { put("language", it.toString()) }
                length?.let { put("length", it.toString()) }
                limit?.let { put("limit", it.toString()) }
                matchPrefix?.let { put("matchPrefix", it.toString()) }
                offset?.let { put("offset", it.toString()) }
                pathPrefix?.let { put("pathPrefix", it.joinToString(",")) }
                popularityBoost?.let { put("popularityBoost", it.toString()) }
                property?.let { put("property", it.joinToString(",")) }
                q?.let { put("q", it) }
                tableId?.let { put("tableId", it.toString()) }
                type?.let { put("type", it.joinToString(",") { it.toString() }) }
                putAll(additionalQueryParams)
            }
            .build()

    /**
     * Specifies the language of content to be searched. This value must be a valid
     * [ISO 639-1 language code](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) (e.g. `es`
     * for Spanish)
     */
    class Language @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val AF = of("af")

            @JvmField val AF_NA = of("af-na")

            @JvmField val AF_ZA = of("af-za")

            @JvmField val AGQ = of("agq")

            @JvmField val AGQ_CM = of("agq-cm")

            @JvmField val AK = of("ak")

            @JvmField val AK_GH = of("ak-gh")

            @JvmField val AM = of("am")

            @JvmField val AM_ET = of("am-et")

            @JvmField val AR = of("ar")

            @JvmField val AR_001 = of("ar-001")

            @JvmField val AR_AE = of("ar-ae")

            @JvmField val AR_BH = of("ar-bh")

            @JvmField val AR_DJ = of("ar-dj")

            @JvmField val AR_DZ = of("ar-dz")

            @JvmField val AR_EG = of("ar-eg")

            @JvmField val AR_EH = of("ar-eh")

            @JvmField val AR_ER = of("ar-er")

            @JvmField val AR_IL = of("ar-il")

            @JvmField val AR_IQ = of("ar-iq")

            @JvmField val AR_JO = of("ar-jo")

            @JvmField val AR_KM = of("ar-km")

            @JvmField val AR_KW = of("ar-kw")

            @JvmField val AR_LB = of("ar-lb")

            @JvmField val AR_LY = of("ar-ly")

            @JvmField val AR_MA = of("ar-ma")

            @JvmField val AR_MR = of("ar-mr")

            @JvmField val AR_OM = of("ar-om")

            @JvmField val AR_PS = of("ar-ps")

            @JvmField val AR_QA = of("ar-qa")

            @JvmField val AR_SA = of("ar-sa")

            @JvmField val AR_SD = of("ar-sd")

            @JvmField val AR_SO = of("ar-so")

            @JvmField val AR_SS = of("ar-ss")

            @JvmField val AR_SY = of("ar-sy")

            @JvmField val AR_TD = of("ar-td")

            @JvmField val AR_TN = of("ar-tn")

            @JvmField val AR_YE = of("ar-ye")

            @JvmField val AS = of("as")

            @JvmField val AS_IN = of("as-in")

            @JvmField val ASA = of("asa")

            @JvmField val ASA_TZ = of("asa-tz")

            @JvmField val AST = of("ast")

            @JvmField val AST_ES = of("ast-es")

            @JvmField val AZ = of("az")

            @JvmField val AZ_AZ = of("az-az")

            @JvmField val BAS = of("bas")

            @JvmField val BAS_CM = of("bas-cm")

            @JvmField val BE = of("be")

            @JvmField val BE_BY = of("be-by")

            @JvmField val BEM = of("bem")

            @JvmField val BEM_ZM = of("bem-zm")

            @JvmField val BEZ = of("bez")

            @JvmField val BEZ_TZ = of("bez-tz")

            @JvmField val BG = of("bg")

            @JvmField val BG_BG = of("bg-bg")

            @JvmField val BM = of("bm")

            @JvmField val BM_ML = of("bm-ml")

            @JvmField val BN = of("bn")

            @JvmField val BN_BD = of("bn-bd")

            @JvmField val BN_IN = of("bn-in")

            @JvmField val BO = of("bo")

            @JvmField val BO_CN = of("bo-cn")

            @JvmField val BO_IN = of("bo-in")

            @JvmField val BR = of("br")

            @JvmField val BR_FR = of("br-fr")

            @JvmField val BRX = of("brx")

            @JvmField val BRX_IN = of("brx-in")

            @JvmField val BS = of("bs")

            @JvmField val BS_BA = of("bs-ba")

            @JvmField val CA = of("ca")

            @JvmField val CA_AD = of("ca-ad")

            @JvmField val CA_ES = of("ca-es")

            @JvmField val CA_FR = of("ca-fr")

            @JvmField val CA_IT = of("ca-it")

            @JvmField val CCP = of("ccp")

            @JvmField val CCP_BD = of("ccp-bd")

            @JvmField val CCP_IN = of("ccp-in")

            @JvmField val CE = of("ce")

            @JvmField val CE_RU = of("ce-ru")

            @JvmField val CEB = of("ceb")

            @JvmField val CEB_PH = of("ceb-ph")

            @JvmField val CGG = of("cgg")

            @JvmField val CGG_UG = of("cgg-ug")

            @JvmField val CHR = of("chr")

            @JvmField val CHR_US = of("chr-us")

            @JvmField val CKB = of("ckb")

            @JvmField val CKB_IQ = of("ckb-iq")

            @JvmField val CKB_IR = of("ckb-ir")

            @JvmField val CS = of("cs")

            @JvmField val CS_CZ = of("cs-cz")

            @JvmField val CU = of("cu")

            @JvmField val CU_RU = of("cu-ru")

            @JvmField val CY = of("cy")

            @JvmField val CY_GB = of("cy-gb")

            @JvmField val DA = of("da")

            @JvmField val DA_DK = of("da-dk")

            @JvmField val DA_GL = of("da-gl")

            @JvmField val DAV = of("dav")

            @JvmField val DAV_KE = of("dav-ke")

            @JvmField val DE = of("de")

            @JvmField val DE_AT = of("de-at")

            @JvmField val DE_BE = of("de-be")

            @JvmField val DE_CH = of("de-ch")

            @JvmField val DE_DE = of("de-de")

            @JvmField val DE_GR = of("de-gr")

            @JvmField val DE_IT = of("de-it")

            @JvmField val DE_LI = of("de-li")

            @JvmField val DE_LU = of("de-lu")

            @JvmField val DJE = of("dje")

            @JvmField val DJE_NE = of("dje-ne")

            @JvmField val DOI = of("doi")

            @JvmField val DOI_IN = of("doi-in")

            @JvmField val DSB = of("dsb")

            @JvmField val DSB_DE = of("dsb-de")

            @JvmField val DUA = of("dua")

            @JvmField val DUA_CM = of("dua-cm")

            @JvmField val DYO = of("dyo")

            @JvmField val DYO_SN = of("dyo-sn")

            @JvmField val DZ = of("dz")

            @JvmField val DZ_BT = of("dz-bt")

            @JvmField val EBU = of("ebu")

            @JvmField val EBU_KE = of("ebu-ke")

            @JvmField val EE = of("ee")

            @JvmField val EE_GH = of("ee-gh")

            @JvmField val EE_TG = of("ee-tg")

            @JvmField val EL = of("el")

            @JvmField val EL_CY = of("el-cy")

            @JvmField val EL_GR = of("el-gr")

            @JvmField val EN = of("en")

            @JvmField val EN_001 = of("en-001")

            @JvmField val EN_150 = of("en-150")

            @JvmField val EN_AE = of("en-ae")

            @JvmField val EN_AG = of("en-ag")

            @JvmField val EN_AI = of("en-ai")

            @JvmField val EN_AS = of("en-as")

            @JvmField val EN_AT = of("en-at")

            @JvmField val EN_AU = of("en-au")

            @JvmField val EN_BB = of("en-bb")

            @JvmField val EN_BE = of("en-be")

            @JvmField val EN_BI = of("en-bi")

            @JvmField val EN_BM = of("en-bm")

            @JvmField val EN_BS = of("en-bs")

            @JvmField val EN_BW = of("en-bw")

            @JvmField val EN_BZ = of("en-bz")

            @JvmField val EN_CA = of("en-ca")

            @JvmField val EN_CC = of("en-cc")

            @JvmField val EN_CH = of("en-ch")

            @JvmField val EN_CK = of("en-ck")

            @JvmField val EN_CM = of("en-cm")

            @JvmField val EN_CN = of("en-cn")

            @JvmField val EN_CX = of("en-cx")

            @JvmField val EN_CY = of("en-cy")

            @JvmField val EN_DE = of("en-de")

            @JvmField val EN_DG = of("en-dg")

            @JvmField val EN_DK = of("en-dk")

            @JvmField val EN_DM = of("en-dm")

            @JvmField val EN_ER = of("en-er")

            @JvmField val EN_FI = of("en-fi")

            @JvmField val EN_FJ = of("en-fj")

            @JvmField val EN_FK = of("en-fk")

            @JvmField val EN_FM = of("en-fm")

            @JvmField val EN_GB = of("en-gb")

            @JvmField val EN_GD = of("en-gd")

            @JvmField val EN_GG = of("en-gg")

            @JvmField val EN_GH = of("en-gh")

            @JvmField val EN_GI = of("en-gi")

            @JvmField val EN_GM = of("en-gm")

            @JvmField val EN_GU = of("en-gu")

            @JvmField val EN_GY = of("en-gy")

            @JvmField val EN_HK = of("en-hk")

            @JvmField val EN_IE = of("en-ie")

            @JvmField val EN_IL = of("en-il")

            @JvmField val EN_IM = of("en-im")

            @JvmField val EN_IN = of("en-in")

            @JvmField val EN_IO = of("en-io")

            @JvmField val EN_JE = of("en-je")

            @JvmField val EN_JM = of("en-jm")

            @JvmField val EN_KE = of("en-ke")

            @JvmField val EN_KI = of("en-ki")

            @JvmField val EN_KN = of("en-kn")

            @JvmField val EN_KY = of("en-ky")

            @JvmField val EN_LC = of("en-lc")

            @JvmField val EN_LR = of("en-lr")

            @JvmField val EN_LS = of("en-ls")

            @JvmField val EN_LU = of("en-lu")

            @JvmField val EN_MG = of("en-mg")

            @JvmField val EN_MH = of("en-mh")

            @JvmField val EN_MO = of("en-mo")

            @JvmField val EN_MP = of("en-mp")

            @JvmField val EN_MS = of("en-ms")

            @JvmField val EN_MT = of("en-mt")

            @JvmField val EN_MU = of("en-mu")

            @JvmField val EN_MW = of("en-mw")

            @JvmField val EN_MX = of("en-mx")

            @JvmField val EN_MY = of("en-my")

            @JvmField val EN_NA = of("en-na")

            @JvmField val EN_NF = of("en-nf")

            @JvmField val EN_NG = of("en-ng")

            @JvmField val EN_NL = of("en-nl")

            @JvmField val EN_NR = of("en-nr")

            @JvmField val EN_NU = of("en-nu")

            @JvmField val EN_NZ = of("en-nz")

            @JvmField val EN_PG = of("en-pg")

            @JvmField val EN_PH = of("en-ph")

            @JvmField val EN_PK = of("en-pk")

            @JvmField val EN_PN = of("en-pn")

            @JvmField val EN_PR = of("en-pr")

            @JvmField val EN_PW = of("en-pw")

            @JvmField val EN_RW = of("en-rw")

            @JvmField val EN_SB = of("en-sb")

            @JvmField val EN_SC = of("en-sc")

            @JvmField val EN_SD = of("en-sd")

            @JvmField val EN_SE = of("en-se")

            @JvmField val EN_SG = of("en-sg")

            @JvmField val EN_SH = of("en-sh")

            @JvmField val EN_SI = of("en-si")

            @JvmField val EN_SL = of("en-sl")

            @JvmField val EN_SS = of("en-ss")

            @JvmField val EN_SX = of("en-sx")

            @JvmField val EN_SZ = of("en-sz")

            @JvmField val EN_TC = of("en-tc")

            @JvmField val EN_TK = of("en-tk")

            @JvmField val EN_TO = of("en-to")

            @JvmField val EN_TT = of("en-tt")

            @JvmField val EN_TV = of("en-tv")

            @JvmField val EN_TZ = of("en-tz")

            @JvmField val EN_UG = of("en-ug")

            @JvmField val EN_UM = of("en-um")

            @JvmField val EN_US = of("en-us")

            @JvmField val EN_VC = of("en-vc")

            @JvmField val EN_VG = of("en-vg")

            @JvmField val EN_VI = of("en-vi")

            @JvmField val EN_VU = of("en-vu")

            @JvmField val EN_WS = of("en-ws")

            @JvmField val EN_ZA = of("en-za")

            @JvmField val EN_ZM = of("en-zm")

            @JvmField val EN_ZW = of("en-zw")

            @JvmField val EO = of("eo")

            @JvmField val EO_001 = of("eo-001")

            @JvmField val ES = of("es")

            @JvmField val ES_419 = of("es-419")

            @JvmField val ES_AR = of("es-ar")

            @JvmField val ES_BO = of("es-bo")

            @JvmField val ES_BR = of("es-br")

            @JvmField val ES_BZ = of("es-bz")

            @JvmField val ES_CL = of("es-cl")

            @JvmField val ES_CO = of("es-co")

            @JvmField val ES_CR = of("es-cr")

            @JvmField val ES_CU = of("es-cu")

            @JvmField val ES_DO = of("es-do")

            @JvmField val ES_EA = of("es-ea")

            @JvmField val ES_EC = of("es-ec")

            @JvmField val ES_ES = of("es-es")

            @JvmField val ES_GQ = of("es-gq")

            @JvmField val ES_GT = of("es-gt")

            @JvmField val ES_HN = of("es-hn")

            @JvmField val ES_IC = of("es-ic")

            @JvmField val ES_MX = of("es-mx")

            @JvmField val ES_NI = of("es-ni")

            @JvmField val ES_PA = of("es-pa")

            @JvmField val ES_PE = of("es-pe")

            @JvmField val ES_PH = of("es-ph")

            @JvmField val ES_PR = of("es-pr")

            @JvmField val ES_PY = of("es-py")

            @JvmField val ES_SV = of("es-sv")

            @JvmField val ES_US = of("es-us")

            @JvmField val ES_UY = of("es-uy")

            @JvmField val ES_VE = of("es-ve")

            @JvmField val ET = of("et")

            @JvmField val ET_EE = of("et-ee")

            @JvmField val EU = of("eu")

            @JvmField val EU_ES = of("eu-es")

            @JvmField val EWO = of("ewo")

            @JvmField val EWO_CM = of("ewo-cm")

            @JvmField val FA = of("fa")

            @JvmField val FA_AF = of("fa-af")

            @JvmField val FA_IR = of("fa-ir")

            @JvmField val FF = of("ff")

            @JvmField val FF_BF = of("ff-bf")

            @JvmField val FF_CM = of("ff-cm")

            @JvmField val FF_GH = of("ff-gh")

            @JvmField val FF_GM = of("ff-gm")

            @JvmField val FF_GN = of("ff-gn")

            @JvmField val FF_GW = of("ff-gw")

            @JvmField val FF_LR = of("ff-lr")

            @JvmField val FF_MR = of("ff-mr")

            @JvmField val FF_NE = of("ff-ne")

            @JvmField val FF_NG = of("ff-ng")

            @JvmField val FF_SL = of("ff-sl")

            @JvmField val FF_SN = of("ff-sn")

            @JvmField val FI = of("fi")

            @JvmField val FI_FI = of("fi-fi")

            @JvmField val FIL = of("fil")

            @JvmField val FIL_PH = of("fil-ph")

            @JvmField val FO = of("fo")

            @JvmField val FO_DK = of("fo-dk")

            @JvmField val FO_FO = of("fo-fo")

            @JvmField val FR = of("fr")

            @JvmField val FR_BE = of("fr-be")

            @JvmField val FR_BF = of("fr-bf")

            @JvmField val FR_BI = of("fr-bi")

            @JvmField val FR_BJ = of("fr-bj")

            @JvmField val FR_BL = of("fr-bl")

            @JvmField val FR_CA = of("fr-ca")

            @JvmField val FR_CD = of("fr-cd")

            @JvmField val FR_CF = of("fr-cf")

            @JvmField val FR_CG = of("fr-cg")

            @JvmField val FR_CH = of("fr-ch")

            @JvmField val FR_CI = of("fr-ci")

            @JvmField val FR_CM = of("fr-cm")

            @JvmField val FR_DJ = of("fr-dj")

            @JvmField val FR_DZ = of("fr-dz")

            @JvmField val FR_FR = of("fr-fr")

            @JvmField val FR_GA = of("fr-ga")

            @JvmField val FR_GF = of("fr-gf")

            @JvmField val FR_GN = of("fr-gn")

            @JvmField val FR_GP = of("fr-gp")

            @JvmField val FR_GQ = of("fr-gq")

            @JvmField val FR_HT = of("fr-ht")

            @JvmField val FR_KM = of("fr-km")

            @JvmField val FR_LU = of("fr-lu")

            @JvmField val FR_MA = of("fr-ma")

            @JvmField val FR_MC = of("fr-mc")

            @JvmField val FR_MF = of("fr-mf")

            @JvmField val FR_MG = of("fr-mg")

            @JvmField val FR_ML = of("fr-ml")

            @JvmField val FR_MQ = of("fr-mq")

            @JvmField val FR_MR = of("fr-mr")

            @JvmField val FR_MU = of("fr-mu")

            @JvmField val FR_NC = of("fr-nc")

            @JvmField val FR_NE = of("fr-ne")

            @JvmField val FR_PF = of("fr-pf")

            @JvmField val FR_PM = of("fr-pm")

            @JvmField val FR_RE = of("fr-re")

            @JvmField val FR_RW = of("fr-rw")

            @JvmField val FR_SC = of("fr-sc")

            @JvmField val FR_SN = of("fr-sn")

            @JvmField val FR_SY = of("fr-sy")

            @JvmField val FR_TD = of("fr-td")

            @JvmField val FR_TG = of("fr-tg")

            @JvmField val FR_TN = of("fr-tn")

            @JvmField val FR_VU = of("fr-vu")

            @JvmField val FR_WF = of("fr-wf")

            @JvmField val FR_YT = of("fr-yt")

            @JvmField val FUR = of("fur")

            @JvmField val FUR_IT = of("fur-it")

            @JvmField val FY = of("fy")

            @JvmField val FY_NL = of("fy-nl")

            @JvmField val GA = of("ga")

            @JvmField val GA_GB = of("ga-gb")

            @JvmField val GA_IE = of("ga-ie")

            @JvmField val GD = of("gd")

            @JvmField val GD_GB = of("gd-gb")

            @JvmField val GL = of("gl")

            @JvmField val GL_ES = of("gl-es")

            @JvmField val GSW = of("gsw")

            @JvmField val GSW_CH = of("gsw-ch")

            @JvmField val GSW_FR = of("gsw-fr")

            @JvmField val GSW_LI = of("gsw-li")

            @JvmField val GU = of("gu")

            @JvmField val GU_IN = of("gu-in")

            @JvmField val GUZ = of("guz")

            @JvmField val GUZ_KE = of("guz-ke")

            @JvmField val GV = of("gv")

            @JvmField val GV_IM = of("gv-im")

            @JvmField val HA = of("ha")

            @JvmField val HA_GH = of("ha-gh")

            @JvmField val HA_NE = of("ha-ne")

            @JvmField val HA_NG = of("ha-ng")

            @JvmField val HAW = of("haw")

            @JvmField val HAW_US = of("haw-us")

            @JvmField val HE = of("he")

            @JvmField val HI = of("hi")

            @JvmField val HI_IN = of("hi-in")

            @JvmField val HR = of("hr")

            @JvmField val HR_BA = of("hr-ba")

            @JvmField val HR_HR = of("hr-hr")

            @JvmField val HSB = of("hsb")

            @JvmField val HSB_DE = of("hsb-de")

            @JvmField val HU = of("hu")

            @JvmField val HU_HU = of("hu-hu")

            @JvmField val HY = of("hy")

            @JvmField val HY_AM = of("hy-am")

            @JvmField val IA = of("ia")

            @JvmField val IA_001 = of("ia-001")

            @JvmField val ID = of("id")

            @JvmField val IG = of("ig")

            @JvmField val IG_NG = of("ig-ng")

            @JvmField val II = of("ii")

            @JvmField val II_CN = of("ii-cn")

            @JvmField val ID_ID = of("id-id")

            @JvmField val IS = of("is")

            @JvmField val IS_IS = of("is-is")

            @JvmField val IT = of("it")

            @JvmField val IT_CH = of("it-ch")

            @JvmField val IT_IT = of("it-it")

            @JvmField val IT_SM = of("it-sm")

            @JvmField val IT_VA = of("it-va")

            @JvmField val HE_IL = of("he-il")

            @JvmField val JA = of("ja")

            @JvmField val JA_JP = of("ja-jp")

            @JvmField val JGO = of("jgo")

            @JvmField val JGO_CM = of("jgo-cm")

            @JvmField val YI = of("yi")

            @JvmField val YI_001 = of("yi-001")

            @JvmField val JMC = of("jmc")

            @JvmField val JMC_TZ = of("jmc-tz")

            @JvmField val JV = of("jv")

            @JvmField val JV_ID = of("jv-id")

            @JvmField val KA = of("ka")

            @JvmField val KA_GE = of("ka-ge")

            @JvmField val KAB = of("kab")

            @JvmField val KAB_DZ = of("kab-dz")

            @JvmField val KAM = of("kam")

            @JvmField val KAM_KE = of("kam-ke")

            @JvmField val KDE = of("kde")

            @JvmField val KDE_TZ = of("kde-tz")

            @JvmField val KEA = of("kea")

            @JvmField val KEA_CV = of("kea-cv")

            @JvmField val KHQ = of("khq")

            @JvmField val KHQ_ML = of("khq-ml")

            @JvmField val KI = of("ki")

            @JvmField val KI_KE = of("ki-ke")

            @JvmField val KK = of("kk")

            @JvmField val KK_KZ = of("kk-kz")

            @JvmField val KKJ = of("kkj")

            @JvmField val KKJ_CM = of("kkj-cm")

            @JvmField val KL = of("kl")

            @JvmField val KL_GL = of("kl-gl")

            @JvmField val KLN = of("kln")

            @JvmField val KLN_KE = of("kln-ke")

            @JvmField val KM = of("km")

            @JvmField val KM_KH = of("km-kh")

            @JvmField val KN = of("kn")

            @JvmField val KN_IN = of("kn-in")

            @JvmField val KO = of("ko")

            @JvmField val KO_KP = of("ko-kp")

            @JvmField val KO_KR = of("ko-kr")

            @JvmField val KOK = of("kok")

            @JvmField val KOK_IN = of("kok-in")

            @JvmField val KS = of("ks")

            @JvmField val KS_IN = of("ks-in")

            @JvmField val KSB = of("ksb")

            @JvmField val KSB_TZ = of("ksb-tz")

            @JvmField val KSF = of("ksf")

            @JvmField val KSF_CM = of("ksf-cm")

            @JvmField val KSH = of("ksh")

            @JvmField val KSH_DE = of("ksh-de")

            @JvmField val KW = of("kw")

            @JvmField val KW_GB = of("kw-gb")

            @JvmField val KU = of("ku")

            @JvmField val KU_TR = of("ku-tr")

            @JvmField val KY = of("ky")

            @JvmField val KY_KG = of("ky-kg")

            @JvmField val LAG = of("lag")

            @JvmField val LAG_TZ = of("lag-tz")

            @JvmField val LB = of("lb")

            @JvmField val LB_LU = of("lb-lu")

            @JvmField val LG = of("lg")

            @JvmField val LG_UG = of("lg-ug")

            @JvmField val LKT = of("lkt")

            @JvmField val LKT_US = of("lkt-us")

            @JvmField val LN = of("ln")

            @JvmField val LN_AO = of("ln-ao")

            @JvmField val LN_CD = of("ln-cd")

            @JvmField val LN_CF = of("ln-cf")

            @JvmField val LN_CG = of("ln-cg")

            @JvmField val LO = of("lo")

            @JvmField val LO_LA = of("lo-la")

            @JvmField val LRC = of("lrc")

            @JvmField val LRC_IQ = of("lrc-iq")

            @JvmField val LRC_IR = of("lrc-ir")

            @JvmField val LT = of("lt")

            @JvmField val LT_LT = of("lt-lt")

            @JvmField val LU = of("lu")

            @JvmField val LU_CD = of("lu-cd")

            @JvmField val LUO = of("luo")

            @JvmField val LUO_KE = of("luo-ke")

            @JvmField val LUY = of("luy")

            @JvmField val LUY_KE = of("luy-ke")

            @JvmField val LV = of("lv")

            @JvmField val LV_LV = of("lv-lv")

            @JvmField val MAI = of("mai")

            @JvmField val MAI_IN = of("mai-in")

            @JvmField val MAS = of("mas")

            @JvmField val MAS_KE = of("mas-ke")

            @JvmField val MAS_TZ = of("mas-tz")

            @JvmField val MER = of("mer")

            @JvmField val MER_KE = of("mer-ke")

            @JvmField val MFE = of("mfe")

            @JvmField val MFE_MU = of("mfe-mu")

            @JvmField val MG = of("mg")

            @JvmField val MG_MG = of("mg-mg")

            @JvmField val MGH = of("mgh")

            @JvmField val MGH_MZ = of("mgh-mz")

            @JvmField val MGO = of("mgo")

            @JvmField val MGO_CM = of("mgo-cm")

            @JvmField val MI = of("mi")

            @JvmField val MI_NZ = of("mi-nz")

            @JvmField val MK = of("mk")

            @JvmField val MK_MK = of("mk-mk")

            @JvmField val ML = of("ml")

            @JvmField val ML_IN = of("ml-in")

            @JvmField val MN = of("mn")

            @JvmField val MN_MN = of("mn-mn")

            @JvmField val MNI = of("mni")

            @JvmField val MNI_IN = of("mni-in")

            @JvmField val MR = of("mr")

            @JvmField val MR_IN = of("mr-in")

            @JvmField val MS = of("ms")

            @JvmField val MS_BN = of("ms-bn")

            @JvmField val MS_ID = of("ms-id")

            @JvmField val MS_MY = of("ms-my")

            @JvmField val MS_SG = of("ms-sg")

            @JvmField val MT = of("mt")

            @JvmField val MT_MT = of("mt-mt")

            @JvmField val MUA = of("mua")

            @JvmField val MUA_CM = of("mua-cm")

            @JvmField val MY = of("my")

            @JvmField val MY_MM = of("my-mm")

            @JvmField val MZN = of("mzn")

            @JvmField val MZN_IR = of("mzn-ir")

            @JvmField val NAQ = of("naq")

            @JvmField val NAQ_NA = of("naq-na")

            @JvmField val NB = of("nb")

            @JvmField val NB_NO = of("nb-no")

            @JvmField val NB_SJ = of("nb-sj")

            @JvmField val ND = of("nd")

            @JvmField val ND_ZW = of("nd-zw")

            @JvmField val NDS = of("nds")

            @JvmField val NDS_DE = of("nds-de")

            @JvmField val NDS_NL = of("nds-nl")

            @JvmField val NE = of("ne")

            @JvmField val NE_IN = of("ne-in")

            @JvmField val NE_NP = of("ne-np")

            @JvmField val NL = of("nl")

            @JvmField val NL_AW = of("nl-aw")

            @JvmField val NL_BE = of("nl-be")

            @JvmField val NL_CH = of("nl-ch")

            @JvmField val NL_BQ = of("nl-bq")

            @JvmField val NL_CW = of("nl-cw")

            @JvmField val NL_LU = of("nl-lu")

            @JvmField val NL_NL = of("nl-nl")

            @JvmField val NL_SR = of("nl-sr")

            @JvmField val NL_SX = of("nl-sx")

            @JvmField val NMG = of("nmg")

            @JvmField val NMG_CM = of("nmg-cm")

            @JvmField val NN = of("nn")

            @JvmField val NN_NO = of("nn-no")

            @JvmField val NNH = of("nnh")

            @JvmField val NNH_CM = of("nnh-cm")

            @JvmField val NO = of("no")

            @JvmField val NO_NO = of("no-no")

            @JvmField val NUS = of("nus")

            @JvmField val NUS_SS = of("nus-ss")

            @JvmField val NYN = of("nyn")

            @JvmField val NYN_UG = of("nyn-ug")

            @JvmField val OM = of("om")

            @JvmField val OM_ET = of("om-et")

            @JvmField val OM_KE = of("om-ke")

            @JvmField val OR = of("or")

            @JvmField val OR_IN = of("or-in")

            @JvmField val OS = of("os")

            @JvmField val OS_GE = of("os-ge")

            @JvmField val OS_RU = of("os-ru")

            @JvmField val PA = of("pa")

            @JvmField val PA_IN = of("pa-in")

            @JvmField val PA_PK = of("pa-pk")

            @JvmField val PCM = of("pcm")

            @JvmField val PCM_NG = of("pcm-ng")

            @JvmField val PL = of("pl")

            @JvmField val PL_PL = of("pl-pl")

            @JvmField val PRG = of("prg")

            @JvmField val PRG_001 = of("prg-001")

            @JvmField val PS = of("ps")

            @JvmField val PS_AF = of("ps-af")

            @JvmField val PS_PK = of("ps-pk")

            @JvmField val PT = of("pt")

            @JvmField val PT_AO = of("pt-ao")

            @JvmField val PT_BR = of("pt-br")

            @JvmField val PT_CH = of("pt-ch")

            @JvmField val PT_CV = of("pt-cv")

            @JvmField val PT_GQ = of("pt-gq")

            @JvmField val PT_GW = of("pt-gw")

            @JvmField val PT_LU = of("pt-lu")

            @JvmField val PT_MO = of("pt-mo")

            @JvmField val PT_MZ = of("pt-mz")

            @JvmField val PT_PT = of("pt-pt")

            @JvmField val PT_ST = of("pt-st")

            @JvmField val PT_TL = of("pt-tl")

            @JvmField val QU = of("qu")

            @JvmField val QU_BO = of("qu-bo")

            @JvmField val QU_EC = of("qu-ec")

            @JvmField val QU_PE = of("qu-pe")

            @JvmField val RM = of("rm")

            @JvmField val RM_CH = of("rm-ch")

            @JvmField val RN = of("rn")

            @JvmField val RN_BI = of("rn-bi")

            @JvmField val RO = of("ro")

            @JvmField val RO_MD = of("ro-md")

            @JvmField val RO_RO = of("ro-ro")

            @JvmField val ROF = of("rof")

            @JvmField val ROF_TZ = of("rof-tz")

            @JvmField val RU = of("ru")

            @JvmField val RU_BY = of("ru-by")

            @JvmField val RU_KG = of("ru-kg")

            @JvmField val RU_KZ = of("ru-kz")

            @JvmField val RU_MD = of("ru-md")

            @JvmField val RU_RU = of("ru-ru")

            @JvmField val RU_UA = of("ru-ua")

            @JvmField val RW = of("rw")

            @JvmField val RW_RW = of("rw-rw")

            @JvmField val RWK = of("rwk")

            @JvmField val RWK_TZ = of("rwk-tz")

            @JvmField val SA = of("sa")

            @JvmField val SA_IN = of("sa-in")

            @JvmField val SAH = of("sah")

            @JvmField val SAH_RU = of("sah-ru")

            @JvmField val SAQ = of("saq")

            @JvmField val SAQ_KE = of("saq-ke")

            @JvmField val SAT = of("sat")

            @JvmField val SAT_IN = of("sat-in")

            @JvmField val SBP = of("sbp")

            @JvmField val SBP_TZ = of("sbp-tz")

            @JvmField val SD = of("sd")

            @JvmField val SD_IN = of("sd-in")

            @JvmField val SD_PK = of("sd-pk")

            @JvmField val SE = of("se")

            @JvmField val SE_FI = of("se-fi")

            @JvmField val SE_NO = of("se-no")

            @JvmField val SE_SE = of("se-se")

            @JvmField val SEH = of("seh")

            @JvmField val SEH_MZ = of("seh-mz")

            @JvmField val SES = of("ses")

            @JvmField val SES_ML = of("ses-ml")

            @JvmField val SG = of("sg")

            @JvmField val SG_CF = of("sg-cf")

            @JvmField val SHI = of("shi")

            @JvmField val SHI_MA = of("shi-ma")

            @JvmField val SI = of("si")

            @JvmField val SI_LK = of("si-lk")

            @JvmField val SK = of("sk")

            @JvmField val SK_SK = of("sk-sk")

            @JvmField val SL = of("sl")

            @JvmField val SL_SI = of("sl-si")

            @JvmField val SMN = of("smn")

            @JvmField val SMN_FI = of("smn-fi")

            @JvmField val SN = of("sn")

            @JvmField val SN_ZW = of("sn-zw")

            @JvmField val SO = of("so")

            @JvmField val SO_DJ = of("so-dj")

            @JvmField val SO_ET = of("so-et")

            @JvmField val SO_KE = of("so-ke")

            @JvmField val SO_SO = of("so-so")

            @JvmField val SQ = of("sq")

            @JvmField val SQ_AL = of("sq-al")

            @JvmField val SQ_MK = of("sq-mk")

            @JvmField val SQ_XK = of("sq-xk")

            @JvmField val SR = of("sr")

            @JvmField val SR_BA = of("sr-ba")

            @JvmField val SR_CS = of("sr-cs")

            @JvmField val SR_ME = of("sr-me")

            @JvmField val SR_RS = of("sr-rs")

            @JvmField val SR_XK = of("sr-xk")

            @JvmField val SU = of("su")

            @JvmField val SU_ID = of("su-id")

            @JvmField val SV = of("sv")

            @JvmField val SV_AX = of("sv-ax")

            @JvmField val SV_FI = of("sv-fi")

            @JvmField val SV_SE = of("sv-se")

            @JvmField val SW = of("sw")

            @JvmField val SW_CD = of("sw-cd")

            @JvmField val SW_KE = of("sw-ke")

            @JvmField val SW_TZ = of("sw-tz")

            @JvmField val SW_UG = of("sw-ug")

            @JvmField val SY = of("sy")

            @JvmField val TA = of("ta")

            @JvmField val TA_IN = of("ta-in")

            @JvmField val TA_LK = of("ta-lk")

            @JvmField val TA_MY = of("ta-my")

            @JvmField val TA_SG = of("ta-sg")

            @JvmField val TE = of("te")

            @JvmField val TE_IN = of("te-in")

            @JvmField val TEO = of("teo")

            @JvmField val TEO_KE = of("teo-ke")

            @JvmField val TEO_UG = of("teo-ug")

            @JvmField val TG = of("tg")

            @JvmField val TG_TJ = of("tg-tj")

            @JvmField val TH = of("th")

            @JvmField val TH_TH = of("th-th")

            @JvmField val TI = of("ti")

            @JvmField val TI_ER = of("ti-er")

            @JvmField val TI_ET = of("ti-et")

            @JvmField val TK = of("tk")

            @JvmField val TK_TM = of("tk-tm")

            @JvmField val TL = of("tl")

            @JvmField val TO = of("to")

            @JvmField val TO_TO = of("to-to")

            @JvmField val TR = of("tr")

            @JvmField val TR_CY = of("tr-cy")

            @JvmField val TR_TR = of("tr-tr")

            @JvmField val TT = of("tt")

            @JvmField val TT_RU = of("tt-ru")

            @JvmField val TWQ = of("twq")

            @JvmField val TWQ_NE = of("twq-ne")

            @JvmField val TZM = of("tzm")

            @JvmField val TZM_MA = of("tzm-ma")

            @JvmField val UG = of("ug")

            @JvmField val UG_CN = of("ug-cn")

            @JvmField val UK = of("uk")

            @JvmField val UK_UA = of("uk-ua")

            @JvmField val UR = of("ur")

            @JvmField val UR_IN = of("ur-in")

            @JvmField val UR_PK = of("ur-pk")

            @JvmField val UZ = of("uz")

            @JvmField val UZ_AF = of("uz-af")

            @JvmField val UZ_UZ = of("uz-uz")

            @JvmField val VAI = of("vai")

            @JvmField val VAI_LR = of("vai-lr")

            @JvmField val VI = of("vi")

            @JvmField val VI_VN = of("vi-vn")

            @JvmField val VO = of("vo")

            @JvmField val VO_001 = of("vo-001")

            @JvmField val VUN = of("vun")

            @JvmField val VUN_TZ = of("vun-tz")

            @JvmField val WAE = of("wae")

            @JvmField val WAE_CH = of("wae-ch")

            @JvmField val WO = of("wo")

            @JvmField val WO_SN = of("wo-sn")

            @JvmField val XH = of("xh")

            @JvmField val XH_ZA = of("xh-za")

            @JvmField val XOG = of("xog")

            @JvmField val XOG_UG = of("xog-ug")

            @JvmField val YAV = of("yav")

            @JvmField val YAV_CM = of("yav-cm")

            @JvmField val YO = of("yo")

            @JvmField val YO_BJ = of("yo-bj")

            @JvmField val YO_NG = of("yo-ng")

            @JvmField val YUE = of("yue")

            @JvmField val YUE_CN = of("yue-cn")

            @JvmField val YUE_HK = of("yue-hk")

            @JvmField val ZGH = of("zgh")

            @JvmField val ZGH_MA = of("zgh-ma")

            @JvmField val ZH = of("zh")

            @JvmField val ZH_CN = of("zh-cn")

            @JvmField val ZH_HK = of("zh-hk")

            @JvmField val ZH_MO = of("zh-mo")

            @JvmField val ZH_SG = of("zh-sg")

            @JvmField val ZH_TW = of("zh-tw")

            @JvmField val ZH_HANS = of("zh-hans")

            @JvmField val ZH_HANT = of("zh-hant")

            @JvmField val ZU = of("zu")

            @JvmField val ZU_ZA = of("zu-za")

            @JvmStatic fun of(value: String) = Language(JsonField.of(value))
        }

        /** An enum containing [Language]'s known values. */
        enum class Known {
            AF,
            AF_NA,
            AF_ZA,
            AGQ,
            AGQ_CM,
            AK,
            AK_GH,
            AM,
            AM_ET,
            AR,
            AR_001,
            AR_AE,
            AR_BH,
            AR_DJ,
            AR_DZ,
            AR_EG,
            AR_EH,
            AR_ER,
            AR_IL,
            AR_IQ,
            AR_JO,
            AR_KM,
            AR_KW,
            AR_LB,
            AR_LY,
            AR_MA,
            AR_MR,
            AR_OM,
            AR_PS,
            AR_QA,
            AR_SA,
            AR_SD,
            AR_SO,
            AR_SS,
            AR_SY,
            AR_TD,
            AR_TN,
            AR_YE,
            AS,
            AS_IN,
            ASA,
            ASA_TZ,
            AST,
            AST_ES,
            AZ,
            AZ_AZ,
            BAS,
            BAS_CM,
            BE,
            BE_BY,
            BEM,
            BEM_ZM,
            BEZ,
            BEZ_TZ,
            BG,
            BG_BG,
            BM,
            BM_ML,
            BN,
            BN_BD,
            BN_IN,
            BO,
            BO_CN,
            BO_IN,
            BR,
            BR_FR,
            BRX,
            BRX_IN,
            BS,
            BS_BA,
            CA,
            CA_AD,
            CA_ES,
            CA_FR,
            CA_IT,
            CCP,
            CCP_BD,
            CCP_IN,
            CE,
            CE_RU,
            CEB,
            CEB_PH,
            CGG,
            CGG_UG,
            CHR,
            CHR_US,
            CKB,
            CKB_IQ,
            CKB_IR,
            CS,
            CS_CZ,
            CU,
            CU_RU,
            CY,
            CY_GB,
            DA,
            DA_DK,
            DA_GL,
            DAV,
            DAV_KE,
            DE,
            DE_AT,
            DE_BE,
            DE_CH,
            DE_DE,
            DE_GR,
            DE_IT,
            DE_LI,
            DE_LU,
            DJE,
            DJE_NE,
            DOI,
            DOI_IN,
            DSB,
            DSB_DE,
            DUA,
            DUA_CM,
            DYO,
            DYO_SN,
            DZ,
            DZ_BT,
            EBU,
            EBU_KE,
            EE,
            EE_GH,
            EE_TG,
            EL,
            EL_CY,
            EL_GR,
            EN,
            EN_001,
            EN_150,
            EN_AE,
            EN_AG,
            EN_AI,
            EN_AS,
            EN_AT,
            EN_AU,
            EN_BB,
            EN_BE,
            EN_BI,
            EN_BM,
            EN_BS,
            EN_BW,
            EN_BZ,
            EN_CA,
            EN_CC,
            EN_CH,
            EN_CK,
            EN_CM,
            EN_CN,
            EN_CX,
            EN_CY,
            EN_DE,
            EN_DG,
            EN_DK,
            EN_DM,
            EN_ER,
            EN_FI,
            EN_FJ,
            EN_FK,
            EN_FM,
            EN_GB,
            EN_GD,
            EN_GG,
            EN_GH,
            EN_GI,
            EN_GM,
            EN_GU,
            EN_GY,
            EN_HK,
            EN_IE,
            EN_IL,
            EN_IM,
            EN_IN,
            EN_IO,
            EN_JE,
            EN_JM,
            EN_KE,
            EN_KI,
            EN_KN,
            EN_KY,
            EN_LC,
            EN_LR,
            EN_LS,
            EN_LU,
            EN_MG,
            EN_MH,
            EN_MO,
            EN_MP,
            EN_MS,
            EN_MT,
            EN_MU,
            EN_MW,
            EN_MX,
            EN_MY,
            EN_NA,
            EN_NF,
            EN_NG,
            EN_NL,
            EN_NR,
            EN_NU,
            EN_NZ,
            EN_PG,
            EN_PH,
            EN_PK,
            EN_PN,
            EN_PR,
            EN_PW,
            EN_RW,
            EN_SB,
            EN_SC,
            EN_SD,
            EN_SE,
            EN_SG,
            EN_SH,
            EN_SI,
            EN_SL,
            EN_SS,
            EN_SX,
            EN_SZ,
            EN_TC,
            EN_TK,
            EN_TO,
            EN_TT,
            EN_TV,
            EN_TZ,
            EN_UG,
            EN_UM,
            EN_US,
            EN_VC,
            EN_VG,
            EN_VI,
            EN_VU,
            EN_WS,
            EN_ZA,
            EN_ZM,
            EN_ZW,
            EO,
            EO_001,
            ES,
            ES_419,
            ES_AR,
            ES_BO,
            ES_BR,
            ES_BZ,
            ES_CL,
            ES_CO,
            ES_CR,
            ES_CU,
            ES_DO,
            ES_EA,
            ES_EC,
            ES_ES,
            ES_GQ,
            ES_GT,
            ES_HN,
            ES_IC,
            ES_MX,
            ES_NI,
            ES_PA,
            ES_PE,
            ES_PH,
            ES_PR,
            ES_PY,
            ES_SV,
            ES_US,
            ES_UY,
            ES_VE,
            ET,
            ET_EE,
            EU,
            EU_ES,
            EWO,
            EWO_CM,
            FA,
            FA_AF,
            FA_IR,
            FF,
            FF_BF,
            FF_CM,
            FF_GH,
            FF_GM,
            FF_GN,
            FF_GW,
            FF_LR,
            FF_MR,
            FF_NE,
            FF_NG,
            FF_SL,
            FF_SN,
            FI,
            FI_FI,
            FIL,
            FIL_PH,
            FO,
            FO_DK,
            FO_FO,
            FR,
            FR_BE,
            FR_BF,
            FR_BI,
            FR_BJ,
            FR_BL,
            FR_CA,
            FR_CD,
            FR_CF,
            FR_CG,
            FR_CH,
            FR_CI,
            FR_CM,
            FR_DJ,
            FR_DZ,
            FR_FR,
            FR_GA,
            FR_GF,
            FR_GN,
            FR_GP,
            FR_GQ,
            FR_HT,
            FR_KM,
            FR_LU,
            FR_MA,
            FR_MC,
            FR_MF,
            FR_MG,
            FR_ML,
            FR_MQ,
            FR_MR,
            FR_MU,
            FR_NC,
            FR_NE,
            FR_PF,
            FR_PM,
            FR_RE,
            FR_RW,
            FR_SC,
            FR_SN,
            FR_SY,
            FR_TD,
            FR_TG,
            FR_TN,
            FR_VU,
            FR_WF,
            FR_YT,
            FUR,
            FUR_IT,
            FY,
            FY_NL,
            GA,
            GA_GB,
            GA_IE,
            GD,
            GD_GB,
            GL,
            GL_ES,
            GSW,
            GSW_CH,
            GSW_FR,
            GSW_LI,
            GU,
            GU_IN,
            GUZ,
            GUZ_KE,
            GV,
            GV_IM,
            HA,
            HA_GH,
            HA_NE,
            HA_NG,
            HAW,
            HAW_US,
            HE,
            HI,
            HI_IN,
            HR,
            HR_BA,
            HR_HR,
            HSB,
            HSB_DE,
            HU,
            HU_HU,
            HY,
            HY_AM,
            IA,
            IA_001,
            ID,
            IG,
            IG_NG,
            II,
            II_CN,
            ID_ID,
            IS,
            IS_IS,
            IT,
            IT_CH,
            IT_IT,
            IT_SM,
            IT_VA,
            HE_IL,
            JA,
            JA_JP,
            JGO,
            JGO_CM,
            YI,
            YI_001,
            JMC,
            JMC_TZ,
            JV,
            JV_ID,
            KA,
            KA_GE,
            KAB,
            KAB_DZ,
            KAM,
            KAM_KE,
            KDE,
            KDE_TZ,
            KEA,
            KEA_CV,
            KHQ,
            KHQ_ML,
            KI,
            KI_KE,
            KK,
            KK_KZ,
            KKJ,
            KKJ_CM,
            KL,
            KL_GL,
            KLN,
            KLN_KE,
            KM,
            KM_KH,
            KN,
            KN_IN,
            KO,
            KO_KP,
            KO_KR,
            KOK,
            KOK_IN,
            KS,
            KS_IN,
            KSB,
            KSB_TZ,
            KSF,
            KSF_CM,
            KSH,
            KSH_DE,
            KW,
            KW_GB,
            KU,
            KU_TR,
            KY,
            KY_KG,
            LAG,
            LAG_TZ,
            LB,
            LB_LU,
            LG,
            LG_UG,
            LKT,
            LKT_US,
            LN,
            LN_AO,
            LN_CD,
            LN_CF,
            LN_CG,
            LO,
            LO_LA,
            LRC,
            LRC_IQ,
            LRC_IR,
            LT,
            LT_LT,
            LU,
            LU_CD,
            LUO,
            LUO_KE,
            LUY,
            LUY_KE,
            LV,
            LV_LV,
            MAI,
            MAI_IN,
            MAS,
            MAS_KE,
            MAS_TZ,
            MER,
            MER_KE,
            MFE,
            MFE_MU,
            MG,
            MG_MG,
            MGH,
            MGH_MZ,
            MGO,
            MGO_CM,
            MI,
            MI_NZ,
            MK,
            MK_MK,
            ML,
            ML_IN,
            MN,
            MN_MN,
            MNI,
            MNI_IN,
            MR,
            MR_IN,
            MS,
            MS_BN,
            MS_ID,
            MS_MY,
            MS_SG,
            MT,
            MT_MT,
            MUA,
            MUA_CM,
            MY,
            MY_MM,
            MZN,
            MZN_IR,
            NAQ,
            NAQ_NA,
            NB,
            NB_NO,
            NB_SJ,
            ND,
            ND_ZW,
            NDS,
            NDS_DE,
            NDS_NL,
            NE,
            NE_IN,
            NE_NP,
            NL,
            NL_AW,
            NL_BE,
            NL_CH,
            NL_BQ,
            NL_CW,
            NL_LU,
            NL_NL,
            NL_SR,
            NL_SX,
            NMG,
            NMG_CM,
            NN,
            NN_NO,
            NNH,
            NNH_CM,
            NO,
            NO_NO,
            NUS,
            NUS_SS,
            NYN,
            NYN_UG,
            OM,
            OM_ET,
            OM_KE,
            OR,
            OR_IN,
            OS,
            OS_GE,
            OS_RU,
            PA,
            PA_IN,
            PA_PK,
            PCM,
            PCM_NG,
            PL,
            PL_PL,
            PRG,
            PRG_001,
            PS,
            PS_AF,
            PS_PK,
            PT,
            PT_AO,
            PT_BR,
            PT_CH,
            PT_CV,
            PT_GQ,
            PT_GW,
            PT_LU,
            PT_MO,
            PT_MZ,
            PT_PT,
            PT_ST,
            PT_TL,
            QU,
            QU_BO,
            QU_EC,
            QU_PE,
            RM,
            RM_CH,
            RN,
            RN_BI,
            RO,
            RO_MD,
            RO_RO,
            ROF,
            ROF_TZ,
            RU,
            RU_BY,
            RU_KG,
            RU_KZ,
            RU_MD,
            RU_RU,
            RU_UA,
            RW,
            RW_RW,
            RWK,
            RWK_TZ,
            SA,
            SA_IN,
            SAH,
            SAH_RU,
            SAQ,
            SAQ_KE,
            SAT,
            SAT_IN,
            SBP,
            SBP_TZ,
            SD,
            SD_IN,
            SD_PK,
            SE,
            SE_FI,
            SE_NO,
            SE_SE,
            SEH,
            SEH_MZ,
            SES,
            SES_ML,
            SG,
            SG_CF,
            SHI,
            SHI_MA,
            SI,
            SI_LK,
            SK,
            SK_SK,
            SL,
            SL_SI,
            SMN,
            SMN_FI,
            SN,
            SN_ZW,
            SO,
            SO_DJ,
            SO_ET,
            SO_KE,
            SO_SO,
            SQ,
            SQ_AL,
            SQ_MK,
            SQ_XK,
            SR,
            SR_BA,
            SR_CS,
            SR_ME,
            SR_RS,
            SR_XK,
            SU,
            SU_ID,
            SV,
            SV_AX,
            SV_FI,
            SV_SE,
            SW,
            SW_CD,
            SW_KE,
            SW_TZ,
            SW_UG,
            SY,
            TA,
            TA_IN,
            TA_LK,
            TA_MY,
            TA_SG,
            TE,
            TE_IN,
            TEO,
            TEO_KE,
            TEO_UG,
            TG,
            TG_TJ,
            TH,
            TH_TH,
            TI,
            TI_ER,
            TI_ET,
            TK,
            TK_TM,
            TL,
            TO,
            TO_TO,
            TR,
            TR_CY,
            TR_TR,
            TT,
            TT_RU,
            TWQ,
            TWQ_NE,
            TZM,
            TZM_MA,
            UG,
            UG_CN,
            UK,
            UK_UA,
            UR,
            UR_IN,
            UR_PK,
            UZ,
            UZ_AF,
            UZ_UZ,
            VAI,
            VAI_LR,
            VI,
            VI_VN,
            VO,
            VO_001,
            VUN,
            VUN_TZ,
            WAE,
            WAE_CH,
            WO,
            WO_SN,
            XH,
            XH_ZA,
            XOG,
            XOG_UG,
            YAV,
            YAV_CM,
            YO,
            YO_BJ,
            YO_NG,
            YUE,
            YUE_CN,
            YUE_HK,
            ZGH,
            ZGH_MA,
            ZH,
            ZH_CN,
            ZH_HK,
            ZH_MO,
            ZH_SG,
            ZH_TW,
            ZH_HANS,
            ZH_HANT,
            ZU,
            ZU_ZA,
        }

        /**
         * An enum containing [Language]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Language] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            AF,
            AF_NA,
            AF_ZA,
            AGQ,
            AGQ_CM,
            AK,
            AK_GH,
            AM,
            AM_ET,
            AR,
            AR_001,
            AR_AE,
            AR_BH,
            AR_DJ,
            AR_DZ,
            AR_EG,
            AR_EH,
            AR_ER,
            AR_IL,
            AR_IQ,
            AR_JO,
            AR_KM,
            AR_KW,
            AR_LB,
            AR_LY,
            AR_MA,
            AR_MR,
            AR_OM,
            AR_PS,
            AR_QA,
            AR_SA,
            AR_SD,
            AR_SO,
            AR_SS,
            AR_SY,
            AR_TD,
            AR_TN,
            AR_YE,
            AS,
            AS_IN,
            ASA,
            ASA_TZ,
            AST,
            AST_ES,
            AZ,
            AZ_AZ,
            BAS,
            BAS_CM,
            BE,
            BE_BY,
            BEM,
            BEM_ZM,
            BEZ,
            BEZ_TZ,
            BG,
            BG_BG,
            BM,
            BM_ML,
            BN,
            BN_BD,
            BN_IN,
            BO,
            BO_CN,
            BO_IN,
            BR,
            BR_FR,
            BRX,
            BRX_IN,
            BS,
            BS_BA,
            CA,
            CA_AD,
            CA_ES,
            CA_FR,
            CA_IT,
            CCP,
            CCP_BD,
            CCP_IN,
            CE,
            CE_RU,
            CEB,
            CEB_PH,
            CGG,
            CGG_UG,
            CHR,
            CHR_US,
            CKB,
            CKB_IQ,
            CKB_IR,
            CS,
            CS_CZ,
            CU,
            CU_RU,
            CY,
            CY_GB,
            DA,
            DA_DK,
            DA_GL,
            DAV,
            DAV_KE,
            DE,
            DE_AT,
            DE_BE,
            DE_CH,
            DE_DE,
            DE_GR,
            DE_IT,
            DE_LI,
            DE_LU,
            DJE,
            DJE_NE,
            DOI,
            DOI_IN,
            DSB,
            DSB_DE,
            DUA,
            DUA_CM,
            DYO,
            DYO_SN,
            DZ,
            DZ_BT,
            EBU,
            EBU_KE,
            EE,
            EE_GH,
            EE_TG,
            EL,
            EL_CY,
            EL_GR,
            EN,
            EN_001,
            EN_150,
            EN_AE,
            EN_AG,
            EN_AI,
            EN_AS,
            EN_AT,
            EN_AU,
            EN_BB,
            EN_BE,
            EN_BI,
            EN_BM,
            EN_BS,
            EN_BW,
            EN_BZ,
            EN_CA,
            EN_CC,
            EN_CH,
            EN_CK,
            EN_CM,
            EN_CN,
            EN_CX,
            EN_CY,
            EN_DE,
            EN_DG,
            EN_DK,
            EN_DM,
            EN_ER,
            EN_FI,
            EN_FJ,
            EN_FK,
            EN_FM,
            EN_GB,
            EN_GD,
            EN_GG,
            EN_GH,
            EN_GI,
            EN_GM,
            EN_GU,
            EN_GY,
            EN_HK,
            EN_IE,
            EN_IL,
            EN_IM,
            EN_IN,
            EN_IO,
            EN_JE,
            EN_JM,
            EN_KE,
            EN_KI,
            EN_KN,
            EN_KY,
            EN_LC,
            EN_LR,
            EN_LS,
            EN_LU,
            EN_MG,
            EN_MH,
            EN_MO,
            EN_MP,
            EN_MS,
            EN_MT,
            EN_MU,
            EN_MW,
            EN_MX,
            EN_MY,
            EN_NA,
            EN_NF,
            EN_NG,
            EN_NL,
            EN_NR,
            EN_NU,
            EN_NZ,
            EN_PG,
            EN_PH,
            EN_PK,
            EN_PN,
            EN_PR,
            EN_PW,
            EN_RW,
            EN_SB,
            EN_SC,
            EN_SD,
            EN_SE,
            EN_SG,
            EN_SH,
            EN_SI,
            EN_SL,
            EN_SS,
            EN_SX,
            EN_SZ,
            EN_TC,
            EN_TK,
            EN_TO,
            EN_TT,
            EN_TV,
            EN_TZ,
            EN_UG,
            EN_UM,
            EN_US,
            EN_VC,
            EN_VG,
            EN_VI,
            EN_VU,
            EN_WS,
            EN_ZA,
            EN_ZM,
            EN_ZW,
            EO,
            EO_001,
            ES,
            ES_419,
            ES_AR,
            ES_BO,
            ES_BR,
            ES_BZ,
            ES_CL,
            ES_CO,
            ES_CR,
            ES_CU,
            ES_DO,
            ES_EA,
            ES_EC,
            ES_ES,
            ES_GQ,
            ES_GT,
            ES_HN,
            ES_IC,
            ES_MX,
            ES_NI,
            ES_PA,
            ES_PE,
            ES_PH,
            ES_PR,
            ES_PY,
            ES_SV,
            ES_US,
            ES_UY,
            ES_VE,
            ET,
            ET_EE,
            EU,
            EU_ES,
            EWO,
            EWO_CM,
            FA,
            FA_AF,
            FA_IR,
            FF,
            FF_BF,
            FF_CM,
            FF_GH,
            FF_GM,
            FF_GN,
            FF_GW,
            FF_LR,
            FF_MR,
            FF_NE,
            FF_NG,
            FF_SL,
            FF_SN,
            FI,
            FI_FI,
            FIL,
            FIL_PH,
            FO,
            FO_DK,
            FO_FO,
            FR,
            FR_BE,
            FR_BF,
            FR_BI,
            FR_BJ,
            FR_BL,
            FR_CA,
            FR_CD,
            FR_CF,
            FR_CG,
            FR_CH,
            FR_CI,
            FR_CM,
            FR_DJ,
            FR_DZ,
            FR_FR,
            FR_GA,
            FR_GF,
            FR_GN,
            FR_GP,
            FR_GQ,
            FR_HT,
            FR_KM,
            FR_LU,
            FR_MA,
            FR_MC,
            FR_MF,
            FR_MG,
            FR_ML,
            FR_MQ,
            FR_MR,
            FR_MU,
            FR_NC,
            FR_NE,
            FR_PF,
            FR_PM,
            FR_RE,
            FR_RW,
            FR_SC,
            FR_SN,
            FR_SY,
            FR_TD,
            FR_TG,
            FR_TN,
            FR_VU,
            FR_WF,
            FR_YT,
            FUR,
            FUR_IT,
            FY,
            FY_NL,
            GA,
            GA_GB,
            GA_IE,
            GD,
            GD_GB,
            GL,
            GL_ES,
            GSW,
            GSW_CH,
            GSW_FR,
            GSW_LI,
            GU,
            GU_IN,
            GUZ,
            GUZ_KE,
            GV,
            GV_IM,
            HA,
            HA_GH,
            HA_NE,
            HA_NG,
            HAW,
            HAW_US,
            HE,
            HI,
            HI_IN,
            HR,
            HR_BA,
            HR_HR,
            HSB,
            HSB_DE,
            HU,
            HU_HU,
            HY,
            HY_AM,
            IA,
            IA_001,
            ID,
            IG,
            IG_NG,
            II,
            II_CN,
            ID_ID,
            IS,
            IS_IS,
            IT,
            IT_CH,
            IT_IT,
            IT_SM,
            IT_VA,
            HE_IL,
            JA,
            JA_JP,
            JGO,
            JGO_CM,
            YI,
            YI_001,
            JMC,
            JMC_TZ,
            JV,
            JV_ID,
            KA,
            KA_GE,
            KAB,
            KAB_DZ,
            KAM,
            KAM_KE,
            KDE,
            KDE_TZ,
            KEA,
            KEA_CV,
            KHQ,
            KHQ_ML,
            KI,
            KI_KE,
            KK,
            KK_KZ,
            KKJ,
            KKJ_CM,
            KL,
            KL_GL,
            KLN,
            KLN_KE,
            KM,
            KM_KH,
            KN,
            KN_IN,
            KO,
            KO_KP,
            KO_KR,
            KOK,
            KOK_IN,
            KS,
            KS_IN,
            KSB,
            KSB_TZ,
            KSF,
            KSF_CM,
            KSH,
            KSH_DE,
            KW,
            KW_GB,
            KU,
            KU_TR,
            KY,
            KY_KG,
            LAG,
            LAG_TZ,
            LB,
            LB_LU,
            LG,
            LG_UG,
            LKT,
            LKT_US,
            LN,
            LN_AO,
            LN_CD,
            LN_CF,
            LN_CG,
            LO,
            LO_LA,
            LRC,
            LRC_IQ,
            LRC_IR,
            LT,
            LT_LT,
            LU,
            LU_CD,
            LUO,
            LUO_KE,
            LUY,
            LUY_KE,
            LV,
            LV_LV,
            MAI,
            MAI_IN,
            MAS,
            MAS_KE,
            MAS_TZ,
            MER,
            MER_KE,
            MFE,
            MFE_MU,
            MG,
            MG_MG,
            MGH,
            MGH_MZ,
            MGO,
            MGO_CM,
            MI,
            MI_NZ,
            MK,
            MK_MK,
            ML,
            ML_IN,
            MN,
            MN_MN,
            MNI,
            MNI_IN,
            MR,
            MR_IN,
            MS,
            MS_BN,
            MS_ID,
            MS_MY,
            MS_SG,
            MT,
            MT_MT,
            MUA,
            MUA_CM,
            MY,
            MY_MM,
            MZN,
            MZN_IR,
            NAQ,
            NAQ_NA,
            NB,
            NB_NO,
            NB_SJ,
            ND,
            ND_ZW,
            NDS,
            NDS_DE,
            NDS_NL,
            NE,
            NE_IN,
            NE_NP,
            NL,
            NL_AW,
            NL_BE,
            NL_CH,
            NL_BQ,
            NL_CW,
            NL_LU,
            NL_NL,
            NL_SR,
            NL_SX,
            NMG,
            NMG_CM,
            NN,
            NN_NO,
            NNH,
            NNH_CM,
            NO,
            NO_NO,
            NUS,
            NUS_SS,
            NYN,
            NYN_UG,
            OM,
            OM_ET,
            OM_KE,
            OR,
            OR_IN,
            OS,
            OS_GE,
            OS_RU,
            PA,
            PA_IN,
            PA_PK,
            PCM,
            PCM_NG,
            PL,
            PL_PL,
            PRG,
            PRG_001,
            PS,
            PS_AF,
            PS_PK,
            PT,
            PT_AO,
            PT_BR,
            PT_CH,
            PT_CV,
            PT_GQ,
            PT_GW,
            PT_LU,
            PT_MO,
            PT_MZ,
            PT_PT,
            PT_ST,
            PT_TL,
            QU,
            QU_BO,
            QU_EC,
            QU_PE,
            RM,
            RM_CH,
            RN,
            RN_BI,
            RO,
            RO_MD,
            RO_RO,
            ROF,
            ROF_TZ,
            RU,
            RU_BY,
            RU_KG,
            RU_KZ,
            RU_MD,
            RU_RU,
            RU_UA,
            RW,
            RW_RW,
            RWK,
            RWK_TZ,
            SA,
            SA_IN,
            SAH,
            SAH_RU,
            SAQ,
            SAQ_KE,
            SAT,
            SAT_IN,
            SBP,
            SBP_TZ,
            SD,
            SD_IN,
            SD_PK,
            SE,
            SE_FI,
            SE_NO,
            SE_SE,
            SEH,
            SEH_MZ,
            SES,
            SES_ML,
            SG,
            SG_CF,
            SHI,
            SHI_MA,
            SI,
            SI_LK,
            SK,
            SK_SK,
            SL,
            SL_SI,
            SMN,
            SMN_FI,
            SN,
            SN_ZW,
            SO,
            SO_DJ,
            SO_ET,
            SO_KE,
            SO_SO,
            SQ,
            SQ_AL,
            SQ_MK,
            SQ_XK,
            SR,
            SR_BA,
            SR_CS,
            SR_ME,
            SR_RS,
            SR_XK,
            SU,
            SU_ID,
            SV,
            SV_AX,
            SV_FI,
            SV_SE,
            SW,
            SW_CD,
            SW_KE,
            SW_TZ,
            SW_UG,
            SY,
            TA,
            TA_IN,
            TA_LK,
            TA_MY,
            TA_SG,
            TE,
            TE_IN,
            TEO,
            TEO_KE,
            TEO_UG,
            TG,
            TG_TJ,
            TH,
            TH_TH,
            TI,
            TI_ER,
            TI_ET,
            TK,
            TK_TM,
            TL,
            TO,
            TO_TO,
            TR,
            TR_CY,
            TR_TR,
            TT,
            TT_RU,
            TWQ,
            TWQ_NE,
            TZM,
            TZM_MA,
            UG,
            UG_CN,
            UK,
            UK_UA,
            UR,
            UR_IN,
            UR_PK,
            UZ,
            UZ_AF,
            UZ_UZ,
            VAI,
            VAI_LR,
            VI,
            VI_VN,
            VO,
            VO_001,
            VUN,
            VUN_TZ,
            WAE,
            WAE_CH,
            WO,
            WO_SN,
            XH,
            XH_ZA,
            XOG,
            XOG_UG,
            YAV,
            YAV_CM,
            YO,
            YO_BJ,
            YO_NG,
            YUE,
            YUE_CN,
            YUE_HK,
            ZGH,
            ZGH_MA,
            ZH,
            ZH_CN,
            ZH_HK,
            ZH_MO,
            ZH_SG,
            ZH_TW,
            ZH_HANS,
            ZH_HANT,
            ZU,
            ZU_ZA,
            /** An enum member indicating that [Language] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                AF -> Value.AF
                AF_NA -> Value.AF_NA
                AF_ZA -> Value.AF_ZA
                AGQ -> Value.AGQ
                AGQ_CM -> Value.AGQ_CM
                AK -> Value.AK
                AK_GH -> Value.AK_GH
                AM -> Value.AM
                AM_ET -> Value.AM_ET
                AR -> Value.AR
                AR_001 -> Value.AR_001
                AR_AE -> Value.AR_AE
                AR_BH -> Value.AR_BH
                AR_DJ -> Value.AR_DJ
                AR_DZ -> Value.AR_DZ
                AR_EG -> Value.AR_EG
                AR_EH -> Value.AR_EH
                AR_ER -> Value.AR_ER
                AR_IL -> Value.AR_IL
                AR_IQ -> Value.AR_IQ
                AR_JO -> Value.AR_JO
                AR_KM -> Value.AR_KM
                AR_KW -> Value.AR_KW
                AR_LB -> Value.AR_LB
                AR_LY -> Value.AR_LY
                AR_MA -> Value.AR_MA
                AR_MR -> Value.AR_MR
                AR_OM -> Value.AR_OM
                AR_PS -> Value.AR_PS
                AR_QA -> Value.AR_QA
                AR_SA -> Value.AR_SA
                AR_SD -> Value.AR_SD
                AR_SO -> Value.AR_SO
                AR_SS -> Value.AR_SS
                AR_SY -> Value.AR_SY
                AR_TD -> Value.AR_TD
                AR_TN -> Value.AR_TN
                AR_YE -> Value.AR_YE
                AS -> Value.AS
                AS_IN -> Value.AS_IN
                ASA -> Value.ASA
                ASA_TZ -> Value.ASA_TZ
                AST -> Value.AST
                AST_ES -> Value.AST_ES
                AZ -> Value.AZ
                AZ_AZ -> Value.AZ_AZ
                BAS -> Value.BAS
                BAS_CM -> Value.BAS_CM
                BE -> Value.BE
                BE_BY -> Value.BE_BY
                BEM -> Value.BEM
                BEM_ZM -> Value.BEM_ZM
                BEZ -> Value.BEZ
                BEZ_TZ -> Value.BEZ_TZ
                BG -> Value.BG
                BG_BG -> Value.BG_BG
                BM -> Value.BM
                BM_ML -> Value.BM_ML
                BN -> Value.BN
                BN_BD -> Value.BN_BD
                BN_IN -> Value.BN_IN
                BO -> Value.BO
                BO_CN -> Value.BO_CN
                BO_IN -> Value.BO_IN
                BR -> Value.BR
                BR_FR -> Value.BR_FR
                BRX -> Value.BRX
                BRX_IN -> Value.BRX_IN
                BS -> Value.BS
                BS_BA -> Value.BS_BA
                CA -> Value.CA
                CA_AD -> Value.CA_AD
                CA_ES -> Value.CA_ES
                CA_FR -> Value.CA_FR
                CA_IT -> Value.CA_IT
                CCP -> Value.CCP
                CCP_BD -> Value.CCP_BD
                CCP_IN -> Value.CCP_IN
                CE -> Value.CE
                CE_RU -> Value.CE_RU
                CEB -> Value.CEB
                CEB_PH -> Value.CEB_PH
                CGG -> Value.CGG
                CGG_UG -> Value.CGG_UG
                CHR -> Value.CHR
                CHR_US -> Value.CHR_US
                CKB -> Value.CKB
                CKB_IQ -> Value.CKB_IQ
                CKB_IR -> Value.CKB_IR
                CS -> Value.CS
                CS_CZ -> Value.CS_CZ
                CU -> Value.CU
                CU_RU -> Value.CU_RU
                CY -> Value.CY
                CY_GB -> Value.CY_GB
                DA -> Value.DA
                DA_DK -> Value.DA_DK
                DA_GL -> Value.DA_GL
                DAV -> Value.DAV
                DAV_KE -> Value.DAV_KE
                DE -> Value.DE
                DE_AT -> Value.DE_AT
                DE_BE -> Value.DE_BE
                DE_CH -> Value.DE_CH
                DE_DE -> Value.DE_DE
                DE_GR -> Value.DE_GR
                DE_IT -> Value.DE_IT
                DE_LI -> Value.DE_LI
                DE_LU -> Value.DE_LU
                DJE -> Value.DJE
                DJE_NE -> Value.DJE_NE
                DOI -> Value.DOI
                DOI_IN -> Value.DOI_IN
                DSB -> Value.DSB
                DSB_DE -> Value.DSB_DE
                DUA -> Value.DUA
                DUA_CM -> Value.DUA_CM
                DYO -> Value.DYO
                DYO_SN -> Value.DYO_SN
                DZ -> Value.DZ
                DZ_BT -> Value.DZ_BT
                EBU -> Value.EBU
                EBU_KE -> Value.EBU_KE
                EE -> Value.EE
                EE_GH -> Value.EE_GH
                EE_TG -> Value.EE_TG
                EL -> Value.EL
                EL_CY -> Value.EL_CY
                EL_GR -> Value.EL_GR
                EN -> Value.EN
                EN_001 -> Value.EN_001
                EN_150 -> Value.EN_150
                EN_AE -> Value.EN_AE
                EN_AG -> Value.EN_AG
                EN_AI -> Value.EN_AI
                EN_AS -> Value.EN_AS
                EN_AT -> Value.EN_AT
                EN_AU -> Value.EN_AU
                EN_BB -> Value.EN_BB
                EN_BE -> Value.EN_BE
                EN_BI -> Value.EN_BI
                EN_BM -> Value.EN_BM
                EN_BS -> Value.EN_BS
                EN_BW -> Value.EN_BW
                EN_BZ -> Value.EN_BZ
                EN_CA -> Value.EN_CA
                EN_CC -> Value.EN_CC
                EN_CH -> Value.EN_CH
                EN_CK -> Value.EN_CK
                EN_CM -> Value.EN_CM
                EN_CN -> Value.EN_CN
                EN_CX -> Value.EN_CX
                EN_CY -> Value.EN_CY
                EN_DE -> Value.EN_DE
                EN_DG -> Value.EN_DG
                EN_DK -> Value.EN_DK
                EN_DM -> Value.EN_DM
                EN_ER -> Value.EN_ER
                EN_FI -> Value.EN_FI
                EN_FJ -> Value.EN_FJ
                EN_FK -> Value.EN_FK
                EN_FM -> Value.EN_FM
                EN_GB -> Value.EN_GB
                EN_GD -> Value.EN_GD
                EN_GG -> Value.EN_GG
                EN_GH -> Value.EN_GH
                EN_GI -> Value.EN_GI
                EN_GM -> Value.EN_GM
                EN_GU -> Value.EN_GU
                EN_GY -> Value.EN_GY
                EN_HK -> Value.EN_HK
                EN_IE -> Value.EN_IE
                EN_IL -> Value.EN_IL
                EN_IM -> Value.EN_IM
                EN_IN -> Value.EN_IN
                EN_IO -> Value.EN_IO
                EN_JE -> Value.EN_JE
                EN_JM -> Value.EN_JM
                EN_KE -> Value.EN_KE
                EN_KI -> Value.EN_KI
                EN_KN -> Value.EN_KN
                EN_KY -> Value.EN_KY
                EN_LC -> Value.EN_LC
                EN_LR -> Value.EN_LR
                EN_LS -> Value.EN_LS
                EN_LU -> Value.EN_LU
                EN_MG -> Value.EN_MG
                EN_MH -> Value.EN_MH
                EN_MO -> Value.EN_MO
                EN_MP -> Value.EN_MP
                EN_MS -> Value.EN_MS
                EN_MT -> Value.EN_MT
                EN_MU -> Value.EN_MU
                EN_MW -> Value.EN_MW
                EN_MX -> Value.EN_MX
                EN_MY -> Value.EN_MY
                EN_NA -> Value.EN_NA
                EN_NF -> Value.EN_NF
                EN_NG -> Value.EN_NG
                EN_NL -> Value.EN_NL
                EN_NR -> Value.EN_NR
                EN_NU -> Value.EN_NU
                EN_NZ -> Value.EN_NZ
                EN_PG -> Value.EN_PG
                EN_PH -> Value.EN_PH
                EN_PK -> Value.EN_PK
                EN_PN -> Value.EN_PN
                EN_PR -> Value.EN_PR
                EN_PW -> Value.EN_PW
                EN_RW -> Value.EN_RW
                EN_SB -> Value.EN_SB
                EN_SC -> Value.EN_SC
                EN_SD -> Value.EN_SD
                EN_SE -> Value.EN_SE
                EN_SG -> Value.EN_SG
                EN_SH -> Value.EN_SH
                EN_SI -> Value.EN_SI
                EN_SL -> Value.EN_SL
                EN_SS -> Value.EN_SS
                EN_SX -> Value.EN_SX
                EN_SZ -> Value.EN_SZ
                EN_TC -> Value.EN_TC
                EN_TK -> Value.EN_TK
                EN_TO -> Value.EN_TO
                EN_TT -> Value.EN_TT
                EN_TV -> Value.EN_TV
                EN_TZ -> Value.EN_TZ
                EN_UG -> Value.EN_UG
                EN_UM -> Value.EN_UM
                EN_US -> Value.EN_US
                EN_VC -> Value.EN_VC
                EN_VG -> Value.EN_VG
                EN_VI -> Value.EN_VI
                EN_VU -> Value.EN_VU
                EN_WS -> Value.EN_WS
                EN_ZA -> Value.EN_ZA
                EN_ZM -> Value.EN_ZM
                EN_ZW -> Value.EN_ZW
                EO -> Value.EO
                EO_001 -> Value.EO_001
                ES -> Value.ES
                ES_419 -> Value.ES_419
                ES_AR -> Value.ES_AR
                ES_BO -> Value.ES_BO
                ES_BR -> Value.ES_BR
                ES_BZ -> Value.ES_BZ
                ES_CL -> Value.ES_CL
                ES_CO -> Value.ES_CO
                ES_CR -> Value.ES_CR
                ES_CU -> Value.ES_CU
                ES_DO -> Value.ES_DO
                ES_EA -> Value.ES_EA
                ES_EC -> Value.ES_EC
                ES_ES -> Value.ES_ES
                ES_GQ -> Value.ES_GQ
                ES_GT -> Value.ES_GT
                ES_HN -> Value.ES_HN
                ES_IC -> Value.ES_IC
                ES_MX -> Value.ES_MX
                ES_NI -> Value.ES_NI
                ES_PA -> Value.ES_PA
                ES_PE -> Value.ES_PE
                ES_PH -> Value.ES_PH
                ES_PR -> Value.ES_PR
                ES_PY -> Value.ES_PY
                ES_SV -> Value.ES_SV
                ES_US -> Value.ES_US
                ES_UY -> Value.ES_UY
                ES_VE -> Value.ES_VE
                ET -> Value.ET
                ET_EE -> Value.ET_EE
                EU -> Value.EU
                EU_ES -> Value.EU_ES
                EWO -> Value.EWO
                EWO_CM -> Value.EWO_CM
                FA -> Value.FA
                FA_AF -> Value.FA_AF
                FA_IR -> Value.FA_IR
                FF -> Value.FF
                FF_BF -> Value.FF_BF
                FF_CM -> Value.FF_CM
                FF_GH -> Value.FF_GH
                FF_GM -> Value.FF_GM
                FF_GN -> Value.FF_GN
                FF_GW -> Value.FF_GW
                FF_LR -> Value.FF_LR
                FF_MR -> Value.FF_MR
                FF_NE -> Value.FF_NE
                FF_NG -> Value.FF_NG
                FF_SL -> Value.FF_SL
                FF_SN -> Value.FF_SN
                FI -> Value.FI
                FI_FI -> Value.FI_FI
                FIL -> Value.FIL
                FIL_PH -> Value.FIL_PH
                FO -> Value.FO
                FO_DK -> Value.FO_DK
                FO_FO -> Value.FO_FO
                FR -> Value.FR
                FR_BE -> Value.FR_BE
                FR_BF -> Value.FR_BF
                FR_BI -> Value.FR_BI
                FR_BJ -> Value.FR_BJ
                FR_BL -> Value.FR_BL
                FR_CA -> Value.FR_CA
                FR_CD -> Value.FR_CD
                FR_CF -> Value.FR_CF
                FR_CG -> Value.FR_CG
                FR_CH -> Value.FR_CH
                FR_CI -> Value.FR_CI
                FR_CM -> Value.FR_CM
                FR_DJ -> Value.FR_DJ
                FR_DZ -> Value.FR_DZ
                FR_FR -> Value.FR_FR
                FR_GA -> Value.FR_GA
                FR_GF -> Value.FR_GF
                FR_GN -> Value.FR_GN
                FR_GP -> Value.FR_GP
                FR_GQ -> Value.FR_GQ
                FR_HT -> Value.FR_HT
                FR_KM -> Value.FR_KM
                FR_LU -> Value.FR_LU
                FR_MA -> Value.FR_MA
                FR_MC -> Value.FR_MC
                FR_MF -> Value.FR_MF
                FR_MG -> Value.FR_MG
                FR_ML -> Value.FR_ML
                FR_MQ -> Value.FR_MQ
                FR_MR -> Value.FR_MR
                FR_MU -> Value.FR_MU
                FR_NC -> Value.FR_NC
                FR_NE -> Value.FR_NE
                FR_PF -> Value.FR_PF
                FR_PM -> Value.FR_PM
                FR_RE -> Value.FR_RE
                FR_RW -> Value.FR_RW
                FR_SC -> Value.FR_SC
                FR_SN -> Value.FR_SN
                FR_SY -> Value.FR_SY
                FR_TD -> Value.FR_TD
                FR_TG -> Value.FR_TG
                FR_TN -> Value.FR_TN
                FR_VU -> Value.FR_VU
                FR_WF -> Value.FR_WF
                FR_YT -> Value.FR_YT
                FUR -> Value.FUR
                FUR_IT -> Value.FUR_IT
                FY -> Value.FY
                FY_NL -> Value.FY_NL
                GA -> Value.GA
                GA_GB -> Value.GA_GB
                GA_IE -> Value.GA_IE
                GD -> Value.GD
                GD_GB -> Value.GD_GB
                GL -> Value.GL
                GL_ES -> Value.GL_ES
                GSW -> Value.GSW
                GSW_CH -> Value.GSW_CH
                GSW_FR -> Value.GSW_FR
                GSW_LI -> Value.GSW_LI
                GU -> Value.GU
                GU_IN -> Value.GU_IN
                GUZ -> Value.GUZ
                GUZ_KE -> Value.GUZ_KE
                GV -> Value.GV
                GV_IM -> Value.GV_IM
                HA -> Value.HA
                HA_GH -> Value.HA_GH
                HA_NE -> Value.HA_NE
                HA_NG -> Value.HA_NG
                HAW -> Value.HAW
                HAW_US -> Value.HAW_US
                HE -> Value.HE
                HI -> Value.HI
                HI_IN -> Value.HI_IN
                HR -> Value.HR
                HR_BA -> Value.HR_BA
                HR_HR -> Value.HR_HR
                HSB -> Value.HSB
                HSB_DE -> Value.HSB_DE
                HU -> Value.HU
                HU_HU -> Value.HU_HU
                HY -> Value.HY
                HY_AM -> Value.HY_AM
                IA -> Value.IA
                IA_001 -> Value.IA_001
                ID -> Value.ID
                IG -> Value.IG
                IG_NG -> Value.IG_NG
                II -> Value.II
                II_CN -> Value.II_CN
                ID_ID -> Value.ID_ID
                IS -> Value.IS
                IS_IS -> Value.IS_IS
                IT -> Value.IT
                IT_CH -> Value.IT_CH
                IT_IT -> Value.IT_IT
                IT_SM -> Value.IT_SM
                IT_VA -> Value.IT_VA
                HE_IL -> Value.HE_IL
                JA -> Value.JA
                JA_JP -> Value.JA_JP
                JGO -> Value.JGO
                JGO_CM -> Value.JGO_CM
                YI -> Value.YI
                YI_001 -> Value.YI_001
                JMC -> Value.JMC
                JMC_TZ -> Value.JMC_TZ
                JV -> Value.JV
                JV_ID -> Value.JV_ID
                KA -> Value.KA
                KA_GE -> Value.KA_GE
                KAB -> Value.KAB
                KAB_DZ -> Value.KAB_DZ
                KAM -> Value.KAM
                KAM_KE -> Value.KAM_KE
                KDE -> Value.KDE
                KDE_TZ -> Value.KDE_TZ
                KEA -> Value.KEA
                KEA_CV -> Value.KEA_CV
                KHQ -> Value.KHQ
                KHQ_ML -> Value.KHQ_ML
                KI -> Value.KI
                KI_KE -> Value.KI_KE
                KK -> Value.KK
                KK_KZ -> Value.KK_KZ
                KKJ -> Value.KKJ
                KKJ_CM -> Value.KKJ_CM
                KL -> Value.KL
                KL_GL -> Value.KL_GL
                KLN -> Value.KLN
                KLN_KE -> Value.KLN_KE
                KM -> Value.KM
                KM_KH -> Value.KM_KH
                KN -> Value.KN
                KN_IN -> Value.KN_IN
                KO -> Value.KO
                KO_KP -> Value.KO_KP
                KO_KR -> Value.KO_KR
                KOK -> Value.KOK
                KOK_IN -> Value.KOK_IN
                KS -> Value.KS
                KS_IN -> Value.KS_IN
                KSB -> Value.KSB
                KSB_TZ -> Value.KSB_TZ
                KSF -> Value.KSF
                KSF_CM -> Value.KSF_CM
                KSH -> Value.KSH
                KSH_DE -> Value.KSH_DE
                KW -> Value.KW
                KW_GB -> Value.KW_GB
                KU -> Value.KU
                KU_TR -> Value.KU_TR
                KY -> Value.KY
                KY_KG -> Value.KY_KG
                LAG -> Value.LAG
                LAG_TZ -> Value.LAG_TZ
                LB -> Value.LB
                LB_LU -> Value.LB_LU
                LG -> Value.LG
                LG_UG -> Value.LG_UG
                LKT -> Value.LKT
                LKT_US -> Value.LKT_US
                LN -> Value.LN
                LN_AO -> Value.LN_AO
                LN_CD -> Value.LN_CD
                LN_CF -> Value.LN_CF
                LN_CG -> Value.LN_CG
                LO -> Value.LO
                LO_LA -> Value.LO_LA
                LRC -> Value.LRC
                LRC_IQ -> Value.LRC_IQ
                LRC_IR -> Value.LRC_IR
                LT -> Value.LT
                LT_LT -> Value.LT_LT
                LU -> Value.LU
                LU_CD -> Value.LU_CD
                LUO -> Value.LUO
                LUO_KE -> Value.LUO_KE
                LUY -> Value.LUY
                LUY_KE -> Value.LUY_KE
                LV -> Value.LV
                LV_LV -> Value.LV_LV
                MAI -> Value.MAI
                MAI_IN -> Value.MAI_IN
                MAS -> Value.MAS
                MAS_KE -> Value.MAS_KE
                MAS_TZ -> Value.MAS_TZ
                MER -> Value.MER
                MER_KE -> Value.MER_KE
                MFE -> Value.MFE
                MFE_MU -> Value.MFE_MU
                MG -> Value.MG
                MG_MG -> Value.MG_MG
                MGH -> Value.MGH
                MGH_MZ -> Value.MGH_MZ
                MGO -> Value.MGO
                MGO_CM -> Value.MGO_CM
                MI -> Value.MI
                MI_NZ -> Value.MI_NZ
                MK -> Value.MK
                MK_MK -> Value.MK_MK
                ML -> Value.ML
                ML_IN -> Value.ML_IN
                MN -> Value.MN
                MN_MN -> Value.MN_MN
                MNI -> Value.MNI
                MNI_IN -> Value.MNI_IN
                MR -> Value.MR
                MR_IN -> Value.MR_IN
                MS -> Value.MS
                MS_BN -> Value.MS_BN
                MS_ID -> Value.MS_ID
                MS_MY -> Value.MS_MY
                MS_SG -> Value.MS_SG
                MT -> Value.MT
                MT_MT -> Value.MT_MT
                MUA -> Value.MUA
                MUA_CM -> Value.MUA_CM
                MY -> Value.MY
                MY_MM -> Value.MY_MM
                MZN -> Value.MZN
                MZN_IR -> Value.MZN_IR
                NAQ -> Value.NAQ
                NAQ_NA -> Value.NAQ_NA
                NB -> Value.NB
                NB_NO -> Value.NB_NO
                NB_SJ -> Value.NB_SJ
                ND -> Value.ND
                ND_ZW -> Value.ND_ZW
                NDS -> Value.NDS
                NDS_DE -> Value.NDS_DE
                NDS_NL -> Value.NDS_NL
                NE -> Value.NE
                NE_IN -> Value.NE_IN
                NE_NP -> Value.NE_NP
                NL -> Value.NL
                NL_AW -> Value.NL_AW
                NL_BE -> Value.NL_BE
                NL_CH -> Value.NL_CH
                NL_BQ -> Value.NL_BQ
                NL_CW -> Value.NL_CW
                NL_LU -> Value.NL_LU
                NL_NL -> Value.NL_NL
                NL_SR -> Value.NL_SR
                NL_SX -> Value.NL_SX
                NMG -> Value.NMG
                NMG_CM -> Value.NMG_CM
                NN -> Value.NN
                NN_NO -> Value.NN_NO
                NNH -> Value.NNH
                NNH_CM -> Value.NNH_CM
                NO -> Value.NO
                NO_NO -> Value.NO_NO
                NUS -> Value.NUS
                NUS_SS -> Value.NUS_SS
                NYN -> Value.NYN
                NYN_UG -> Value.NYN_UG
                OM -> Value.OM
                OM_ET -> Value.OM_ET
                OM_KE -> Value.OM_KE
                OR -> Value.OR
                OR_IN -> Value.OR_IN
                OS -> Value.OS
                OS_GE -> Value.OS_GE
                OS_RU -> Value.OS_RU
                PA -> Value.PA
                PA_IN -> Value.PA_IN
                PA_PK -> Value.PA_PK
                PCM -> Value.PCM
                PCM_NG -> Value.PCM_NG
                PL -> Value.PL
                PL_PL -> Value.PL_PL
                PRG -> Value.PRG
                PRG_001 -> Value.PRG_001
                PS -> Value.PS
                PS_AF -> Value.PS_AF
                PS_PK -> Value.PS_PK
                PT -> Value.PT
                PT_AO -> Value.PT_AO
                PT_BR -> Value.PT_BR
                PT_CH -> Value.PT_CH
                PT_CV -> Value.PT_CV
                PT_GQ -> Value.PT_GQ
                PT_GW -> Value.PT_GW
                PT_LU -> Value.PT_LU
                PT_MO -> Value.PT_MO
                PT_MZ -> Value.PT_MZ
                PT_PT -> Value.PT_PT
                PT_ST -> Value.PT_ST
                PT_TL -> Value.PT_TL
                QU -> Value.QU
                QU_BO -> Value.QU_BO
                QU_EC -> Value.QU_EC
                QU_PE -> Value.QU_PE
                RM -> Value.RM
                RM_CH -> Value.RM_CH
                RN -> Value.RN
                RN_BI -> Value.RN_BI
                RO -> Value.RO
                RO_MD -> Value.RO_MD
                RO_RO -> Value.RO_RO
                ROF -> Value.ROF
                ROF_TZ -> Value.ROF_TZ
                RU -> Value.RU
                RU_BY -> Value.RU_BY
                RU_KG -> Value.RU_KG
                RU_KZ -> Value.RU_KZ
                RU_MD -> Value.RU_MD
                RU_RU -> Value.RU_RU
                RU_UA -> Value.RU_UA
                RW -> Value.RW
                RW_RW -> Value.RW_RW
                RWK -> Value.RWK
                RWK_TZ -> Value.RWK_TZ
                SA -> Value.SA
                SA_IN -> Value.SA_IN
                SAH -> Value.SAH
                SAH_RU -> Value.SAH_RU
                SAQ -> Value.SAQ
                SAQ_KE -> Value.SAQ_KE
                SAT -> Value.SAT
                SAT_IN -> Value.SAT_IN
                SBP -> Value.SBP
                SBP_TZ -> Value.SBP_TZ
                SD -> Value.SD
                SD_IN -> Value.SD_IN
                SD_PK -> Value.SD_PK
                SE -> Value.SE
                SE_FI -> Value.SE_FI
                SE_NO -> Value.SE_NO
                SE_SE -> Value.SE_SE
                SEH -> Value.SEH
                SEH_MZ -> Value.SEH_MZ
                SES -> Value.SES
                SES_ML -> Value.SES_ML
                SG -> Value.SG
                SG_CF -> Value.SG_CF
                SHI -> Value.SHI
                SHI_MA -> Value.SHI_MA
                SI -> Value.SI
                SI_LK -> Value.SI_LK
                SK -> Value.SK
                SK_SK -> Value.SK_SK
                SL -> Value.SL
                SL_SI -> Value.SL_SI
                SMN -> Value.SMN
                SMN_FI -> Value.SMN_FI
                SN -> Value.SN
                SN_ZW -> Value.SN_ZW
                SO -> Value.SO
                SO_DJ -> Value.SO_DJ
                SO_ET -> Value.SO_ET
                SO_KE -> Value.SO_KE
                SO_SO -> Value.SO_SO
                SQ -> Value.SQ
                SQ_AL -> Value.SQ_AL
                SQ_MK -> Value.SQ_MK
                SQ_XK -> Value.SQ_XK
                SR -> Value.SR
                SR_BA -> Value.SR_BA
                SR_CS -> Value.SR_CS
                SR_ME -> Value.SR_ME
                SR_RS -> Value.SR_RS
                SR_XK -> Value.SR_XK
                SU -> Value.SU
                SU_ID -> Value.SU_ID
                SV -> Value.SV
                SV_AX -> Value.SV_AX
                SV_FI -> Value.SV_FI
                SV_SE -> Value.SV_SE
                SW -> Value.SW
                SW_CD -> Value.SW_CD
                SW_KE -> Value.SW_KE
                SW_TZ -> Value.SW_TZ
                SW_UG -> Value.SW_UG
                SY -> Value.SY
                TA -> Value.TA
                TA_IN -> Value.TA_IN
                TA_LK -> Value.TA_LK
                TA_MY -> Value.TA_MY
                TA_SG -> Value.TA_SG
                TE -> Value.TE
                TE_IN -> Value.TE_IN
                TEO -> Value.TEO
                TEO_KE -> Value.TEO_KE
                TEO_UG -> Value.TEO_UG
                TG -> Value.TG
                TG_TJ -> Value.TG_TJ
                TH -> Value.TH
                TH_TH -> Value.TH_TH
                TI -> Value.TI
                TI_ER -> Value.TI_ER
                TI_ET -> Value.TI_ET
                TK -> Value.TK
                TK_TM -> Value.TK_TM
                TL -> Value.TL
                TO -> Value.TO
                TO_TO -> Value.TO_TO
                TR -> Value.TR
                TR_CY -> Value.TR_CY
                TR_TR -> Value.TR_TR
                TT -> Value.TT
                TT_RU -> Value.TT_RU
                TWQ -> Value.TWQ
                TWQ_NE -> Value.TWQ_NE
                TZM -> Value.TZM
                TZM_MA -> Value.TZM_MA
                UG -> Value.UG
                UG_CN -> Value.UG_CN
                UK -> Value.UK
                UK_UA -> Value.UK_UA
                UR -> Value.UR
                UR_IN -> Value.UR_IN
                UR_PK -> Value.UR_PK
                UZ -> Value.UZ
                UZ_AF -> Value.UZ_AF
                UZ_UZ -> Value.UZ_UZ
                VAI -> Value.VAI
                VAI_LR -> Value.VAI_LR
                VI -> Value.VI
                VI_VN -> Value.VI_VN
                VO -> Value.VO
                VO_001 -> Value.VO_001
                VUN -> Value.VUN
                VUN_TZ -> Value.VUN_TZ
                WAE -> Value.WAE
                WAE_CH -> Value.WAE_CH
                WO -> Value.WO
                WO_SN -> Value.WO_SN
                XH -> Value.XH
                XH_ZA -> Value.XH_ZA
                XOG -> Value.XOG
                XOG_UG -> Value.XOG_UG
                YAV -> Value.YAV
                YAV_CM -> Value.YAV_CM
                YO -> Value.YO
                YO_BJ -> Value.YO_BJ
                YO_NG -> Value.YO_NG
                YUE -> Value.YUE
                YUE_CN -> Value.YUE_CN
                YUE_HK -> Value.YUE_HK
                ZGH -> Value.ZGH
                ZGH_MA -> Value.ZGH_MA
                ZH -> Value.ZH
                ZH_CN -> Value.ZH_CN
                ZH_HK -> Value.ZH_HK
                ZH_MO -> Value.ZH_MO
                ZH_SG -> Value.ZH_SG
                ZH_TW -> Value.ZH_TW
                ZH_HANS -> Value.ZH_HANS
                ZH_HANT -> Value.ZH_HANT
                ZU -> Value.ZU
                ZU_ZA -> Value.ZU_ZA
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws HubspotInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                AF -> Known.AF
                AF_NA -> Known.AF_NA
                AF_ZA -> Known.AF_ZA
                AGQ -> Known.AGQ
                AGQ_CM -> Known.AGQ_CM
                AK -> Known.AK
                AK_GH -> Known.AK_GH
                AM -> Known.AM
                AM_ET -> Known.AM_ET
                AR -> Known.AR
                AR_001 -> Known.AR_001
                AR_AE -> Known.AR_AE
                AR_BH -> Known.AR_BH
                AR_DJ -> Known.AR_DJ
                AR_DZ -> Known.AR_DZ
                AR_EG -> Known.AR_EG
                AR_EH -> Known.AR_EH
                AR_ER -> Known.AR_ER
                AR_IL -> Known.AR_IL
                AR_IQ -> Known.AR_IQ
                AR_JO -> Known.AR_JO
                AR_KM -> Known.AR_KM
                AR_KW -> Known.AR_KW
                AR_LB -> Known.AR_LB
                AR_LY -> Known.AR_LY
                AR_MA -> Known.AR_MA
                AR_MR -> Known.AR_MR
                AR_OM -> Known.AR_OM
                AR_PS -> Known.AR_PS
                AR_QA -> Known.AR_QA
                AR_SA -> Known.AR_SA
                AR_SD -> Known.AR_SD
                AR_SO -> Known.AR_SO
                AR_SS -> Known.AR_SS
                AR_SY -> Known.AR_SY
                AR_TD -> Known.AR_TD
                AR_TN -> Known.AR_TN
                AR_YE -> Known.AR_YE
                AS -> Known.AS
                AS_IN -> Known.AS_IN
                ASA -> Known.ASA
                ASA_TZ -> Known.ASA_TZ
                AST -> Known.AST
                AST_ES -> Known.AST_ES
                AZ -> Known.AZ
                AZ_AZ -> Known.AZ_AZ
                BAS -> Known.BAS
                BAS_CM -> Known.BAS_CM
                BE -> Known.BE
                BE_BY -> Known.BE_BY
                BEM -> Known.BEM
                BEM_ZM -> Known.BEM_ZM
                BEZ -> Known.BEZ
                BEZ_TZ -> Known.BEZ_TZ
                BG -> Known.BG
                BG_BG -> Known.BG_BG
                BM -> Known.BM
                BM_ML -> Known.BM_ML
                BN -> Known.BN
                BN_BD -> Known.BN_BD
                BN_IN -> Known.BN_IN
                BO -> Known.BO
                BO_CN -> Known.BO_CN
                BO_IN -> Known.BO_IN
                BR -> Known.BR
                BR_FR -> Known.BR_FR
                BRX -> Known.BRX
                BRX_IN -> Known.BRX_IN
                BS -> Known.BS
                BS_BA -> Known.BS_BA
                CA -> Known.CA
                CA_AD -> Known.CA_AD
                CA_ES -> Known.CA_ES
                CA_FR -> Known.CA_FR
                CA_IT -> Known.CA_IT
                CCP -> Known.CCP
                CCP_BD -> Known.CCP_BD
                CCP_IN -> Known.CCP_IN
                CE -> Known.CE
                CE_RU -> Known.CE_RU
                CEB -> Known.CEB
                CEB_PH -> Known.CEB_PH
                CGG -> Known.CGG
                CGG_UG -> Known.CGG_UG
                CHR -> Known.CHR
                CHR_US -> Known.CHR_US
                CKB -> Known.CKB
                CKB_IQ -> Known.CKB_IQ
                CKB_IR -> Known.CKB_IR
                CS -> Known.CS
                CS_CZ -> Known.CS_CZ
                CU -> Known.CU
                CU_RU -> Known.CU_RU
                CY -> Known.CY
                CY_GB -> Known.CY_GB
                DA -> Known.DA
                DA_DK -> Known.DA_DK
                DA_GL -> Known.DA_GL
                DAV -> Known.DAV
                DAV_KE -> Known.DAV_KE
                DE -> Known.DE
                DE_AT -> Known.DE_AT
                DE_BE -> Known.DE_BE
                DE_CH -> Known.DE_CH
                DE_DE -> Known.DE_DE
                DE_GR -> Known.DE_GR
                DE_IT -> Known.DE_IT
                DE_LI -> Known.DE_LI
                DE_LU -> Known.DE_LU
                DJE -> Known.DJE
                DJE_NE -> Known.DJE_NE
                DOI -> Known.DOI
                DOI_IN -> Known.DOI_IN
                DSB -> Known.DSB
                DSB_DE -> Known.DSB_DE
                DUA -> Known.DUA
                DUA_CM -> Known.DUA_CM
                DYO -> Known.DYO
                DYO_SN -> Known.DYO_SN
                DZ -> Known.DZ
                DZ_BT -> Known.DZ_BT
                EBU -> Known.EBU
                EBU_KE -> Known.EBU_KE
                EE -> Known.EE
                EE_GH -> Known.EE_GH
                EE_TG -> Known.EE_TG
                EL -> Known.EL
                EL_CY -> Known.EL_CY
                EL_GR -> Known.EL_GR
                EN -> Known.EN
                EN_001 -> Known.EN_001
                EN_150 -> Known.EN_150
                EN_AE -> Known.EN_AE
                EN_AG -> Known.EN_AG
                EN_AI -> Known.EN_AI
                EN_AS -> Known.EN_AS
                EN_AT -> Known.EN_AT
                EN_AU -> Known.EN_AU
                EN_BB -> Known.EN_BB
                EN_BE -> Known.EN_BE
                EN_BI -> Known.EN_BI
                EN_BM -> Known.EN_BM
                EN_BS -> Known.EN_BS
                EN_BW -> Known.EN_BW
                EN_BZ -> Known.EN_BZ
                EN_CA -> Known.EN_CA
                EN_CC -> Known.EN_CC
                EN_CH -> Known.EN_CH
                EN_CK -> Known.EN_CK
                EN_CM -> Known.EN_CM
                EN_CN -> Known.EN_CN
                EN_CX -> Known.EN_CX
                EN_CY -> Known.EN_CY
                EN_DE -> Known.EN_DE
                EN_DG -> Known.EN_DG
                EN_DK -> Known.EN_DK
                EN_DM -> Known.EN_DM
                EN_ER -> Known.EN_ER
                EN_FI -> Known.EN_FI
                EN_FJ -> Known.EN_FJ
                EN_FK -> Known.EN_FK
                EN_FM -> Known.EN_FM
                EN_GB -> Known.EN_GB
                EN_GD -> Known.EN_GD
                EN_GG -> Known.EN_GG
                EN_GH -> Known.EN_GH
                EN_GI -> Known.EN_GI
                EN_GM -> Known.EN_GM
                EN_GU -> Known.EN_GU
                EN_GY -> Known.EN_GY
                EN_HK -> Known.EN_HK
                EN_IE -> Known.EN_IE
                EN_IL -> Known.EN_IL
                EN_IM -> Known.EN_IM
                EN_IN -> Known.EN_IN
                EN_IO -> Known.EN_IO
                EN_JE -> Known.EN_JE
                EN_JM -> Known.EN_JM
                EN_KE -> Known.EN_KE
                EN_KI -> Known.EN_KI
                EN_KN -> Known.EN_KN
                EN_KY -> Known.EN_KY
                EN_LC -> Known.EN_LC
                EN_LR -> Known.EN_LR
                EN_LS -> Known.EN_LS
                EN_LU -> Known.EN_LU
                EN_MG -> Known.EN_MG
                EN_MH -> Known.EN_MH
                EN_MO -> Known.EN_MO
                EN_MP -> Known.EN_MP
                EN_MS -> Known.EN_MS
                EN_MT -> Known.EN_MT
                EN_MU -> Known.EN_MU
                EN_MW -> Known.EN_MW
                EN_MX -> Known.EN_MX
                EN_MY -> Known.EN_MY
                EN_NA -> Known.EN_NA
                EN_NF -> Known.EN_NF
                EN_NG -> Known.EN_NG
                EN_NL -> Known.EN_NL
                EN_NR -> Known.EN_NR
                EN_NU -> Known.EN_NU
                EN_NZ -> Known.EN_NZ
                EN_PG -> Known.EN_PG
                EN_PH -> Known.EN_PH
                EN_PK -> Known.EN_PK
                EN_PN -> Known.EN_PN
                EN_PR -> Known.EN_PR
                EN_PW -> Known.EN_PW
                EN_RW -> Known.EN_RW
                EN_SB -> Known.EN_SB
                EN_SC -> Known.EN_SC
                EN_SD -> Known.EN_SD
                EN_SE -> Known.EN_SE
                EN_SG -> Known.EN_SG
                EN_SH -> Known.EN_SH
                EN_SI -> Known.EN_SI
                EN_SL -> Known.EN_SL
                EN_SS -> Known.EN_SS
                EN_SX -> Known.EN_SX
                EN_SZ -> Known.EN_SZ
                EN_TC -> Known.EN_TC
                EN_TK -> Known.EN_TK
                EN_TO -> Known.EN_TO
                EN_TT -> Known.EN_TT
                EN_TV -> Known.EN_TV
                EN_TZ -> Known.EN_TZ
                EN_UG -> Known.EN_UG
                EN_UM -> Known.EN_UM
                EN_US -> Known.EN_US
                EN_VC -> Known.EN_VC
                EN_VG -> Known.EN_VG
                EN_VI -> Known.EN_VI
                EN_VU -> Known.EN_VU
                EN_WS -> Known.EN_WS
                EN_ZA -> Known.EN_ZA
                EN_ZM -> Known.EN_ZM
                EN_ZW -> Known.EN_ZW
                EO -> Known.EO
                EO_001 -> Known.EO_001
                ES -> Known.ES
                ES_419 -> Known.ES_419
                ES_AR -> Known.ES_AR
                ES_BO -> Known.ES_BO
                ES_BR -> Known.ES_BR
                ES_BZ -> Known.ES_BZ
                ES_CL -> Known.ES_CL
                ES_CO -> Known.ES_CO
                ES_CR -> Known.ES_CR
                ES_CU -> Known.ES_CU
                ES_DO -> Known.ES_DO
                ES_EA -> Known.ES_EA
                ES_EC -> Known.ES_EC
                ES_ES -> Known.ES_ES
                ES_GQ -> Known.ES_GQ
                ES_GT -> Known.ES_GT
                ES_HN -> Known.ES_HN
                ES_IC -> Known.ES_IC
                ES_MX -> Known.ES_MX
                ES_NI -> Known.ES_NI
                ES_PA -> Known.ES_PA
                ES_PE -> Known.ES_PE
                ES_PH -> Known.ES_PH
                ES_PR -> Known.ES_PR
                ES_PY -> Known.ES_PY
                ES_SV -> Known.ES_SV
                ES_US -> Known.ES_US
                ES_UY -> Known.ES_UY
                ES_VE -> Known.ES_VE
                ET -> Known.ET
                ET_EE -> Known.ET_EE
                EU -> Known.EU
                EU_ES -> Known.EU_ES
                EWO -> Known.EWO
                EWO_CM -> Known.EWO_CM
                FA -> Known.FA
                FA_AF -> Known.FA_AF
                FA_IR -> Known.FA_IR
                FF -> Known.FF
                FF_BF -> Known.FF_BF
                FF_CM -> Known.FF_CM
                FF_GH -> Known.FF_GH
                FF_GM -> Known.FF_GM
                FF_GN -> Known.FF_GN
                FF_GW -> Known.FF_GW
                FF_LR -> Known.FF_LR
                FF_MR -> Known.FF_MR
                FF_NE -> Known.FF_NE
                FF_NG -> Known.FF_NG
                FF_SL -> Known.FF_SL
                FF_SN -> Known.FF_SN
                FI -> Known.FI
                FI_FI -> Known.FI_FI
                FIL -> Known.FIL
                FIL_PH -> Known.FIL_PH
                FO -> Known.FO
                FO_DK -> Known.FO_DK
                FO_FO -> Known.FO_FO
                FR -> Known.FR
                FR_BE -> Known.FR_BE
                FR_BF -> Known.FR_BF
                FR_BI -> Known.FR_BI
                FR_BJ -> Known.FR_BJ
                FR_BL -> Known.FR_BL
                FR_CA -> Known.FR_CA
                FR_CD -> Known.FR_CD
                FR_CF -> Known.FR_CF
                FR_CG -> Known.FR_CG
                FR_CH -> Known.FR_CH
                FR_CI -> Known.FR_CI
                FR_CM -> Known.FR_CM
                FR_DJ -> Known.FR_DJ
                FR_DZ -> Known.FR_DZ
                FR_FR -> Known.FR_FR
                FR_GA -> Known.FR_GA
                FR_GF -> Known.FR_GF
                FR_GN -> Known.FR_GN
                FR_GP -> Known.FR_GP
                FR_GQ -> Known.FR_GQ
                FR_HT -> Known.FR_HT
                FR_KM -> Known.FR_KM
                FR_LU -> Known.FR_LU
                FR_MA -> Known.FR_MA
                FR_MC -> Known.FR_MC
                FR_MF -> Known.FR_MF
                FR_MG -> Known.FR_MG
                FR_ML -> Known.FR_ML
                FR_MQ -> Known.FR_MQ
                FR_MR -> Known.FR_MR
                FR_MU -> Known.FR_MU
                FR_NC -> Known.FR_NC
                FR_NE -> Known.FR_NE
                FR_PF -> Known.FR_PF
                FR_PM -> Known.FR_PM
                FR_RE -> Known.FR_RE
                FR_RW -> Known.FR_RW
                FR_SC -> Known.FR_SC
                FR_SN -> Known.FR_SN
                FR_SY -> Known.FR_SY
                FR_TD -> Known.FR_TD
                FR_TG -> Known.FR_TG
                FR_TN -> Known.FR_TN
                FR_VU -> Known.FR_VU
                FR_WF -> Known.FR_WF
                FR_YT -> Known.FR_YT
                FUR -> Known.FUR
                FUR_IT -> Known.FUR_IT
                FY -> Known.FY
                FY_NL -> Known.FY_NL
                GA -> Known.GA
                GA_GB -> Known.GA_GB
                GA_IE -> Known.GA_IE
                GD -> Known.GD
                GD_GB -> Known.GD_GB
                GL -> Known.GL
                GL_ES -> Known.GL_ES
                GSW -> Known.GSW
                GSW_CH -> Known.GSW_CH
                GSW_FR -> Known.GSW_FR
                GSW_LI -> Known.GSW_LI
                GU -> Known.GU
                GU_IN -> Known.GU_IN
                GUZ -> Known.GUZ
                GUZ_KE -> Known.GUZ_KE
                GV -> Known.GV
                GV_IM -> Known.GV_IM
                HA -> Known.HA
                HA_GH -> Known.HA_GH
                HA_NE -> Known.HA_NE
                HA_NG -> Known.HA_NG
                HAW -> Known.HAW
                HAW_US -> Known.HAW_US
                HE -> Known.HE
                HI -> Known.HI
                HI_IN -> Known.HI_IN
                HR -> Known.HR
                HR_BA -> Known.HR_BA
                HR_HR -> Known.HR_HR
                HSB -> Known.HSB
                HSB_DE -> Known.HSB_DE
                HU -> Known.HU
                HU_HU -> Known.HU_HU
                HY -> Known.HY
                HY_AM -> Known.HY_AM
                IA -> Known.IA
                IA_001 -> Known.IA_001
                ID -> Known.ID
                IG -> Known.IG
                IG_NG -> Known.IG_NG
                II -> Known.II
                II_CN -> Known.II_CN
                ID_ID -> Known.ID_ID
                IS -> Known.IS
                IS_IS -> Known.IS_IS
                IT -> Known.IT
                IT_CH -> Known.IT_CH
                IT_IT -> Known.IT_IT
                IT_SM -> Known.IT_SM
                IT_VA -> Known.IT_VA
                HE_IL -> Known.HE_IL
                JA -> Known.JA
                JA_JP -> Known.JA_JP
                JGO -> Known.JGO
                JGO_CM -> Known.JGO_CM
                YI -> Known.YI
                YI_001 -> Known.YI_001
                JMC -> Known.JMC
                JMC_TZ -> Known.JMC_TZ
                JV -> Known.JV
                JV_ID -> Known.JV_ID
                KA -> Known.KA
                KA_GE -> Known.KA_GE
                KAB -> Known.KAB
                KAB_DZ -> Known.KAB_DZ
                KAM -> Known.KAM
                KAM_KE -> Known.KAM_KE
                KDE -> Known.KDE
                KDE_TZ -> Known.KDE_TZ
                KEA -> Known.KEA
                KEA_CV -> Known.KEA_CV
                KHQ -> Known.KHQ
                KHQ_ML -> Known.KHQ_ML
                KI -> Known.KI
                KI_KE -> Known.KI_KE
                KK -> Known.KK
                KK_KZ -> Known.KK_KZ
                KKJ -> Known.KKJ
                KKJ_CM -> Known.KKJ_CM
                KL -> Known.KL
                KL_GL -> Known.KL_GL
                KLN -> Known.KLN
                KLN_KE -> Known.KLN_KE
                KM -> Known.KM
                KM_KH -> Known.KM_KH
                KN -> Known.KN
                KN_IN -> Known.KN_IN
                KO -> Known.KO
                KO_KP -> Known.KO_KP
                KO_KR -> Known.KO_KR
                KOK -> Known.KOK
                KOK_IN -> Known.KOK_IN
                KS -> Known.KS
                KS_IN -> Known.KS_IN
                KSB -> Known.KSB
                KSB_TZ -> Known.KSB_TZ
                KSF -> Known.KSF
                KSF_CM -> Known.KSF_CM
                KSH -> Known.KSH
                KSH_DE -> Known.KSH_DE
                KW -> Known.KW
                KW_GB -> Known.KW_GB
                KU -> Known.KU
                KU_TR -> Known.KU_TR
                KY -> Known.KY
                KY_KG -> Known.KY_KG
                LAG -> Known.LAG
                LAG_TZ -> Known.LAG_TZ
                LB -> Known.LB
                LB_LU -> Known.LB_LU
                LG -> Known.LG
                LG_UG -> Known.LG_UG
                LKT -> Known.LKT
                LKT_US -> Known.LKT_US
                LN -> Known.LN
                LN_AO -> Known.LN_AO
                LN_CD -> Known.LN_CD
                LN_CF -> Known.LN_CF
                LN_CG -> Known.LN_CG
                LO -> Known.LO
                LO_LA -> Known.LO_LA
                LRC -> Known.LRC
                LRC_IQ -> Known.LRC_IQ
                LRC_IR -> Known.LRC_IR
                LT -> Known.LT
                LT_LT -> Known.LT_LT
                LU -> Known.LU
                LU_CD -> Known.LU_CD
                LUO -> Known.LUO
                LUO_KE -> Known.LUO_KE
                LUY -> Known.LUY
                LUY_KE -> Known.LUY_KE
                LV -> Known.LV
                LV_LV -> Known.LV_LV
                MAI -> Known.MAI
                MAI_IN -> Known.MAI_IN
                MAS -> Known.MAS
                MAS_KE -> Known.MAS_KE
                MAS_TZ -> Known.MAS_TZ
                MER -> Known.MER
                MER_KE -> Known.MER_KE
                MFE -> Known.MFE
                MFE_MU -> Known.MFE_MU
                MG -> Known.MG
                MG_MG -> Known.MG_MG
                MGH -> Known.MGH
                MGH_MZ -> Known.MGH_MZ
                MGO -> Known.MGO
                MGO_CM -> Known.MGO_CM
                MI -> Known.MI
                MI_NZ -> Known.MI_NZ
                MK -> Known.MK
                MK_MK -> Known.MK_MK
                ML -> Known.ML
                ML_IN -> Known.ML_IN
                MN -> Known.MN
                MN_MN -> Known.MN_MN
                MNI -> Known.MNI
                MNI_IN -> Known.MNI_IN
                MR -> Known.MR
                MR_IN -> Known.MR_IN
                MS -> Known.MS
                MS_BN -> Known.MS_BN
                MS_ID -> Known.MS_ID
                MS_MY -> Known.MS_MY
                MS_SG -> Known.MS_SG
                MT -> Known.MT
                MT_MT -> Known.MT_MT
                MUA -> Known.MUA
                MUA_CM -> Known.MUA_CM
                MY -> Known.MY
                MY_MM -> Known.MY_MM
                MZN -> Known.MZN
                MZN_IR -> Known.MZN_IR
                NAQ -> Known.NAQ
                NAQ_NA -> Known.NAQ_NA
                NB -> Known.NB
                NB_NO -> Known.NB_NO
                NB_SJ -> Known.NB_SJ
                ND -> Known.ND
                ND_ZW -> Known.ND_ZW
                NDS -> Known.NDS
                NDS_DE -> Known.NDS_DE
                NDS_NL -> Known.NDS_NL
                NE -> Known.NE
                NE_IN -> Known.NE_IN
                NE_NP -> Known.NE_NP
                NL -> Known.NL
                NL_AW -> Known.NL_AW
                NL_BE -> Known.NL_BE
                NL_CH -> Known.NL_CH
                NL_BQ -> Known.NL_BQ
                NL_CW -> Known.NL_CW
                NL_LU -> Known.NL_LU
                NL_NL -> Known.NL_NL
                NL_SR -> Known.NL_SR
                NL_SX -> Known.NL_SX
                NMG -> Known.NMG
                NMG_CM -> Known.NMG_CM
                NN -> Known.NN
                NN_NO -> Known.NN_NO
                NNH -> Known.NNH
                NNH_CM -> Known.NNH_CM
                NO -> Known.NO
                NO_NO -> Known.NO_NO
                NUS -> Known.NUS
                NUS_SS -> Known.NUS_SS
                NYN -> Known.NYN
                NYN_UG -> Known.NYN_UG
                OM -> Known.OM
                OM_ET -> Known.OM_ET
                OM_KE -> Known.OM_KE
                OR -> Known.OR
                OR_IN -> Known.OR_IN
                OS -> Known.OS
                OS_GE -> Known.OS_GE
                OS_RU -> Known.OS_RU
                PA -> Known.PA
                PA_IN -> Known.PA_IN
                PA_PK -> Known.PA_PK
                PCM -> Known.PCM
                PCM_NG -> Known.PCM_NG
                PL -> Known.PL
                PL_PL -> Known.PL_PL
                PRG -> Known.PRG
                PRG_001 -> Known.PRG_001
                PS -> Known.PS
                PS_AF -> Known.PS_AF
                PS_PK -> Known.PS_PK
                PT -> Known.PT
                PT_AO -> Known.PT_AO
                PT_BR -> Known.PT_BR
                PT_CH -> Known.PT_CH
                PT_CV -> Known.PT_CV
                PT_GQ -> Known.PT_GQ
                PT_GW -> Known.PT_GW
                PT_LU -> Known.PT_LU
                PT_MO -> Known.PT_MO
                PT_MZ -> Known.PT_MZ
                PT_PT -> Known.PT_PT
                PT_ST -> Known.PT_ST
                PT_TL -> Known.PT_TL
                QU -> Known.QU
                QU_BO -> Known.QU_BO
                QU_EC -> Known.QU_EC
                QU_PE -> Known.QU_PE
                RM -> Known.RM
                RM_CH -> Known.RM_CH
                RN -> Known.RN
                RN_BI -> Known.RN_BI
                RO -> Known.RO
                RO_MD -> Known.RO_MD
                RO_RO -> Known.RO_RO
                ROF -> Known.ROF
                ROF_TZ -> Known.ROF_TZ
                RU -> Known.RU
                RU_BY -> Known.RU_BY
                RU_KG -> Known.RU_KG
                RU_KZ -> Known.RU_KZ
                RU_MD -> Known.RU_MD
                RU_RU -> Known.RU_RU
                RU_UA -> Known.RU_UA
                RW -> Known.RW
                RW_RW -> Known.RW_RW
                RWK -> Known.RWK
                RWK_TZ -> Known.RWK_TZ
                SA -> Known.SA
                SA_IN -> Known.SA_IN
                SAH -> Known.SAH
                SAH_RU -> Known.SAH_RU
                SAQ -> Known.SAQ
                SAQ_KE -> Known.SAQ_KE
                SAT -> Known.SAT
                SAT_IN -> Known.SAT_IN
                SBP -> Known.SBP
                SBP_TZ -> Known.SBP_TZ
                SD -> Known.SD
                SD_IN -> Known.SD_IN
                SD_PK -> Known.SD_PK
                SE -> Known.SE
                SE_FI -> Known.SE_FI
                SE_NO -> Known.SE_NO
                SE_SE -> Known.SE_SE
                SEH -> Known.SEH
                SEH_MZ -> Known.SEH_MZ
                SES -> Known.SES
                SES_ML -> Known.SES_ML
                SG -> Known.SG
                SG_CF -> Known.SG_CF
                SHI -> Known.SHI
                SHI_MA -> Known.SHI_MA
                SI -> Known.SI
                SI_LK -> Known.SI_LK
                SK -> Known.SK
                SK_SK -> Known.SK_SK
                SL -> Known.SL
                SL_SI -> Known.SL_SI
                SMN -> Known.SMN
                SMN_FI -> Known.SMN_FI
                SN -> Known.SN
                SN_ZW -> Known.SN_ZW
                SO -> Known.SO
                SO_DJ -> Known.SO_DJ
                SO_ET -> Known.SO_ET
                SO_KE -> Known.SO_KE
                SO_SO -> Known.SO_SO
                SQ -> Known.SQ
                SQ_AL -> Known.SQ_AL
                SQ_MK -> Known.SQ_MK
                SQ_XK -> Known.SQ_XK
                SR -> Known.SR
                SR_BA -> Known.SR_BA
                SR_CS -> Known.SR_CS
                SR_ME -> Known.SR_ME
                SR_RS -> Known.SR_RS
                SR_XK -> Known.SR_XK
                SU -> Known.SU
                SU_ID -> Known.SU_ID
                SV -> Known.SV
                SV_AX -> Known.SV_AX
                SV_FI -> Known.SV_FI
                SV_SE -> Known.SV_SE
                SW -> Known.SW
                SW_CD -> Known.SW_CD
                SW_KE -> Known.SW_KE
                SW_TZ -> Known.SW_TZ
                SW_UG -> Known.SW_UG
                SY -> Known.SY
                TA -> Known.TA
                TA_IN -> Known.TA_IN
                TA_LK -> Known.TA_LK
                TA_MY -> Known.TA_MY
                TA_SG -> Known.TA_SG
                TE -> Known.TE
                TE_IN -> Known.TE_IN
                TEO -> Known.TEO
                TEO_KE -> Known.TEO_KE
                TEO_UG -> Known.TEO_UG
                TG -> Known.TG
                TG_TJ -> Known.TG_TJ
                TH -> Known.TH
                TH_TH -> Known.TH_TH
                TI -> Known.TI
                TI_ER -> Known.TI_ER
                TI_ET -> Known.TI_ET
                TK -> Known.TK
                TK_TM -> Known.TK_TM
                TL -> Known.TL
                TO -> Known.TO
                TO_TO -> Known.TO_TO
                TR -> Known.TR
                TR_CY -> Known.TR_CY
                TR_TR -> Known.TR_TR
                TT -> Known.TT
                TT_RU -> Known.TT_RU
                TWQ -> Known.TWQ
                TWQ_NE -> Known.TWQ_NE
                TZM -> Known.TZM
                TZM_MA -> Known.TZM_MA
                UG -> Known.UG
                UG_CN -> Known.UG_CN
                UK -> Known.UK
                UK_UA -> Known.UK_UA
                UR -> Known.UR
                UR_IN -> Known.UR_IN
                UR_PK -> Known.UR_PK
                UZ -> Known.UZ
                UZ_AF -> Known.UZ_AF
                UZ_UZ -> Known.UZ_UZ
                VAI -> Known.VAI
                VAI_LR -> Known.VAI_LR
                VI -> Known.VI
                VI_VN -> Known.VI_VN
                VO -> Known.VO
                VO_001 -> Known.VO_001
                VUN -> Known.VUN
                VUN_TZ -> Known.VUN_TZ
                WAE -> Known.WAE
                WAE_CH -> Known.WAE_CH
                WO -> Known.WO
                WO_SN -> Known.WO_SN
                XH -> Known.XH
                XH_ZA -> Known.XH_ZA
                XOG -> Known.XOG
                XOG_UG -> Known.XOG_UG
                YAV -> Known.YAV
                YAV_CM -> Known.YAV_CM
                YO -> Known.YO
                YO_BJ -> Known.YO_BJ
                YO_NG -> Known.YO_NG
                YUE -> Known.YUE
                YUE_CN -> Known.YUE_CN
                YUE_HK -> Known.YUE_HK
                ZGH -> Known.ZGH
                ZGH_MA -> Known.ZGH_MA
                ZH -> Known.ZH
                ZH_CN -> Known.ZH_CN
                ZH_HK -> Known.ZH_HK
                ZH_MO -> Known.ZH_MO
                ZH_SG -> Known.ZH_SG
                ZH_TW -> Known.ZH_TW
                ZH_HANS -> Known.ZH_HANS
                ZH_HANT -> Known.ZH_HANT
                ZU -> Known.ZU
                ZU_ZA -> Known.ZU_ZA
                else -> throw HubspotInvalidDataException("Unknown Language: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws HubspotInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { HubspotInvalidDataException("Value is not a String") }

        private var validated: Boolean = false

        fun validate(): Language = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: HubspotInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Language && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Specifies the length of the search results. Can be set to `LONG` or `SHORT`. `SHORT` will
     * return the first 128 characters of the content's meta description. `LONG` will build a more
     * detailed content snippet based on the html/content of the page.
     */
    class Length @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val SHORT = of("SHORT")

            @JvmField val LONG = of("LONG")

            @JvmStatic fun of(value: String) = Length(JsonField.of(value))
        }

        /** An enum containing [Length]'s known values. */
        enum class Known {
            SHORT,
            LONG,
        }

        /**
         * An enum containing [Length]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Length] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            SHORT,
            LONG,
            /** An enum member indicating that [Length] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                SHORT -> Value.SHORT
                LONG -> Value.LONG
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws HubspotInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                SHORT -> Known.SHORT
                LONG -> Known.LONG
                else -> throw HubspotInvalidDataException("Unknown Length: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws HubspotInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { HubspotInvalidDataException("Value is not a String") }

        private var validated: Boolean = false

        fun validate(): Length = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: HubspotInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Length && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val LANDING_PAGE = of("LANDING_PAGE")

            @JvmField val BLOG_POST = of("BLOG_POST")

            @JvmField val SITE_PAGE = of("SITE_PAGE")

            @JvmField val KNOWLEDGE_ARTICLE = of("KNOWLEDGE_ARTICLE")

            @JvmField val LISTING_PAGE = of("LISTING_PAGE")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            LANDING_PAGE,
            BLOG_POST,
            SITE_PAGE,
            KNOWLEDGE_ARTICLE,
            LISTING_PAGE,
        }

        /**
         * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Type] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            LANDING_PAGE,
            BLOG_POST,
            SITE_PAGE,
            KNOWLEDGE_ARTICLE,
            LISTING_PAGE,
            /** An enum member indicating that [Type] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                LANDING_PAGE -> Value.LANDING_PAGE
                BLOG_POST -> Value.BLOG_POST
                SITE_PAGE -> Value.SITE_PAGE
                KNOWLEDGE_ARTICLE -> Value.KNOWLEDGE_ARTICLE
                LISTING_PAGE -> Value.LISTING_PAGE
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws HubspotInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                LANDING_PAGE -> Known.LANDING_PAGE
                BLOG_POST -> Known.BLOG_POST
                SITE_PAGE -> Known.SITE_PAGE
                KNOWLEDGE_ARTICLE -> Known.KNOWLEDGE_ARTICLE
                LISTING_PAGE -> Known.LISTING_PAGE
                else -> throw HubspotInvalidDataException("Unknown Type: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws HubspotInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { HubspotInvalidDataException("Value is not a String") }

        private var validated: Boolean = false

        fun validate(): Type = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: HubspotInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Type && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SiteSearchSearchParams &&
            autocomplete == other.autocomplete &&
            boostLimit == other.boostLimit &&
            boostRecent == other.boostRecent &&
            domain == other.domain &&
            groupId == other.groupId &&
            hubdbQuery == other.hubdbQuery &&
            language == other.language &&
            length == other.length &&
            limit == other.limit &&
            matchPrefix == other.matchPrefix &&
            offset == other.offset &&
            pathPrefix == other.pathPrefix &&
            popularityBoost == other.popularityBoost &&
            property == other.property &&
            q == other.q &&
            tableId == other.tableId &&
            type == other.type &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            autocomplete,
            boostLimit,
            boostRecent,
            domain,
            groupId,
            hubdbQuery,
            language,
            length,
            limit,
            matchPrefix,
            offset,
            pathPrefix,
            popularityBoost,
            property,
            q,
            tableId,
            type,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "SiteSearchSearchParams{autocomplete=$autocomplete, boostLimit=$boostLimit, boostRecent=$boostRecent, domain=$domain, groupId=$groupId, hubdbQuery=$hubdbQuery, language=$language, length=$length, limit=$limit, matchPrefix=$matchPrefix, offset=$offset, pathPrefix=$pathPrefix, popularityBoost=$popularityBoost, property=$property, q=$q, tableId=$tableId, type=$type, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
